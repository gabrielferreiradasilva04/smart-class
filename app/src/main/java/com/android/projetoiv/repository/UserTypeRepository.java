package com.android.projetoiv.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.android.projetoiv.dao.RoomDataBase;
import com.android.projetoiv.dao.UserTypeDAO;
import com.android.projetoiv.model.UserTypeEntity;
import com.android.projetoiv.repository.interfaces.UserTypeRepositoryInterface;

import java.util.List;

public class UserTypeRepository implements UserTypeRepositoryInterface {
    private UserTypeDAO userTypeDAO ;
    public UserTypeRepository(Application application){
        RoomDataBase db = RoomDataBase.getDatabase(application);
        this.userTypeDAO = db.userTypeDAO();
    };
    @Override
    public void insert(UserTypeEntity userTypeEntity) {
        RoomDataBase.databaseWriteExecutor.execute(() ->{
            this.userTypeDAO.insert(userTypeEntity);
        });
    }

    @Override
    public LiveData<List<UserTypeEntity>> getAll() {
        return null;
    }




}
