package jp.ac.shohoku.hguremetal.sound_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class Zukan extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zukan);

        ImageView tapview = findViewById(R.id.imageView1);
        ImageView tapview2 = findViewById(R.id.imageView2);

        tapview.setOnClickListener(this);
        tapview2.setOnClickListener(this);

    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.imageView1:
                ImageView iv = new ImageView(Zukan.this);
                iv.setImageResource(R.drawable.no1);
                iv.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setView(iv)
                        .show();
                break;
            case R.id.imageView2:
                ImageView iv2 = new ImageView(Zukan.this);
                iv2.setImageResource(R.drawable.no2);
                iv2.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setView(iv2)
                        .show();
                break;
        }

    }
}

