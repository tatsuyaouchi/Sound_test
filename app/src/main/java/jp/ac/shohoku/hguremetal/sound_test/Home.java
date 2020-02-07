package jp.ac.shohoku.hguremetal.sound_test;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;


public class Home extends AppCompatActivity implements View.OnClickListener {
    private int ocrResult;
    static final int MAX_MONSTER = 10;  // 実装するモンスターの数


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.ocr_button).setOnClickListener(this);

        Intent intentOcrResult = getIntent();
        ocrResult = intentOcrResult.getIntExtra("EXTRA_OCR_RESULT2", -1);

        homeMonster();
    }
    public void homeMonster() {
        ImageView iv = findViewById(R.id.image_View);
        AssetManager assets = getResources().getAssets();

        if (0 <= ocrResult && ocrResult < MAX_MONSTER) { // 対応するモンスターの画像表示
            try (InputStream iStream = assets.open("mon" + ocrResult + ".png")) {
                Bitmap bitmap = BitmapFactory.decodeStream(iStream);
                iv.setImageBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

        public void onClick (View view){
            switch (view.getId()) {
                case R.id.ocr_button:
                    Intent intent = new Intent(getApplication(), Ocr.class);
                    startActivity(intent);
                    break;
                case R.id.button3:
                    Intent intent2 = new Intent(getApplication(), Zukan.class);
                    intent2.putExtra("EXTRA_OCR_RESULT2", ocrResult);
                    startActivity(intent2);
                    break;
                }
            }
        }
