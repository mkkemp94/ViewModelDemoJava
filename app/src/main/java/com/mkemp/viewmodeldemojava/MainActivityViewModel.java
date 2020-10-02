package com.mkemp.viewmodeldemojava;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel
{
    private MutableLiveData<Integer> mutableCount = new MutableLiveData<>();
    
    public MainActivityViewModel(int count)
    {
        mutableCount.setValue(count);
    }
    
    public LiveData<Integer> getCountLiveData()
    {
        return mutableCount;
    }
    
    public void incrementCount()
    {
        Integer oldValue = mutableCount.getValue();
        if ( oldValue != null )
        {
            mutableCount.setValue(oldValue + 1);
        }
    }
}
