package jp.ac.shohoku.hguremetal.sound_test;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
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


    
        findViewById(R.id.suraimu).startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime));//アニメーション

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
