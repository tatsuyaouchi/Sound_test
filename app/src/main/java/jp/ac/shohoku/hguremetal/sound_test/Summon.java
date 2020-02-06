package jp.ac.shohoku.hguremetal.sound_test;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import java.io.InputStream;

public class Summon extends AppCompatActivity {
    private int ocrResult;
    private DialogFragment dialogFragment;
    private FragmentManager fragmentManager;
    // T -> 召喚済み F -> 未召喚
    public boolean fm0, fm1, fm2, fm3, fm4, fm5, fm6, fm7, fm8, fm9 = false;
    static final int MAX_MONSTER = 10;  // 実装するモンスターの数


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summon);  // 記述必須：どのレイアウトを使うのか指定

        // OCRで読み取った文字列の受取
        // 文字列を数値(int)に変換する
        Intent intentOcrResult = getIntent();
        ocrResult = Integer.parseInt(intentOcrResult.getStringExtra("EXTRA_OCR_RESULT"));

        summon();
    }

    // 読み取った数字に応じて召喚するモンスターの決定
    // 対応するモンスターの画像表示
    public void summon(){
        ImageView iv = findViewById(R.id.image_view);
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

    public class AlertDialogFragment extends DialogFragment {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());

            alert.setTitle("警告");
            alert.setMessage("召喚に失敗しました");

            return alert.create();
        }

        @Override
        public void onPause() {
            super.onPause();

            // onPause でダイアログを閉じる場合
            dismiss();
        }
    }
}
