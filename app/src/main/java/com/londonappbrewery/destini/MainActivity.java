package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button mButtonTop;
    Button mButtonBottom;
    TextView mStoryText;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final Button mButtonTop = findViewById(R.id.buttonTop);
        final Button mButtonBottom = findViewById(R.id.buttonBottom);
        final TextView mStoryText = findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    mStoryText.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }

                else if(mStoryIndex == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }

                else if(mStoryIndex == 3) {
                    mStoryText.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mStoryIndex = 6;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;

                }

                else if(mStoryIndex == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mStoryIndex = 4;
                }

                else if(mStoryIndex == 3) {
                    mStoryText.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mStoryIndex = 6;
                }
            }
        });

    }
}
