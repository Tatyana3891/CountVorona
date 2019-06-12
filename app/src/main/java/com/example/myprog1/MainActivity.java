package com.example.myprog1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mCrowsCounterButton;
    private int mCount = 0;
    private int mCountKet = 0;
    private TextView mInfoTexView;
    private TextView mHelloTextView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton =  findViewById(R.id.button_counter);
        mInfoTexView = findViewById(R.id.textView);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//  TextView helloTextView = findViewById(R.id.textView);
                //  helloTextView.setText("Я насчитал " + ++mCount + " ворон");
                mInfoTexView.setText("Я насчитал " + ++mCount + " ворон.");
            }
        });
    }

    public void onClick(View view) {
//  TextView helloTextView = (TextView) findViewById(R.id.textView);
        //  helloTextView.setText("Hello Ketty");
        mInfoTexView.setText("Hello Kitty");
    }

    public void onClicKet(View view) {
        mInfoTexView.setText("Я насчитал " + ++mCountKet + " котов.");
    }
}