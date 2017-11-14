package com.tom.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int r = random.nextInt(99)+ 1;
    int min = 1;
    int max = 100;
    private TextView secret;
    private TextView info;
    private EditText number;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.parseInt(info.getText().toString());
                if (i == r){
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("答對了")
                            .setTitle("恭喜你")
                            .setPositiveButton("OK", null)
                            .show();
                }
                if (i < r){
                    min = i;
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage(min + "to" + max)
                            .show();
                }
                if (i > r){
                    max = i;
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage(min +"to" + max)
                            .show();
                }
            }
        });
    }

    private void findViews(){
        secret = (TextView) findViewById(R.id.secret);
        info = (TextView) findViewById(R.id.info);
        number = (EditText) findViewById(R.id.number);
        send = (Button) findViewById(R.id.send);
    }

}
