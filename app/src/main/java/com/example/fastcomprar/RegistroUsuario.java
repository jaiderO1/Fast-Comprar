package com.example.fastcomprar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RegistroUsuario extends AppCompatActivity {
    Button button;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        imageButton=findViewById(R.id.RetornoUsuario);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button=findViewById(R.id.registrarUser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volverInicio = new Intent(RegistroUsuario.this,InicioSesion.class);
                startActivity(volverInicio);
            }
        });
    }
}