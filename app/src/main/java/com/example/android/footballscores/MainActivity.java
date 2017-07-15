package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreRedTeam = 0;
    int scoreBlueTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void touchdownForRedTeam(View v) {
        scoreRedTeam += 6;
        displayForRedTeam(scoreRedTeam);
    }

    public void touchdownForBlueTeam(View v) {
        scoreBlueTeam += 6;
        displayForBlueTeam(scoreBlueTeam);
    }

    public void pointAfterTouchdownForRedTeam(View v) {
        scoreRedTeam += 1;
        displayForRedTeam(scoreRedTeam);
    }

    public void pointAfterTouchdownForBlueTeam(View v) {
        scoreBlueTeam += 1;
        displayForBlueTeam(scoreBlueTeam);
    }

    public void fieldGoalForRedTeam(View v) {
        scoreRedTeam += 3;
        displayForRedTeam(scoreRedTeam);
    }

    public void fieldGoalForBlueTeam(View v) {
        scoreBlueTeam += 3;
        displayForBlueTeam(scoreBlueTeam);
    }

    public void safetyForRedTeam(View v) {
        scoreRedTeam += 2;
        displayForRedTeam(scoreRedTeam);
    }

    public void safetyForBlueTeam(View v) {
        scoreBlueTeam += 2;
        displayForBlueTeam(scoreBlueTeam);
    }

    public void reset(View v) {
        scoreRedTeam = 0;
        scoreBlueTeam = 0;
        displayForRedTeam(scoreRedTeam);
        displayForBlueTeam(scoreBlueTeam);
    }

    public void displayForRedTeam(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.red_score_text_view);
        scoreTextView.setText(String.valueOf(score));
    }

    public void displayForBlueTeam(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.blue_score_text_view);
        scoreTextView.setText(String.valueOf(score));
    }
}
