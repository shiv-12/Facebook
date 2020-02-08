package com.example.animationoverlap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Slide slideanimation = new Slide();
        slideanimation.setDuration(1000);
        slideanimation.setSlideEdge(Gravity.BOTTOM);

        getWindow().setExitTransition(slideanimation);
        getWindow().setAllowReturnTransitionOverlap(false);
        getWindow().setReenterTransition(slideanimation);



    }

    public void click(View view){

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);

        Intent intent = new Intent(MainActivity.this,second.class);
        startActivity(intent,options.toBundle());
    }

}
