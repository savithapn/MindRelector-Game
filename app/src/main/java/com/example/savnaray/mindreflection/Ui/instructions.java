package com.example.savnaray.mindreflection.Ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.savnaray.mindreflection.Model.Page;
import com.example.savnaray.mindreflection.R;


public class instructions extends ActionBarActivity {

    private TextView txtInstruction;
    Button mNextButton ;
    Page mPage = new Page(0);
    int mCount =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);


        txtInstruction =(TextView)findViewById(R.id.txtViewInstructions);
        mNextButton =(Button)findViewById(R.id.btnShowFIns);
        txtInstruction.setText(mPage.getInstruction(0));


        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCount<2) {
                    mCount++;
                    txtInstruction.setText(mPage.getInstruction(mCount));
                    if(mCount==2)
                    {
                        mNextButton.setText("Play Game");
                    }
                }
                else {
                    mCount=0;

                 LoadGameScreen();
                }

            }
        });
    }

    private void LoadGameScreen()
    {
        Intent intent = new Intent(this,Displayer.class);
        startActivity(intent);
    }


}
