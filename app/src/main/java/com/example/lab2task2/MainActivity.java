package com.example.lab2task2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView match_view;
        EditText str1,str2;
        Button matching;

            str1=findViewById(R.id.str1);
            str2=findViewById(R.id.str2);
            matching=findViewById(R.id.match_btn);
            match_view=findViewById(R.id.match_textview);
            matching.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String val1,val2;
                    val1= String.valueOf(str1.getText());
                    val2= String.valueOf(str2.getText());
                    if(val1.isEmpty()||val2.isEmpty())
                    {
                        Toast.makeText(MainActivity.this, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {

                        if(val2.matches(val1))
                        {
                            match_view.setText("Match");
                        }
                        else
                        {
                            match_view.setText("Not Match");
                        }
                    }
                }
            });
        }
    }

