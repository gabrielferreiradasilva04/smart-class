package com.android.projetoiv.viewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.android.projetoiv.model.UserTypeEntity;
import com.android.projetoiv.repository.UserTypeRepository;

public class ViewModelTeste1 extends AndroidViewModel {

    public MutableLiveData<String> _liveDescription = new MutableLiveData<>();
    public LiveData<String> liveDescription = _liveDescription;
    private  UserTypeRepository repository;

    public ViewModelTeste1(Application application){
        super(application);
        this.repository = new UserTypeRepository(application);

    }
    public void change(String string){
        _liveDescription.setValue(string);
    }



}
