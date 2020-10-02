package com.mkemp.viewmodeldemojava;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MainActivityViewModelFactory implements ViewModelProvider.Factory
{
    private int startingCount;
    
    public MainActivityViewModelFactory(int startingCount)
    {
        this.startingCount = startingCount;
    }
    
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass)
    {
        if (modelClass.isAssignableFrom(MainActivityViewModel.class))
        {
            return (T) new MainActivityViewModel(startingCount);
        }
        
        throw new IllegalArgumentException("Unknown view model class");
    }
}
