package com.example.mytest.view.progress;


import com.example.mytest.view.progress.animation.SpriteAnimatorBuilder;
import com.example.mytest.view.progress.sprite.CircleSprite;
import com.example.mytest.view.progress.sprite.RectSprite;
import com.example.mytest.view.progress.sprite.Sprite;
import com.example.mytest.view.progress.sprite.SpriteContainer;
import com.example.mytest.view.progress.sprite.CircleLayoutContainer;
import com.example.mytest.view.progress.style.ChasingDots;
import com.example.mytest.view.progress.style.Circle;
import com.example.mytest.view.progress.style.CubeGrid;
import com.example.mytest.view.progress.style.DoubleBounce;
import com.example.mytest.view.progress.style.FadingCircle;
import com.example.mytest.view.progress.style.FoldingCube;
import com.example.mytest.view.progress.style.MultiplePulse;
import com.example.mytest.view.progress.style.MultiplePulseRing;
import com.example.mytest.view.progress.style.Pulse;
import com.example.mytest.view.progress.style.PulseRing;
import com.example.mytest.view.progress.style.RotatingCircle;
import com.example.mytest.view.progress.style.RotatingPlane;
import com.example.mytest.view.progress.style.ThreeBounce;
import com.example.mytest.view.progress.style.WanderingCubes;
import com.example.mytest.view.progress.style.Wave;

/**
 * Created by ybq.
 */
public class SpriteFactory {

    public static Sprite create(Style style) {
        Sprite sprite = null;
        switch (style) {
            case CHASING_DOTS:
                sprite = new ChasingDots();
                break;
            case CIRCLE:
                sprite = new Circle();
                break;
            case CUBE_GRID:
                sprite = new CubeGrid();
                break;
            case DOUBLE_BOUNCE:
                sprite = new DoubleBounce();
                break;
            case FADING_CIRCLE:
                sprite = new FadingCircle();
                break;
            case FOLDING_CUBE:
                sprite = new FoldingCube();
                break;
            case MULTIPLE_PULSE:
                sprite = new MultiplePulse();
                break;
            case MULTIPLE_PULSE_RING:
                sprite = new MultiplePulseRing();
                break;
            case PULSE:
                sprite = new Pulse();
                break;
            case PULSE_RING:
                sprite = new PulseRing();
                break;
            case ROTATING_CIRCLE:
                sprite = new RotatingCircle();
                break;
            case ROTATING_PLANE:
                sprite = new RotatingPlane();
                break;
            case THREE_BOUNCE:
                sprite = new ThreeBounce();
                break;
            case WANDERING_CUBES:
                sprite = new WanderingCubes();
                break;
            case WAVE:
                sprite = new Wave();
                break;
            default:
                break;
        }
        return sprite;
    }
}
