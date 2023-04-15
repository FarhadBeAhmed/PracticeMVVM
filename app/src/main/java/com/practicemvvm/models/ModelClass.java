package com.practicemvvm.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "table1")
public class ModelClass {

    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    String Id;
    @SerializedName("name")
    String name;

    public ModelClass(String id, String name) {
        Id = id;
        this.name = name;
    }
    public ModelClass() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ModelClass{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
