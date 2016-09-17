package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //Dobott pontok
    int scoreA = 0;
    int scoreB = 0;

    //"A" csapat bedobott dobásai
    int bedobott3A = 0;
    int bedobott2A = 0;
    int bedobott1A = 0;

    //"A" csapat rádobott dobásai
    int rádobott3A = 0;
    int rádobott2A = 0;
    int rádobott1A = 0;

    //"B" csapat bedobott dobásai
    int bedobott3B = 0;
    int bedobott2B = 0;
    int bedobott1B = 0;

    //"B" csapat rádobott dobásai
    int rádobott3B = 0;
    int rádobott2B = 0;
    int rádobott1B = 0;
    String arány;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void haromPontosA(View view) {

        int szazalek = (int) (Math.random() * 10);

        if (szazalek <= 3) {

            scoreA = scoreA + 3;
            displayA(scoreA);
            bedobott3A = bedobott3A + 1;
            rádobott3A = rádobott3A + 1;
        } else {

            rádobott3A = rádobott3A + 1;
        }
        {

            arány = bedobott3A + "/" + rádobott3A;
            displayArány3A(arány);
        }
    }

    public void ketPontosA(View view) {

        int szazalek = (int) (Math.random() * 10);

        if (szazalek <= 6) {

            scoreA = scoreA + 2;
            displayA(scoreA);
            bedobott2A = bedobott2A + 1;
            rádobott2A = rádobott2A + 1;
        } else {

            rádobott2A = rádobott2A + 1;
        }
        {

            arány = bedobott2A + "/" + rádobott2A;
            displayArány2A(arány);
        }
    }


    public void freeThrowA(View view) {

        int szazalek = (int) (Math.random() * 10);

        if (szazalek <= 8) {

            scoreA = scoreA + 1;
            displayA(scoreA);
            bedobott1A = bedobott1A + 1;
            rádobott1A = rádobott1A + 1;
        } else {

            rádobott1A = rádobott1A + 1;
        }
        {

            arány = bedobott1A + "/" + rádobott1A;
            displayArány1A(arány);
        }
    }

    public void haromPontosB(View view) {

        int szazalek = (int) (Math.random() * 10);

        if (szazalek <= 3) {

            scoreB = scoreB + 3;
            displayB(scoreB);
            bedobott3B = bedobott3B + 1;
            rádobott3B = rádobott3B + 1;
        } else {

            rádobott3B = rádobott3B + 1;
        }
        {

            arány = bedobott3B + "/" + rádobott3B;
            displayArány3B(arány);
        }
    }

    public void ketPontosB(View view) {

        int szazalek = (int) (Math.random() * 10);

        if (szazalek <= 6) {

            scoreB = scoreB + 2;
            displayB(scoreB);
            bedobott2B = bedobott2B + 1;
            rádobott2B = rádobott2B + 1;
        } else {

            rádobott2B = rádobott2B + 1;
        }
        {

            arány = bedobott2B + "/" + rádobott2B;
            displayArány2B(arány);
        }
    }

    public void freeThrowB(View view) {

        int szazalek = (int) (Math.random() * 10);

        if (szazalek <= 8) {

            scoreB = scoreB + 1;
            displayB(scoreB);
            bedobott1B = bedobott1B + 1;
            rádobott1B = rádobott1B + 1;
        } else {

            rádobott1B = rádobott1B + 1;
        }
        {

            arány = bedobott1B + "/" + rádobott1B;
            displayArány1B(arány);
        }
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;

        //"A" csapat bedobott dobásai
        bedobott3A = 0;
        bedobott2A = 0;
        bedobott1A = 0;

        //"A" csapat rádobott dobásai
        rádobott3A = 0;
        rádobott2A = 0;
        rádobott1A = 0;

        //"B" csapat bedobott dobásai
        bedobott3B = 0;
        bedobott2B = 0;
        bedobott1B = 0;

        //"B" csapat rádobott dobásai
        rádobott3B = 0;
        rádobott2B = 0;
        rádobott1B = 0;

        arány = bedobott1B + "/" + rádobott1B;


        displayA(scoreA);
        displayB(scoreB);
        displayArány1A(arány);
        displayArány2A(arány);
        displayArány3A(arány);
        displayArány1B(arány);
        displayArány2B(arány);
        displayArány3B(arány);
    }

    private void displayA(int number) {
        TextView eredmenyA = (TextView) findViewById(R.id.eredemenyA);
        eredmenyA.setText("" + number);
    }

    private void displayB(int number) {
        TextView eredmenyB = (TextView) findViewById(R.id.eredemenyB);
        eredmenyB.setText("" + number);
    }

    private void displayArány3A(String arány) {

        TextView harmasArány = (TextView) findViewById(R.id.text_view_arány3A);
        harmasArány.setText(arány);

    }

    private void displayArány2A(String arány) {

        TextView harmasArány = (TextView) findViewById(R.id.text_view_arány2A);
        harmasArány.setText(arány);

    }

    private void displayArány1A(String arány) {

        TextView harmasArány = (TextView) findViewById(R.id.text_view_arány1A);
        harmasArány.setText(arány);

    }

    private void displayArány3B(String arány) {

        TextView harmasArány = (TextView) findViewById(R.id.text_view_arány3B);
        harmasArány.setText(arány);
    }

    private void displayArány2B(String arány) {

        TextView harmasArány = (TextView) findViewById(R.id.text_view_arány2B);
        harmasArány.setText(arány);
    }

    private void displayArány1B(String arány) {

        TextView harmasArány = (TextView) findViewById(R.id.text_view_arány1B);
        harmasArány.setText(arány);
    }
}

