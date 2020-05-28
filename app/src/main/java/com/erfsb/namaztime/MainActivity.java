package com.erfsb.namaztime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp;
    Animation bganim;
    LinearLayout welcometext , hometext , menus;
    Animation frombottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        bgapp = findViewById(R.id.bgapp);
        welcometext = findViewById(R.id.welcometext);
        hometext = findViewById(R.id.hometext);
        menus = findViewById(R.id.menus);
        //bganim = AnimationUtils.loadAnimation(this,R.anim.bganim);
        bgapp.animate().translationY(-900).setDuration(1500).setStartDelay(300);
        welcometext.animate().translationY(-300).setDuration(1500).setStartDelay(250);
        hometext.startAnimation(frombottom);
        menus.startAnimation(frombottom);
    }
}
