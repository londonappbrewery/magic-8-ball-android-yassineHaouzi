package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView image_ball = findViewById(R.id.image_ball);

    final int[] ballArray = new int[]{

            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
        Button myButton = findViewById(R.id.button_ask);

            myButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Random randomNumber  = new Random();

                    int number = randomNumber.nextInt(5);
                    int ImageResourceId  = ballArray[number];
                    image_ball.setImageResource(ImageResourceId);


                }
            });



    }
}
