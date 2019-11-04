package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    public Button registrarmeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarmeBtn=findViewById(R.id.registrarmebtn);

        //registrarmeBtn.setOnClickListener(this);

        registrarmeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), Registro.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });

    }


}
