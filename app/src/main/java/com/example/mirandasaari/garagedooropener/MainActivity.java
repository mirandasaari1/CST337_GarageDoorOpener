package com.example.mirandasaari.garagedooropener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView statusTextView;
    private Button openButton;
    private Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get references to the widgets);
        statusTextView = (TextView) findViewById(R.id.statusTextView);
        openButton = (Button) findViewById(R.id.openButton);
        closeButton = (Button) findViewById(R.id.closeButton);


        // set the listeners
        statusTextView.setOnClickListener(this);
        openButton.setOnClickListener(this);
        closeButton.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.openButton) {
            ((TextView)findViewById(R.id.statusTextView)).setText("Door Status: Opened");
        }

        if(view.getId()==R.id.closeButton) {
            ((TextView)findViewById(R.id.statusTextView)).setText("Door Status: Closed");
        }
    }
}

