package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pos.logica.Cliente;

public class ResultadoExitoso extends AppCompatActivity {

    public TextView mostrar;
    public Button salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_exitoso2);

        mostrar=findViewById(R.id.mostrar);
        Cliente cliente=(Cliente)getIntent().getExtras().getSerializable("cliente");
        mostrar.setText(cliente.toString());

        salir=(Button)findViewById(R.id.salir);

        salir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( Intent.ACTION_MAIN); //Llamando a la activity principal
                finish();





            }
        });



    }
}
