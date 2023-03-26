package com.example.mytest.view.progress.style;


import com.example.mytest.view.progress.animation.SpriteAnimatorBuilder;
import com.example.mytest.view.progress.sprite.CircleSprite;
import com.example.mytest.view.progress.sprite.RectSprite;
import com.example.mytest.view.progress.sprite.Sprite;
import com.example.mytest.view.progress.sprite.SpriteContainer;
import com.example.mytest.view.progress.sprite.CircleLayoutContainer;

/**
 * Created by ybq.
 */
public class MultiplePulse extends SpriteContainer {
    @Override
    public Sprite[] onCreateChild() {
        return new Sprite[]{
                new Pulse(),
                new Pulse(),
                new Pulse(),
        };
    }

    @Override
    public void onChildCreated(Sprite... sprites) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].setAnimationDelay(200 * (i + 1));
        }
    }
}
