package com.example.sjcet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inp1;
    EditText inp2;
    TextView out;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inp1=(EditText)findViewById(R.id.inp1);
        inp2=(EditText)findViewById(R.id.inp2);
        out= (TextView)findViewById(R.id.out);
    }

    public void add(View view) {
        int x=Integer.parseInt(inp1.getText().toString());
        int y=Integer.parseInt(inp2.getText().toString());
        int s=x+y;
        out.setText(Integer.toString(s));
    }
    public void sub(View view) {
        int x=Integer.parseInt(inp1.getText().toString());
        int y=Integer.parseInt(inp2.getText().toString());
        int s=x-y;
        out.setText(Integer.toString(s));
    }
    public void mul(View view) {
        int x=Integer.parseInt(inp1.getText().toString());
        int y=Integer.parseInt(inp2.getText().toString());
        int s=x*y;
        out.setText(Integer.toString(s));

    }
    public void div(View view) {
        int x=Integer.parseInt(inp1.getText().toString());
        int y=Integer.parseInt(inp2.getText().toString());
        int s=x/y;
        out.setText(Integer.toString(s));
    }
}

