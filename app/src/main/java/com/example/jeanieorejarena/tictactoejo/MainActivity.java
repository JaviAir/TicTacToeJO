package com.example.jeanieorejarena.tictactoejo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mySound;

    @Override
    protected void onPause() {
        super.onPause();
        mySound.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mySound.start();

    }


    Button SP_Activityy;
    ImageButton SoundVol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this, R.raw.tictactoejoadventurememe);

        SP_Activityy=(Button)findViewById(R.id.SP_Activityy);
        SoundVol=(ImageButton)findViewById(R.id.SoundVol);

        SP_Activityy.setOnClickListener(this);
        SoundVol.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.SP_Activityy:
                startActivity(new Intent(MainActivity.this, TwoPlayerMode.class));
                break;
            case R.id.SoundVol:
                if (mySound.isPlaying()){
                mySound.pause();
                }else{
                    mySound.start();
                }
                break;

        }

    }






}
