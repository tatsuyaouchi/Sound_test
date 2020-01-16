package jp.ac.shohoku.hguremetal.sound_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Zukan extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zukan);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.imageButton5:
                Intent intent = new Intent(this, Monster.class);
                startActivity(intent);
                break;
        }

    }
}