package com.tom.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView secret;
    private TextView info;
    private EditText number;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    private void findViews(){
        secret = (TextView) findViewById(R.id.secret);
        info = (TextView) findViewById(R.id.info);
        number = (EditText) findViewById(R.id.number);
        send = (Button) findViewById(R.id.send);
    }
}
