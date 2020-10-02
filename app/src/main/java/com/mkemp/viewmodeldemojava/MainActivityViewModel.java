package com.mkemp.viewmodeldemojava;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel
{
    private MutableLiveData<Integer> mutableCount = new MutableLiveData<>();
    public MutableLiveData<String> numberToAdd = new MutableLiveData<>();
    
    public MainActivityViewModel(int count)
    {
        mutableCount.setValue(count);
    }
    
    public LiveData<Integer> getCountLiveData()
    {
        return mutableCount;
    }
    
    public void setCount()
    {
        int newCount = calculateNewCount();
        mutableCount.setValue(newCount);
    }
    
    private int calculateNewCount()
    {
        Integer oldValue = mutableCount.getValue();
        if ( oldValue == null )
        {
            return 0;
        }
        else
        {
            Integer numberToAdd = getNumberToAdd();
            if (numberToAdd != null)
            {
                return oldValue + numberToAdd;
            }
            else
            {
                return ++oldValue;
            }
        }
    }
    
    private Integer getNumberToAdd()
    {
        String value = numberToAdd.getValue();
        if ( value == null || value.isEmpty() )
        {
            return null;
        }
        else
        {
            return Integer.parseInt(value);
        }
    }
}
