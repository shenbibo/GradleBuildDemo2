package com.sky.gradlebuilddemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import com.sky.gradlebuilddemo.R;


/**
 * PACKAGE_NAME
 * [function]
 * [detail]
 * Created by Sky on 2016/10/24.
 * modify by
 */

public class HelpTestActivity extends AppCompatActivity {


    private boolean isBeautiful = true;

    private ImageView girlImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_test);
        girlImage = (ImageView) findViewById(R.id.imageView);
        //点击按钮弹出提示文案，
        girlImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar =
                        Snackbar.make(HelpTestActivity.this.getWindow().getDecorView(), "",
                                Snackbar.LENGTH_LONG);
                snackbar.setAction("Click me, get the beautiful girl to you!",
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (isBeautiful) {
                                    girlImage.setImageResource(R.drawable.ruhua);
                                    isBeautiful = false;
                                } else {
                                    girlImage.setImageResource(R.drawable.zhaoliying);
                                    isBeautiful = true;
                                }
                            }
                        }).show();

            }
        });
    }
}
