package jp.ac.shohoku.hguremetal.sound_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;




public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    SoundPool soundPool;
    MediaPlayer Player;
//    private final static int RESULT_CAMERA = 1000;
//    private ImageView imageView;

    int mp3a;
    int mp3b;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button2).setOnClickListener(this);


//        imageView = findViewById(R.id.image_View);
//
//
//        AnimationSet set =new AnimationSet(true);
//        TranslateAnimation translate = new TranslateAnimation(0,100,0,100);
//        translate.setDuration(200);
//        imageView.startAnimation(translate);
//
//        Button cameraButton = findViewById(R.id.camera_button);
//        cameraButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(intent, RESULT_CAMERA);
//            }
//        });
//
        // ② 初期化（電源を入れる・コピペOK）
//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
//        } else {
//            AudioAttributes attr = new AudioAttributes.Builder()
//                    .setUsage(AudioAttributes.USAGE_MEDIA)
//                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                    .build();
//            soundPool = new SoundPool.Builder()
//                    .setAudioAttributes(attr)
//                    .setMaxStreams(5)
//                    .build();
//        }


        // BGM再生
        MediaPlayer Player = MediaPlayer.create(this, R.raw.bgm);
        Player.start();
        Player.setLooping(true);

        // ③ 読込処理(CDを入れる)
//        mp3a = soundPool.load(this, R.raw.a, 1);
//        mp3b = soundPool.load(this, R.raw.b, 1);
    }

//    protected void BGMstart(){
//        if(!Player.isPlaying()){
//            Player.start();
//        }
//    }

//    protected  void BGMstop(){
//        if(Player.isPlaying()){
//            Player.stop();
//        }
//    }

    public void onClick(View view){
        Intent intent = new Intent(this,subActivity.class);
        startActivity(intent);

    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == RESULT_CAMERA) {
//            Bitmap bitmap;
//            // cancelしたケースも含む
//            if (data.getExtras() == null) {
//                Log.d("debug", "cancel ?");
//                return;
//            } else {
//                bitmap = (Bitmap) data.getExtras().get("data");
//                if (bitmap != null) {
//                    // 画面サイズを計測
//                    int bmpWidth = bitmap.getWidth();
//                    int bmpHeight = bitmap.getHeight();
//                    Log.d("debug", String.format("w= %d", bmpWidth));
//                    Log.d("debug", String.format("h= %d", bmpHeight));
//                }
//            }
//
//            imageView.setImageBitmap(bitmap);
//
//        }
//
//
////    public void onA(View v){
////        // ④ 再生処理(再生ボタン)
////        soundPool.play(mp3a,1f , 1f, 0, 0, 1f);
////    }
////
////    public void onB(View v){
////        // ④ 再生処理 (再生ボタン)
////        soundPool.play(mp3b,1f , 1f, 0, 0, 1f);
////    }
////
////
//    }
}