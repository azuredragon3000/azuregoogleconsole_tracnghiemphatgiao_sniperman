package com.myapp.sniperman;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModelFirstFragment extends ViewModel {
    private final MutableLiveData<Integer> selected = new MutableLiveData<>();

    public void select(Integer item) {
        selected.setValue(item);
    }

    public LiveData<Integer> getSelected() {
        return selected;
    }
}