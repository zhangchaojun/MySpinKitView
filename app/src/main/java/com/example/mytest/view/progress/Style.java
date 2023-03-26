package com.example.mytest.view.progress;

/**
 * Created by ybq.
 */
public enum Style {

    CHASING_DOTS(0),
    CIRCLE(1),
    CUBE_GRID(2),
    DOUBLE_BOUNCE(3),
    FADING_CIRCLE(4),
    FOLDING_CUBE(5),
    MULTIPLE_PULSE(6),
    MULTIPLE_PULSE_RING(7),
    PULSE(8),
    PULSE_RING(9),
    ROTATING_CIRCLE(10),
    ROTATING_PLANE(11),
    THREE_BOUNCE(12),
    WANDERING_CUBES(13),
    WAVE(14);

    private int value;

    Style(int value) {
        this.value = value;
    }
}
