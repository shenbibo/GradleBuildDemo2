package com.sky.gradlebuilddemo.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sky.gradlebuilddemo.R;

/**
 * PACKAGE_NAME
 * [function]
 * [detail]
 * Created by Sky on 2016/10/24.
 * modify by
 */

public class HelpTestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_test);
        Button skyButton = (Button) findViewById(R.id.skyButton);

        //点击按钮弹出提示文案，
        skyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(HelpTestActivity.this.getWindow().getDecorView(),
                        "hello snackbar", Snackbar.LENGTH_LONG);
                snackbar.setAction("Change Color", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.getView().setBackgroundResource(R.color.colorPrimary);
                    }
                }).show();

            }
        });
    }
}
