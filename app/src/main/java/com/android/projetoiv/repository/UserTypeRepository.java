package com.android.projetoiv.repository;

import androidx.lifecycle.LiveData;

import com.android.projetoiv.dao.UserTypeDAO;
import com.android.projetoiv.model.UserTypeEntity;
import com.android.projetoiv.repository.interfaces.UserTypeRepositoryInterface;

import java.util.List;

public class UserTypeRepository implements UserTypeRepositoryInterface {
    private UserTypeDAO userTypeDAO;
    @Override
    public Long insert(String description) {
        UserTypeEntity userTypeEntity = new UserTypeEntity();
        userTypeEntity.setDescription(description);
        return userTypeDAO.insert(userTypeEntity);

    }

    @Override
    public LiveData<List<UserTypeEntity>> getAll() {
        return null;
    }


}
