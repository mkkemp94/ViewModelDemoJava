package com.mkemp.viewmodeldemojava;

import android.os.Bundle;
import android.view.View;

import com.mkemp.viewmodeldemojava.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        
        viewModel.getCountLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer count)
            {
                binding.countText.setText(String.valueOf(count));
            }
        });
        
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                viewModel.incrementCount();
            }
        });
    }
}