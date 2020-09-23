package com.mkemp.viewmodeldemojava;

import android.os.Bundle;

import com.mkemp.viewmodeldemojava.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity
{
    ActivityMainBinding binding;
    MainActivityViewModel viewModel;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);
    }
}