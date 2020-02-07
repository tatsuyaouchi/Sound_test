package jp.ac.shohoku.hguremetal.sound_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import java.io.InputStream;

public class Zukan extends AppCompatActivity implements View.OnClickListener {

    int ocrResult2;
    int MAX_MONSTER = 10;
    int[] imageviewId = new int[]{
        R.id.imageView0, R.id.imageView1, R.id.imageView2, R.id.imageView3,
        R.id.imageView4, R.id.imageView5, R.id.imageView6, R.id.imageView7, R.id.imageView8
    };

    ImageView[] tapview = new ImageView[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zukan);

//         OCRで読み取った文字列の受取
        Intent intentOcrResult2 = getIntent();
        ocrResult2 = intentOcrResult2.getIntExtra("EXTRA_OCR_RESULT2", MAX_MONSTER);
        Zukan();

//        Ocr ocrResult2 = new (Ocr)getIntent().getSerializableExtra("");
//        String name = ocrResult2.getResult();

        for (int i = 0; i < 9; i++) {
            tapview[i] = (ImageView)this.findViewById(imageviewId[i]);
            tapview[i].setOnClickListener(this);
        }

//        // OCRで読み取った文字列の受取
//        // 文字列を数値(int)に変換する
//        Intent intentOcrResult2 = getIntent();
//        ocrRexult2 = Integer.parseInt(intentOcrResult2.getStringExtra("EXTRA_OCR_RESULT"));
//        Zukan();


    }

    public void Zukan() {
////
//////        if(ocrResult2 != 0) {
//////            switch (ocrResult2) {
//////                case 1:
//////                    ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.mon0);
//////                    break;
//////                case 2:
//////                    ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.mon1);
//////                    break;
//////                case 3:
//////                    ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.mon2);
//////                    break;
//////                case 4:
//////                    ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.mon3);
//////                    break;
//////                case 5:
//////                    ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.mon4);
//////                    break;
//////                case 6:
//////                    ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.mon5);
//////                    break;
//////                case 7:
//////                    ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.mon6);
//////                    break;
//////                case 8:
//////                    ((ImageView) findViewById(R.id.imageView7)).setImageResource(R.drawable.mon7);
//////                    break;
//////                case 9:
//////                    ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.mon8);
//////                    break;
////////////                case 10:
////////////                    ((ImageView) findViewById(R.id.imageView9)).setImageResource(R.drawable.mon9);
////////////                    break;
//////////
//////            }
////        }



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView0:
            case R.id.imageView6:
            case R.id.imageView1:
            case R.id.imageView2:
            case R.id.imageView3:
            case R.id.imageView4:
            case R.id.imageView8:
            case R.id.imageView7:
            case R.id.imageView5:
                ImageView iv9 = new ImageView(Zukan.this);
                iv9.setImageResource(R.drawable.hatena);
                iv9.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setView(iv9)
                        .show();
                break;
            //            case R.id.imageView9:
//                ImageView iv9 = new ImageView(Zukan.this);
//                iv9.setImageResource(R.drawable.mon8);
//                iv9.setAdjustViewBounds(true);
//                new AlertDialog.Builder(Zukan.this)
//                        .setView(iv9)
//                        .show();
//                break;



        }
    }
}







