package com.tantuo.didi.splash;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
<<<<<<< HEAD
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
>>>>>>> 11b22fa63cb7d4103795b4383e444fe908419e3a
import android.widget.ImageView;

import com.tantuo.didi.R;

<<<<<<< HEAD

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            final AnimatedVectorDrawable anim =
                    (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim);
            final ImageView logo = (ImageView) findViewById(R.id.logo);
            logo.setImageDrawable(anim);
            anim.start();
=======
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            final AnimatedVectorDrawable anim1 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim);
            final ImageView logo = ((ImageView) findViewById(R.id.logo));
            logo.setImageDrawable(anim1);
            anim1.start();
>>>>>>> 11b22fa63cb7d4103795b4383e444fe908419e3a
        }
    }
}
