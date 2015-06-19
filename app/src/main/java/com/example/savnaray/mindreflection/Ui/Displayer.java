package com.example.savnaray.mindreflection.Ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.savnaray.mindreflection.Model.Display;
import com.example.savnaray.mindreflection.R;


public class Displayer extends ActionBarActivity {

    private int mDisplayImage;
    private int mSelectedImage;
    private Display mDisplay = new Display();
    ImageView displayImageView ;
    Button mCloseButton;
    Button mShowButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayer);
        displayImageView = (ImageView)findViewById(R.id.imageviewDisplay);
        mShowButton = (Button)findViewById(R.id.btnShowButton);
        mCloseButton= (Button)findViewById(R.id.btnClose);
        mCloseButton.setText("Instructions");

        mDisplay.setImageId();
        mDisplayImage =mDisplay.getDisplayImageId();
        mSelectedImage= mDisplay.getSelectedImageId();


        Drawable drawable = getResources().getDrawable(mDisplayImage);
        displayImageView.setImageDrawable(drawable);

        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadSelectedImageScreen();
            }
        });

        mCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartInstructions();
            }
        });
    }


    private void LoadSelectedImageScreen() {

        Drawable drawable = getResources().getDrawable(mSelectedImage);
        displayImageView.setImageDrawable(drawable);

        mShowButton.setText("Play Again");
        mCloseButton.setVisibility(View.VISIBLE);
        mCloseButton.setText("Close");
        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPlay();
            }
        });

        mCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartScreen();
            }
        });

    }

    private void StartInstructions()
    {
        Intent intent = new Intent(this,instructions.class);
        startActivity(intent);
    }
    private void StartScreen()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void startPlay() {

        Intent intent = new Intent(this,Displayer.class);
        startActivity(intent);
    }




}
