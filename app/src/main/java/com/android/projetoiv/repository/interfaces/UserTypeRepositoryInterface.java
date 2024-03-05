package com.android.projetoiv.repository.interfaces;

import androidx.lifecycle.LiveData;

import com.android.projetoiv.model.UserTypeEntity;

import java.util.List;

public interface UserTypeRepositoryInterface {

    public Long insert(String description);

    public  LiveData<List<UserTypeEntity>> getAll();
}
