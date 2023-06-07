package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay, btnPause, btnStop;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvens();
    }

    private void addControls(){
        btnPlay=(Button) findViewById(R.id.btnPlay);
        btnPause=(Button) findViewById(R.id.btnPause);
        btnStop=(Button) findViewById(R.id.btnStop);

    }

    private void addEvens(){
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer==null){
//                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.)
                }
                mediaPlayer.start();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null){
                    mediaPlayer.pause();
                }
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null)
                    mediaPlayer.release();
                    mediaPlayer = null;
            }
        });
    }
}