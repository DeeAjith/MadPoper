package com.makershub.madpoper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button r_btn;
        final ImageView l_Dice, r_Dice;

        r_btn = findViewById(R.id.btnRoll);
        l_Dice = findViewById(R.id.diceLeft);
        r_Dice = findViewById(R.id.diceRight);
        final int[] Dice_picker =
                {
                    R.drawable.dice1,
                    R.drawable.dice2,
                    R.drawable.dice3,
                    R.drawable.dice4,
                    R.drawable.dice5,
                    R.drawable.dice6
                };

        r_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Log.d("MadPoper","Are you Working ?");
                Random randomNumber_Gen= new Random();
                int number = randomNumber_Gen.nextInt(6);
//                Log.d("MadPoper", "onClick: "+number);
                l_Dice.setImageResource(Dice_picker[number]);
                number = randomNumber_Gen.nextInt(6);
                r_Dice.setImageResource(Dice_picker[number]);
            }
        });
    }
}