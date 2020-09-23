package com.mkemp.viewmodeldemojava;

import android.os.Bundle;
import android.view.View;

import com.mkemp.viewmodeldemojava.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity
{
    private int count = 0;
    private ActivityMainBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        
        binding.countText.setText(String.valueOf(count));
        
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                count++;
                binding.countText.setText(String.valueOf(count));
            }
        });
    }
}