package com.example.fastcomprar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InicioSesion extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_iniciar);
        textView=findViewById(R.id.Registro);
        button=findViewById(R.id.ingresar);
        SpannableString mitextoU = new SpannableString("¿No tiene una cuenta? Regístrese");
        mitextoU.setSpan(new UnderlineSpan(), 0, mitextoU.length(), 0);
        textView.setText(mitextoU);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambiarRegistro = new Intent(InicioSesion.this,Registro.class);
                startActivity(cambiarRegistro);
            }
        });
    }
}