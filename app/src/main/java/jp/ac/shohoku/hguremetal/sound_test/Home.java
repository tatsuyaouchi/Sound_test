package jp.ac.shohoku.hguremetal.sound_test;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        findViewById(R.id.button3).setOnClickListener(this);

        findViewById(R.id.ocr_button).setOnClickListener(this);


//        imageView = findViewById(R.id.imageView); // 撮った画像を表示
//
//        AnimationSet set =new AnimationSet(true);
//        TranslateAnimation translate = new TranslateAnimation(no0,100,no0,100);
//        translate.setDuration(200);
//        imageView.startAnimation(translate); // 撮った画像を表示


        findViewById(R.id.suraimu).startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime));//アニメーション


    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.ocr_button:
                Intent intent = new Intent (getApplication(), Ocr.class);
                startActivity(intent);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, Zukan.class);
                startActivity(intent2);
                break;
        }
    }


}
