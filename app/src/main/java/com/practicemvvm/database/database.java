package com.practicemvvm.database;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;

import com.practicemvvm.dao.Dao;
import com.practicemvvm.models.ModelClass;

@Database(entities = {ModelClass.class},version=1)
public abstract class database extends RoomDatabase {

    private static final String DB_NAME="farhad_db";
    public  abstract Dao modelDao();

}
