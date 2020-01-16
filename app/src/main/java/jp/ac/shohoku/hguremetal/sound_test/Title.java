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
        findViewById(R.id.button1).setOnClickListener(this);

        findViewById(R.id.button2).setOnClickListener(this);

    }


    public void onClick(View view){
        switch(view.getId()) {
            case R.id.button1:
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
            break;
            case R.id.button2:
                Intent intent2 = new Intent(this, Asobikata.class);
                startActivity(intent2);



        }
    }



}