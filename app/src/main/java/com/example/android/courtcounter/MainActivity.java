package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreCounterA = 0;
    public int scoreCounterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayDefaultScore();
    }


    public void incScore(View v) {

        switch (v.getId()) {

            case (R.id.a1):
                scoreCounterA++;
                displayScore(R.id.team_a_score, scoreCounterA);
                break;

            case (R.id.a2):
                scoreCounterA = scoreCounterA + 2;
                displayScore(R.id.team_a_score, scoreCounterA);
                break;
            case (R.id.a3):
                scoreCounterA = scoreCounterA + 3;
                displayScore(R.id.team_a_score, scoreCounterA);
                break;
            case (R.id.b1):
                scoreCounterB++;
                displayScore(R.id.team_b_score, scoreCounterB);
                break;
            case (R.id.b2):
                scoreCounterB = scoreCounterB + 2;
                displayScore(R.id.team_b_score, scoreCounterB);
                break;
            case (R.id.b3):
                scoreCounterB = scoreCounterB + 3;
                displayScore(R.id.team_b_score, scoreCounterB);
                break;
        }
    }

    public void displayScore(int v, int score) {

        TextView scoreView = (TextView) findViewById(v);
        scoreView.setText(String.valueOf(score));


    }

    public void displayDefaultScore(View v) {


        scoreCounterA = 0;
        scoreCounterB = 0;
        displayDefaultScore();

    }

    public void displayDefaultScore() {


        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(0));

        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(0));

    }
}
