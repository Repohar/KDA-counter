package com.example.android.kdacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.android.kdacalculator.R.id.assist_text;
import static com.example.android.kdacalculator.R.id.death_text;
import static com.example.android.kdacalculator.R.id.kill_text;
import static com.example.android.kdacalculator.R.id.scoreKDA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreKDA = 0;

    public void calculate (View view) {
        EditText KillScore = (EditText)findViewById(R.id.kill_text);
        String Kills = KillScore.getText().toString();
        int kill = Integer.parseInt(Kills);

        EditText DeathScore = (EditText)findViewById(R.id.death_text);
        String Deaths = DeathScore.getText().toString();
        int death = Integer.parseInt(Deaths);

        EditText AssistScore = (EditText)findViewById(R.id.assist_text);
        String Assists = AssistScore.getText().toString();
        int assist = Integer.parseInt(Assists);

        scoreKDA = (kill + assist)/death;
        displayKDA(scoreKDA);
            }

    public void displayKDA (int number) {
        TextView KDAscores = (TextView) findViewById(R.id.scoreKDA);
                KDAscores.setText("" + number);
    }

}


