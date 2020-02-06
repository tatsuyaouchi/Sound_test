package jp.ac.shohoku.hguremetal.sound_test;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

public class ImageChange {
    private ImageChangedListener listener;

    //画像が表示されたことを通知
    public void informToActivity(){
        listener.imageWasDisplayed();
    }

    // リスナーをセット
    public void setListener(ImageChangedListener listener){
        this.listener = listener;
    }
}
