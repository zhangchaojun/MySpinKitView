package com.example.mytest.view.progress.style;

import android.animation.ValueAnimator;


import com.example.mytest.view.progress.animation.SpriteAnimatorBuilder;
import com.example.mytest.view.progress.sprite.CircleLayoutContainer;
import com.example.mytest.view.progress.sprite.CircleSprite;
import com.example.mytest.view.progress.sprite.Sprite;
import com.example.mytest.view.progress.sprite.SpriteContainer;

/**
 * Created by ybq.
 */
public class Circle extends CircleLayoutContainer {

    @Override
    public Sprite[] onCreateChild() {
        Dot[] dots = new Dot[12];
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new Dot();
            dots[i].setAnimationDelay( 100 * i);
        }
        return dots;
    }

    private static class Dot extends CircleSprite {

        Dot() {
            setScale(0f);
        }

        @Override
        public ValueAnimator onCreateAnimation() {
            float fractions[] = new float[]{0f, 0.5f, 1f};
            return new SpriteAnimatorBuilder(this).
                    scale(fractions, 0f, 1f, 0f).
                    duration(1200).
                    easeInOut(fractions)
                    .build();
        }
    }
}
