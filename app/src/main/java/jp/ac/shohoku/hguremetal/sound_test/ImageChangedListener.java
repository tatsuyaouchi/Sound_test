package jp.ac.shohoku.hguremetal.sound_test;

import java.util.EventListener;

public interface ImageChangedListener extends EventListener {

    // 表示されたことを通知する
    public void imageWasDisplayed();
}
