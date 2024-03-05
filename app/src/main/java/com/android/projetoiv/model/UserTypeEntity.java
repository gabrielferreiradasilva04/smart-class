package com.android.projetoiv.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "userType")
public class UserTypeEntity {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserTypeEntity(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public UserTypeEntity() {
    }

    @Override
    public String toString() {
        return "UserTypeEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
