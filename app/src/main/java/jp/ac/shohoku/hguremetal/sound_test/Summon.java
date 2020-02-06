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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summon);  // 記述必須：どのレイアウトを使うのか指定

        // OCRで読み取った文字列の受取
        // 文字列を数値に変換する
        Intent intentOcrResult = getIntent();
        ocrResult = Integer.parseInt(intentOcrResult.getStringExtra("EXTRA_OCR_RESULT"));

        summon();
    }

    // 読み取った数字に応じて召喚するモンスターの決定
    // 対応するモンスターの画像表示
    public void summon(){
        ImageView iv = findViewById(R.id.image_view);
        AssetManager assets = getResources().getAssets();

        switch(ocrResult) {
            case 0:
                fm0 = true;
                try (InputStream istream0 = assets.open("monster0.png")){
                    Bitmap bitmap0 = BitmapFactory.decodeStream(istream0);
                    iv.setImageBitmap(bitmap0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 1:
                fm1 = true;
                try (InputStream istream1 = assets.open("monster1.png")){
                    Bitmap bitmap1 = BitmapFactory.decodeStream(istream1);
                    iv.setImageBitmap(bitmap1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                fm2 = true;
                try (InputStream istream = assets.open("monster2.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                fm3 = true;
                try (InputStream istream = assets.open("monster3.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                fm4 = true;
                try (InputStream istream = assets.open("monster4.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                fm5 = true;
                try (InputStream istream = assets.open("monster5.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 6:
                fm6 = true;
                try (InputStream istream = assets.open("monster6.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 7:
                fm7 = true;
                try (InputStream istream = assets.open("monster7.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 8:
                fm8 = true;
                try (InputStream istream = assets.open("monster8.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 9:
                fm9 = true;
                try (InputStream istream = assets.open("monster9.png")){
                    Bitmap bitmap = BitmapFactory.decodeStream(istream);
                    iv.setImageBitmap(bitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                fragmentManager = getSupportFragmentManager();
                dialogFragment = new AlertDialogFragment();
                dialogFragment.show(fragmentManager, "alert dialog");
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
