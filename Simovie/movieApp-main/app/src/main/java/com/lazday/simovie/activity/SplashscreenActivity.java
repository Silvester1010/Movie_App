package com.lazday.simovie.activity;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.lazday.simovie.R;
import com.lazday.simovie.fragment.HomeActivity;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashscreenActivity.this, HomeActivity.class));
//                startActivity(new Intent(SplashscreenActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }
}
