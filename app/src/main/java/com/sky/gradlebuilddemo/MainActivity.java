package com.sky.gradlebuilddemo;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.sky.gradlebuilddemo.activity.HelpTestActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enterButton = (Button) findViewById(R.id.enter_button);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, HelpTestActivity.class));
            }
        });

        Button cancelButton = (Button) findViewById(R.id.cancel_button);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tips = MainActivity.this.getResources().getString(R.string.cancel_tips_msg);
                String finalTips = String.format(tips, ((Button)v).getText());
                Snackbar.make(MainActivity.this.getWindow().getDecorView(), finalTips, Snackbar
                        .LENGTH_LONG).show();
            }
        });
    }

    private void checkBuildConfig(){
        if(BuildConfig.DEBUG){
            Log.i(TAG, "now this is debug build");
        }
    }
}
