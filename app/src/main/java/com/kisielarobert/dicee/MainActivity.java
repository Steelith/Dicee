package com.kisielarobert.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollTheDice (View view) {
        changeDiceImage(R.id.leftDiceImage);
        changeDiceImage(R.id.rightDiceImage);
    }

    private void changeDiceImage (int diceId) {
        ImageView diceImage = findViewById(diceId);
        switch (getRandomValue()) {
            case 1:
                diceImage.setImageResource(R.drawable.dice1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.dice2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.dice3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.dice4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.dice5);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.dice6);
                break;
        }
    }

    private int getRandomValue(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
