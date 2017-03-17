package com.example.lab3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText e1 = (EditText)findViewById(R.id.editText1);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        EditText e3 = (EditText)findViewById(R.id.editText3);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        final TextView t1 = (TextView) findViewById(R.id.textView5);
        final TextView t2 = (TextView) findViewById(R.id.textView7);

        final String k_score = e1.getText().toString();
        final String m_score = e2.getText().toString();
        final String e_score = e3.getText().toString();

        final int total = Integer.parseInt(k_score) + Integer.parseInt(m_score) + Integer.parseInt(e_score);
        final int avg = total/3;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(""+total+"점");
                t2.setText(""+avg+"점");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText();

            }
        });


    }

}
