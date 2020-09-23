package com.mkemp.viewmodeldemojava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private int count = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        final TextView textView = findViewById(R.id.count_text);
        Button button = findViewById(R.id.button);
        
        textView.setText(String.valueOf(count));
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                count++;
                textView.setText(String.valueOf(count));
            }
        });
    }
}