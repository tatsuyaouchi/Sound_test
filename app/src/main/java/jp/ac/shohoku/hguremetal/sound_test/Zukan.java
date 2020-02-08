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

    int ocrResult;
    int MAX_MONSTER = 10;
    int[] imageviewId = new int[]{
            R.id.imageView0, R.id.imageView1, R.id.imageView2, R.id.imageView3,
            R.id.imageView4, R.id.imageView5, R.id.imageView6, R.id.imageView7, R.id.imageView8,
            R.id.imageView9
    };

    ImageView[] tapview = new ImageView[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zukan);

        for (int i = 0; i < 10; i++) {
            tapview[i] = (ImageView) this.findViewById(imageviewId[i]);
            tapview[i].setOnClickListener(this);
        }


//         OCRで読み取った文字列の受取
//        Intent intentOcrResult = getIntent();
//        ocrResult = intentOcrResult.getIntExtra("EXTRA_OCR_RESULT2", MAX_MONSTER);
//        Zukan();

//        Ocr ocrResult2 = new (Ocr)getIntent().getSerializableExtra("");
//        String name = ocrResult2.getResult();
    }

//
//    public void Zukan() {
//
//        if(ocrResult != 0) {
//            switch (ocrResult) {
//                case 0:
//                    ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.mon0);
//                    break;
//                case 1:
//                    ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.mon1);
//                    break;
//                case 2:
//                    ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.mon2);
//                    break;
//                case 3:
//                    ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.mon3);
//                    break;
//                case 4:
//                    ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.mon4);
//                    break;
//                case 5:
//                    ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.mon5);
//                    break;
//                case 6:
//                    ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.mon6);
//                    break;
//                case 7:
//                    ((ImageView) findViewById(R.id.imageView7)).setImageResource(R.drawable.mon7);
//                    break;
//                case 8:
//                    ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.mon8);
//                    break;
//                case 9:
//                    ((ImageView) findViewById(R.id.imageView9)).setImageResource(R.drawable.mon9);
//                    break;
//
//            }
//        }
//    }

    @Override
    public void onClick(View v) {


//        if(ocrResult > 0 && ocrResult < 10){
        switch (v.getId()) {
            case R.id.imageView0:
//                    if (ocrResult == 0) {
                ImageView iv0 = new ImageView(Zukan.this);
                iv0.setImageResource(R.drawable.mon0);
                iv0.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("なめろう")
                        .setMessage("ひとの顔を舐めまわすぞ！！！！")
                        .setView(iv0)
                        .show();
                break;
//            }
            case R.id.imageView1:
                ImageView iv1 = new ImageView(Zukan.this);
                iv1.setImageResource(R.drawable.mon1);
                iv1.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("こどもどらごん")
                        .setMessage("成長すると、かっこいいドラゴンになるぞ！！！！")
                        .setView(iv1)
                        .show();
                break;
            case R.id.imageView2:
                ImageView iv2 = new ImageView(Zukan.this);
                iv2.setImageResource(R.drawable.mon2);
                iv2.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("きんぐかまきり")
                        .setMessage("全長2mもあるぞ！！！！")
                        .setView(iv2)
                        .show();
                break;
            case R.id.imageView3:
                ImageView iv3 = new ImageView(Zukan.this);
                iv3.setImageResource(R.drawable.mon3);
                iv3.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("きらーあっくす")
                        .setMessage("とても凶暴だぞ！！！！")
                        .setView(iv3)
                        .show();
                break;
            case R.id.imageView4:
                ImageView iv4 = new ImageView(Zukan.this);
                iv4.setImageResource(R.drawable.mon4);
                iv4.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("Gorbachev")
                        .setMessage("ゴルフが趣味だぞ！！！！")
                        .setView(iv4)
                        .show();
                break;
            case R.id.imageView5:
                ImageView iv5 = new ImageView(Zukan.this);
                iv5.setImageResource(R.drawable.mon5);
                iv5.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("らいむ")
                        .setMessage("手には、人の血がついているぞ！！！！")
                        .setView(iv5)
                        .show();
                break;
            case R.id.imageView6:
                ImageView iv6 = new ImageView(Zukan.this);
                iv6.setImageResource(R.drawable.mon6);
                iv6.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("ぶっち↑！！！！")
                        .setMessage("お菓子に間違えられて、食べられてしまうことがあるぞ！！！！")
                        .setView(iv6)
                        .show();
                break;
            case R.id.imageView7:
                ImageView iv7 = new ImageView(Zukan.this);
                iv7.setImageResource(R.drawable.mon7);
                iv7.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("れっどあい")
                        .setMessage("しかし目は黒だぞ！！！！")
                        .setView(iv7)
                        .show();
                break;
            case R.id.imageView8:
                ImageView iv8 = new ImageView(Zukan.this);
                iv8.setImageResource(R.drawable.mon8);
                iv8.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("")
                        .setMessage("頭の触覚で催眠術をかけてくるぞ！！！！")
                        .setView(iv8)
                        .show();
                break;
            case R.id.imageView9:
                ImageView iv9 = new ImageView(Zukan.this);
                iv9.setImageResource(R.drawable.mon9);
                iv9.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setTitle("さんふらいおん")
                        .setMessage("冬になると顔の周りが枯れ落ちるぞ！！！！")
                        .setView(iv9)
                        .show();
                break;

        }


    }
}





//                if(ocrResult != 0) {
//                    switch (ocrResult) {
//                        case 0:
//                            if (ocrResult == 0) {
//                            ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.mon0);
//                            break;}
//                        case 1:
//                            if (ocrResult == 1) {
//                            ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.mon1);
//                            break;}
//                        case 2:
//                            if (ocrResult == 2) {
//                            ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.mon2);
//                            break;}
//                        case 3:
//                            if (ocrResult == 3) {
//                            ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.mon3);
//                            break;}
//                        case 4:
//                            if (ocrResult == 4) {
//                            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.mon4);
//                            break;}
//                        case 5:
//                            if (ocrResult == 5) {
//                            ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.mon5);
//                            break;}
//                        case 6:
//                            if (ocrResult == 6) {
//                            ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.mon6);
//                            break;}
//                        case 7:
//                            if (ocrResult == 7) {
//                            ((ImageView) findViewById(R.id.imageView7)).setImageResource(R.drawable.mon7);
//                            break;}
//                        case 8:
//                            if (ocrResult == 8) {
//                            ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.mon8);
//                            break;}
//                        case 9:
//                            if (ocrResult == 9) {
//                            ((ImageView) findViewById(R.id.imageView9)).setImageResource(R.drawable.mon9);
//                            break;}
//
//                    }
//                }

//    }







