package com.example.scalinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // Create the scaling animation
        ObjectAnimator scaleAnimation = ObjectAnimator.ofFloat(textView, "scaleX", 1.0f, 2.0f);
        scaleAnimation.setDuration(2000);  // Animation duration in milliseconds
        scaleAnimation.setRepeatCount(ObjectAnimator.INFINITE);  // Repeat the animation infinitely
        scaleAnimation.setRepeatMode(ObjectAnimator.REVERSE);  // Reverse the animation direction

        // Set an interpolator for smooth acceleration and deceleration
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        // Start the animation
        scaleAnimation.start();
    }
}