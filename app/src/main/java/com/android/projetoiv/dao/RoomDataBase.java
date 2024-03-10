package com.android.projetoiv.dao;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.android.projetoiv.model.UserTypeEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = {UserTypeEntity.class}, version = 1, exportSchema = false)
public abstract class RoomDataBase extends RoomDatabase {



   public abstract UserTypeDAO userTypeDAO();
   private static volatile RoomDataBase INSTANCE;
   private static final int NUMBER_OF_THREADS = 4;

   public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

   public static RoomDataBase getDatabase(final Context context){
      if (INSTANCE == null) {
         synchronized (RoomDataBase.class) {
            if (INSTANCE == null) {
               INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                               RoomDataBase.class, "smartClass")
                       .build();
            }
         }
      }
      return INSTANCE;
   }



}
