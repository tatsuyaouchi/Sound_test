package jp.ac.shohoku.hguremetal.sound_test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Title extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
        findViewById(R.id.imageButton3).setOnClickListener(this);

    }


    public void onClick(View view){


            Intent intent = new Intent(this, Home.class);
            startActivity(intent);

    }



}