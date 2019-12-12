package jp.ac.shohoku.hguremetal.sound_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.util.Log;
import android.graphics.Bitmap;

public class subActivity extends AppCompatActivity {

    private final static int RESULT_CAMERA = 1000;
    private ImageView imageView;
    SoundPool soundPool;
    MediaPlayer Player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        imageView = findViewById(R.id.imageView); // 撮った画像を表示


        AnimationSet set =new AnimationSet(true);
        TranslateAnimation translate = new TranslateAnimation(0,100,0,100);
        translate.setDuration(200);
        imageView.startAnimation(translate); // 撮った画像を表示

        Button cameraButton = findViewById(R.id.camera_button);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,RESULT_CAMERA);
//                BGMstart();

            }
        });




    }

    protected void BGMstart(){
        if(!Player.isPlaying()){
            Player.start();
        }
    }

//    protected  void BGMstop(){
//        if(Player.isPlaying()){
//            Player.stop();
//        }
//    }

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




//    public void onA(View v){
//        // ④ 再生処理(再生ボタン)
//        soundPool.play(mp3a,1f , 1f, 0, 0, 1f);
//    }
//
//    public void onB(View v){
//        // ④ 再生処理 (再生ボタン)
//        soundPool.play(mp3b,1f , 1f, 0, 0, 1f);
//    }
//
//
    }

}
