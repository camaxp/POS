package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.pos.logica.Cliente;

public class Registro extends AppCompatActivity {

    public EditText nombres;
    public EditText apellidos;
    public EditText correoElectronico;
    public EditText telefono;
    public RadioGroup sexo;
    public EditText razonSocial;
    public EditText nit;
    public EditText contrasena;
    public EditText contrasena2;
    public CheckBox aceptoChk;
    public Button registrarme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);


        nombres=(EditText)findViewById(R.id.nombres);
        apellidos=(EditText)findViewById(R.id.apellidos);
        correoElectronico=(EditText)findViewById(R.id.correo);
        telefono=(EditText)findViewById(R.id.telefono);
        sexo=(RadioGroup) findViewById(R.id.sexo);
        razonSocial=(EditText)findViewById(R.id.razonSocial);
        nit=(EditText)findViewById(R.id.nit);
        contrasena=(EditText)findViewById(R.id.contraseña);
        contrasena2=(EditText)findViewById(R.id.contraseña2);
        aceptoChk=(CheckBox) findViewById(R.id.acepto);
        registrarme=(Button) findViewById(R.id.salir);

        registrarme.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), ResultadoExitoso.class);
                Cliente cliente= new Cliente();
                cliente.setNombres(nombres.getText().toString());
                cliente.setApellidos(apellidos.getText().toString());
                cliente.setCorreoElectronico(correoElectronico.getText().toString());
                cliente.setTelefono(telefono.getText().toString());
                cliente.setSexo(((RadioButton) findViewById(sexo.getCheckedRadioButtonId())).getText().toString());
                cliente.setRazonSocial(razonSocial.getText().toString());
                cliente.setNit(nit.getText().toString());
                cliente.setContrasena(contrasena.getText().toString());
                cliente.setContrasena2(contrasena2.getText().toString());
                cliente.setAceptoChk((aceptoChk.isSelected())?new Short("1"):new Short("0"));




                myIntent.putExtra("cliente",cliente);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });



    }
}
