package jp.ac.shohoku.hguremetal.sound_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
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
        ImageView tapview3 = findViewById(R.id.imageView3);
        ImageView tapview4 = findViewById(R.id.imageView4);
        ImageView tapview5 = findViewById(R.id.imageView5);

        tapview.setOnClickListener(this);
        tapview2.setOnClickListener(this);
        tapview3.setOnClickListener(this);
        tapview4.setOnClickListener(this);
        tapview5.setOnClickListener(this);

    }
/*
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
            case R.id.imageView3:
                ImageView iv3 = new ImageView(Zukan.this);
                iv3.setImageResource(R.drawable.no3);
                iv3.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setView(iv3)
                        .show();
                break;
            case R.id.imageView4:
                ImageView iv4 = new ImageView(Zukan.this);
                iv4.setImageResource(R.drawable.no4);
                iv4.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setView(iv4)
                        .show();
                break;
            case R.id.imageView5:
                ImageView iv5 = new ImageView(Zukan.this);
                iv5.setImageResource(R.drawable.no5);
                iv5.setAdjustViewBounds(true);
                new AlertDialog.Builder(Zukan.this)
                        .setView(iv5)
                        .show();
                break;
        }

    }

