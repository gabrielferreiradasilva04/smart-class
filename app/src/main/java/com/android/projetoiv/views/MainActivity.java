package com.android.projetoiv.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.projetoiv.R;
import com.android.projetoiv.dao.RoomDataBase;
import com.android.projetoiv.dao.UserTypeDAO;
import com.android.projetoiv.model.UserTypeEntity;
import com.android.projetoiv.repository.UserTypeRepository;
import com.android.projetoiv.repository.interfaces.UserTypeRepositoryInterface;

public class MainActivity extends AppCompatActivity {

    private Button btnNextPage;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.btnNextPage = findViewById(R.id.btn_next_page);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Teste1.class);
                startActivity(i);
                finish();
            }
        });


//       RoomDataBase db = RoomDataBase.getDatabase(getApplicationContext());
//
//        UserTypeEntity userType = new UserTypeEntity();
//        userType.setDescription("Teste2");
//        UserTypeDAO dao = db.userTypeDAO();
//        dao.insert(userType);



    }
}