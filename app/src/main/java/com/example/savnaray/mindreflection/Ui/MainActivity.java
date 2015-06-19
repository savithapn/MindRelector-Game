package com.example.savnaray.mindreflection.Ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.savnaray.mindreflection.R;


public class MainActivity extends ActionBarActivity {

    private Button mPlayButton;
    private Button mInstructionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton =(Button)findViewById(R.id.btnPlay);
        mInstructionsButton =(Button)findViewById(R.id.btnInstructions);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startPlay();
            }
        });

        mInstructionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartInstructions();
            }
        });

    }

    private void StartInstructions()
    {
        Intent intent = new Intent(this,instructions.class);
        startActivity(intent);
    }

    private void startPlay() {

        Intent intent = new Intent(this,Displayer.class);
        startActivity(intent);
    }


}
