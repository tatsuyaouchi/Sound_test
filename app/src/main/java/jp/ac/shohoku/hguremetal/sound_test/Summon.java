package jp.ac.shohoku.hguremetal.sound_test;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import java.io.InputStream;

public class Summon extends AppCompatActivity implements View.OnClickListener{
    private int ocrResult;
    int ocrResult2;
    static final int MAX_MONSTER = 10;  // 実装するモンスターの数


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summon);  // 記述必須：どのレイアウトを使うのか指定

        findViewById(R.id.homehe).setOnClickListener(this);
        findViewById(R.id.zukanhe).setOnClickListener(this);


        // OCRで読み取った文字列の受取
        // 文字列を数値(int)に変換する

        Intent intentOcrResult = getIntent();
        ocrResult = Integer.parseInt(intentOcrResult.getStringExtra("EXTRA_OCR_RESULT"));

        summon();




    }

    // 読み取った数字に応じて召喚するモンスターの決定
    // 対応するモンスターの画像表示
    public void summon(){
        ImageView iv = findViewById(R.id.image_View);
        AssetManager assets = getResources().getAssets();

        if(0 <= ocrResult && ocrResult < MAX_MONSTER) { // 対応するモンスターの画像表示
            try (InputStream iStream = assets.open("mon" + ocrResult + ".png")) {
                Bitmap bitmap = BitmapFactory.decodeStream(iStream);
                iv.setImageBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else { // 正しく読み取れなかった場合は「召喚失敗」を表示
            try (InputStream iStream = assets.open("failed_summon.png")) {
                Bitmap bitmap = BitmapFactory.decodeStream(iStream);
                iv.setImageBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.homehe:
                Intent intentOcrResult3 = new Intent(getApplication(), Home.class);
                intentOcrResult3.putExtra("EXTRA_OCR_RESULT3", ocrResult);
                startActivity(intentOcrResult3);
                break;
            case R.id.zukanhe:
                Intent intentOcrResult2 = new Intent(getApplication(), Zukan.class);
                startActivity(intentOcrResult2);
                break;
        }




    }
}
//
