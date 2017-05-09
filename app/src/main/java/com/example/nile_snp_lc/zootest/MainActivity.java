package com.example.nile_snp_lc.zootest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Explict ประกาศตังแปร
    MediaPlayer mediaPlayer;
    int soundID = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Toast onClick สิงโต
            ImageView clickImageView = (ImageView) findViewById(R.id.imgLion);
            clickImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Lion ", Toast.LENGTH_LONG).show();
                    //show soundID file Hello when click Image
                    soundID = R.raw.lion;
                    playSound (soundID);
                }
            });


        // Toast onClick ม้า
        ImageView clickImageView2 = (ImageView) findViewById(R.id.imgHorse);
        clickImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Horse ", Toast.LENGTH_LONG).show();
                //show soundID file Hello when click Image
                soundID = R.raw.horse;
                playSound (soundID);
            }
        });



        // End Toast onClick ช้าง
            ImageView clickImageView3 = (ImageView) findViewById(R.id.imgElephant);
            clickImageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(getApplicationContext(),"Elephant", Toast.LENGTH_LONG).show();
                    // show soundID file Thank when click Image
                    soundID = R.raw.elephant;
                    playSound (soundID);

                }
            });



    } // method onCreate




    public void onClickmap(View view){

            String lat = "13.774210";
            String log = "100.515869";

            Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:"+lat+","+log+" ");
            Intent intent = new Intent(Intent.ACTION_VIEW , location);
            startActivity(intent);
        };






    private void playSound(int soundID) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(),soundID);
        mediaPlayer.start();
    } // end method PlaySound


} // main class
