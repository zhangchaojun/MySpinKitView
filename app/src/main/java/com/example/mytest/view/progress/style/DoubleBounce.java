package com.example.mytest.view.progress.style;

import android.animation.ValueAnimator;


import com.example.mytest.view.progress.animation.SpriteAnimatorBuilder;
import com.example.mytest.view.progress.sprite.CircleSprite;
import com.example.mytest.view.progress.sprite.RectSprite;
import com.example.mytest.view.progress.sprite.Sprite;
import com.example.mytest.view.progress.sprite.SpriteContainer;
import com.example.mytest.view.progress.sprite.CircleLayoutContainer;
/**
 * Created by ybq.
 */
public class DoubleBounce extends SpriteContainer {

    @Override
    public Sprite[] onCreateChild() {
        return new Sprite[]{
                new Bounce(), new Bounce()
        };
    }

    @Override
    public void onChildCreated(Sprite... sprites) {
        super.onChildCreated(sprites);
        sprites[1].setAnimationDelay(-1000);
    }

    private static class Bounce extends CircleSprite {

        Bounce() {
            setAlpha(153);
            setScale(0f);
        }

        @Override
        public ValueAnimator onCreateAnimation() {
            float fractions[] = new float[]{0f, 0.5f, 1f};
            return new SpriteAnimatorBuilder(this).scale(fractions, 0f, 1f, 0f).
                    duration(2000).
                    easeInOut(fractions)
                    .build();
        }
    }
}
