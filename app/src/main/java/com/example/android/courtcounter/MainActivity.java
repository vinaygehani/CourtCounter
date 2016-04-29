package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreCounterA=0;
    public int scoreCounterB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScore();
    }


    public void incScore(View v) {

        switch (v.getId()) {

            case (R.id.a1):
                scoreCounterA++;
                displayScore(R.id.team_a_score, scoreCounterA);


        }
    }

    public void displayScore(int v, int score){

        TextView scoreView = (TextView) findViewById(v);
        scoreView.setText(score);


    }

    public void displayScore(){

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(0);

        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(0);


    }
}
