package com.practicemvvm.dao;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import androidx.lifecycle.LiveData;

import com.practicemvvm.models.ModelClass;

import java.util.List;
@android.arch.persistence.room.Dao
public interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     void insert(List<ModelClass> list);


    @Query("SELECT * FROM table1")
    LiveData<List<ModelClass>> allGetData();


    @Query("DELETE FROM table1")
    void  delete();
}
