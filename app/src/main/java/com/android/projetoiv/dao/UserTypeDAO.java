package com.android.projetoiv.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import com.android.projetoiv.model.UserTypeEntity;

import java.util.List;

@Dao
public interface UserTypeDAO {
    @Insert
    public  void insert(UserTypeEntity userTypeEntity);
    @Query("SELECT * FROM userType")
    public LiveData<List<UserTypeEntity>> getAll();
    
}
