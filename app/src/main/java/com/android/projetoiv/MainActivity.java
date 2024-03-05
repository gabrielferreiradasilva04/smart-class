package com.android.projetoiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.projetoiv.dao.UserTypeDAO;
import com.android.projetoiv.repository.UserTypeRepository;
import com.android.projetoiv.repository.interfaces.UserTypeRepositoryInterface;

public class MainActivity extends AppCompatActivity {

    public TextView txtView = findViewById(R.id.rcView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}