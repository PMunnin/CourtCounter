package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int upb = 0;
    int upb2 = 0;
    int upb3 = 0;

    int upa = 0;
    int upa2 = 0;
    int upa3 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds points to the score of team A
     */

    public void addOneTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        calculateStatsA(1);
    }

    public void addTwoTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        calculateStatsA(2);
    }

    public void addThreeTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        calculateStatsA(3);

    }

    /**
     * Adds points to the score of team B
     */

    public void addOneTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        calculateStatsB(1);

    }

    public void addTwoTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        calculateStatsB(2);

    }

    public void addThreeTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        calculateStatsB(3);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
    * Creates Stats for teams
    */
    private void calculateStatsA(int points){


        if (points == 3){
            upa3 ++;
            statsForTeamA3("Triples: " + upa3);
        }
        else if (points == 2){
            upa2 ++;
            statsForTeamA2("Doubles: " + upa2);
        }

        else if (points == 1){
            upa ++;
            statsForTeamA1("Free Shots: " + upa);
        }
    }

    private void calculateStatsB(int points){
        if (points == 3){
            upb3 = upb3 + 1;
            statsForTeamB3("Triples: " + upb3);
        }
        else if (points == 2){
            upb2 = upb2 + 1;
            statsForTeamB2("Doubles: " + upb2);
        }

        else if (points == 1){
            upb = upb + 1;
            statsForTeamB1("Free Shots: " + upb);
        }
    }

    /**
     * Displays stats for teams
     */
    public void statsForTeamA1(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_stat_1);
        scoreView.setText(String.valueOf(score));
    }

    public void statsForTeamB1(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_stat_1);
        scoreView.setText(String.valueOf(score));
    }

    public void statsForTeamA2(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_stat_2);
        scoreView.setText(String.valueOf(score));
    }

    public void statsForTeamB2(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_stat_2);
        scoreView.setText(String.valueOf(score));
    }

    public void statsForTeamA3(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_stat_3);
        scoreView.setText(String.valueOf(score));
    }

    public void statsForTeamB3(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_stat_3);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Resets the scores
     */

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        upb = 0;
        upb2 = 0;
        upb3 = 0;
        statsForTeamB1("Free Shots: " + upb);
        statsForTeamB2("Doubles: " + upb2);
        statsForTeamB3("Triples: " + upb3);

        upa = 0;
        upa2 = 0;
        upa3 = 0;
        statsForTeamA1("Free Shots: " + upa);
        statsForTeamA2("Doubles: " + upa2);
        statsForTeamA3("Triples: " + upa3);


    }
}
