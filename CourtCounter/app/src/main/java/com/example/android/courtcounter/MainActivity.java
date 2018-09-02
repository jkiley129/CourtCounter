package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //    Properties
    TextView teamATitleTextView;
    TextView scoreTeamATextView;
    Button threePointTeamA;
    Button twoPointTeamA;
    Button freeThrowTeamA;
    TextView teamBTitleTextView;
    TextView scoreTeamBTextView;
    Button threePointTeamB;
    Button twoPointTeamB;
    Button freeThrowTeamB;
    Button reset;
    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamATitleTextView = (TextView) findViewById(R.id.teamATitleTextView);
        scoreTeamATextView = (TextView) findViewById(R.id.scoreTeamATextView);
        threePointTeamA = (Button) findViewById(R.id.threePointTeamA);
        twoPointTeamA = (Button) findViewById(R.id.twoPointTeamA);
        freeThrowTeamA = (Button) findViewById(R.id.freeThrowTeamA);
        teamBTitleTextView = (TextView) findViewById(R.id.teamBTitleTextView);
        scoreTeamBTextView = (TextView) findViewById(R.id.scoreTeamBTextView);
        threePointTeamB = (Button) findViewById(R.id.threePointTeamB);
        twoPointTeamB = (Button) findViewById(R.id.twoPointTeamB);
        freeThrowTeamB = (Button) findViewById(R.id.freeThrowTeamB);
        reset = (Button) findViewById(R.id.reset);
        teamATitleTextView.setText("Team A");
        threePointTeamA.setText("+3 Points");
        twoPointTeamA.setText("+2 Points");
        freeThrowTeamA.setText("Free Throw");
        teamBTitleTextView.setText("Team B");
        threePointTeamB.setText("+3 Points");
        twoPointTeamB.setText("+2 Points");
        freeThrowTeamB.setText("Free Throw");
        reset.setText("Reset");
    }

    // Actions

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        teamAScore += score;
        scoreTeamATextView.setText(String.valueOf(teamAScore));
    }

    public void displayForTeamB(int score) {
        teamBScore += score;
        scoreTeamBTextView.setText(String.valueOf(teamBScore));
    }

    public void onThreePointTeamA(View v) {
        displayForTeamA(3);
    }

    public void onTwoPointTeamA(View v) {
        displayForTeamA(2);
    }

    public void onFreeThrowTeamA(View v) {
        displayForTeamA(1);
    }

    public void onThreePointTeamB(View v) {
        displayForTeamB(3);
    }

    public void onTwoPointTeamB(View v) {
        displayForTeamB(2);
    }

    public void onFreeThrowTeamB(View v) {
        displayForTeamB(1);
    }

    public void onReset(View v) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
