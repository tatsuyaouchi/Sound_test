package jp.ac.shohoku.hguremetal.sound_test;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;

public class Summon extends AppCompatActivity implements View.OnClickListener {
    private int ocrResult;
    static final int MAX_MONSTER = 10;  // 実装するモンスターの数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summon);  // 記述必須：どのレイアウトを使うのか指定

        findViewById(R.id.homehe).setOnClickListener(this);

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
        Intent intentOcrResult = new Intent(getApplication(), Home.class);
        intentOcrResult.putExtra("EXTRA_OCR_RESULT2", ocrResult);
        startActivity(intentOcrResult);
    }
}
