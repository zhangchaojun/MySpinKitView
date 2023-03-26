package com.example.mytest.view.progress.style;

import android.animation.ValueAnimator;


import com.example.mytest.view.progress.animation.SpriteAnimatorBuilder;
import com.example.mytest.view.progress.sprite.CircleSprite;
import com.example.mytest.view.progress.sprite.RectSprite;
import com.example.mytest.view.progress.sprite.Sprite;
import com.example.mytest.view.progress.sprite.SpriteContainer;
import com.example.mytest.view.progress.sprite.CircleLayoutContainer;


public class RotatingCircle extends CircleSprite {

    @Override
    public ValueAnimator onCreateAnimation() {
        float fractions[] = new float[]{0f, 0.5f, 1f};
        return new SpriteAnimatorBuilder(this).
                rotateX(fractions, 0, -180, -180).
                rotateY(fractions, 0, 0, -180).
                duration(1200).
                easeInOut(fractions)
                .build();
    }
}
