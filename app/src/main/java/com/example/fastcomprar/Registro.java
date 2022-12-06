package com.example.fastcomprar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Registro extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    Button button;
    Integer vista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_registro);
        imageButton=findViewById(R.id.Retorno);
        imageButton2=findViewById(R.id.registro_negocio);
        imageButton3=findViewById(R.id.registro_usuario);
        button=findViewById(R.id.confirmar_opcion);
        vista=0;
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vista=1;
                imageButton2.setAlpha((float)0.9);
                imageButton3.setAlpha((float)0.7);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vista=2;
                imageButton3.setAlpha((float)0.9);
                imageButton2.setAlpha((float)0.7);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambiarUsuario = new Intent(Registro.this,RegistroUsuario.class);
                Intent cambiarNegocio = new Intent(Registro.this,RegistroNegocio.class);
                if (vista==1)
                    startActivity(cambiarNegocio);
                    imageButton2.setAlpha((float)0.7);
                    imageButton3.setAlpha((float)0.7);
                if (vista==2)
                    startActivity(cambiarUsuario);
                    imageButton2.setAlpha((float)0.7);
                    imageButton3.setAlpha((float)0.7);
            }
        });

    }
}