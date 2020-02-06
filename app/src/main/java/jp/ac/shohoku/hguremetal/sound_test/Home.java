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

    private final static int RESULT_CAMERA = 1000;
    private ImageView imageView;
    MediaPlayer Player;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        findViewById(R.id.suraimu).startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime));

        findViewById(R.id.button3).setOnClickListener(this);

//        imageView = findViewById(R.id.imageView); // 撮った画像を表示
//
//
//        AnimationSet set =new AnimationSet(true);
//        TranslateAnimation translate = new TranslateAnimation(0,100,0,100);
//        translate.setDuration(200);
//        imageView.startAnimation(translate); // 撮った画像を表示

        findViewById(R.id.camera_button).setOnClickListener(this);



    }



    protected void BGMstart(){
        if(!Player.isPlaying()){
            Player.start();
        }
    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.camera_button:
                Intent intent = new Intent (getApplication(), Ocr.class);
                startActivity(intent);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, Zukan.class);
                startActivity(intent2);
                break;
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RESULT_CAMERA) {
            Bitmap bitmap;
            // cancelしたケースも含む
            if (data.getExtras() == null) {
                Log.d("debug", "cancel ?");
                return;
            } else {
                bitmap = (Bitmap) data.getExtras().get("data");
                if (bitmap != null) {
                    // 画面サイズを計測
                    int bmpWidth = bitmap.getWidth();
                    int bmpHeight = bitmap.getHeight();
                    Log.d("debug", String.format("w= %d", bmpWidth));
                    Log.d("debug", String.format("h= %d", bmpHeight));
                }
            }

            imageView.setImageBitmap(bitmap);

        }


    }




}
