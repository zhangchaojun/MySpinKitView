package com.example.mytest;

import android.util.Log;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.cj.library.base.BaseActivity;
import com.example.myspinkitview.R;
import com.example.mytest.view.progress.SpinKitView;
import com.example.mytest.view.progress.SpriteFactory;
import com.example.mytest.view.progress.Style;
import com.example.mytest.view.progress.sprite.Sprite;
import com.example.mytest.view.progress.style.Circle;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "cj";
    private SpinKitView spinKit;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        spinKit = findViewById(R.id.spin_kit);
        initLoadingAnim();
    }

    public void initLoadingAnim() {
        Style[] values = Style.values();
        Log.e(TAG, "initLoadingAnim: " + values.length);
        Style style = Style.values()[1];
        Sprite drawable = SpriteFactory.create(style);
        drawable.setColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        spinKit.setIndeterminateDrawable(drawable);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_start:

                for (int i = 0; i < 12; i++) {

//                  int result = (1200-100*i);
                  int result = (100*i);

                    Log.e(TAG, "onClick: "+result );
                }

                break;
        }
    }

}
