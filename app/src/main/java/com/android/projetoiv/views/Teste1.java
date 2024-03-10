package com.android.projetoiv.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.projetoiv.R;

import com.android.projetoiv.viewModel.ViewModelTeste1;

public class Teste1 extends AppCompatActivity {
    private Button buttonSave;
    private EditText edTxtDescription;
    private TextView txtDescription;
    private ViewModelTeste1 viewModel ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste1);

        this.buttonSave = findViewById(R.id.btnsave);
        this.edTxtDescription = findViewById(R.id.edTxtDescription);
        this.txtDescription = findViewById(R.id.textDescription);

        viewModel = new ViewModelProvider(this).get(ViewModelTeste1.class);
       /* viewModel.liveDescription.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                txtDescription.setText(s);
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.change(edTxtDescription.getText().toString());

            }
        });
*/





    }
}