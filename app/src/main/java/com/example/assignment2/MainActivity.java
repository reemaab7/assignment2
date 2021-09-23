package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edittextname;
Button btnclick;
TextView textname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittextname = (EditText) findViewById(R.id.edittextname);
        btnclick=(Button) findViewById(R.id.btnclick);
        textname=(TextView) findViewById(R.id.textname);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edittextname.getText().toString();
                textname.setText("Hi "+name);

            }
        });
    }
}