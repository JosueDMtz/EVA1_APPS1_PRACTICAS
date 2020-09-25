package com.example.eva1_3_widgets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarar un objeto del mismo tipo del widget a modificar
    TextView txtVwHolaMundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //NO EXISTE LA INTERFAZ GRÁFICA
        setContentView(R.layout.activity_main);
        //YA EXISTE LA INTERFAZ GRÁFICA
        //VINCULAR EL COMPONENTE
        txtVwHolaMundo = findViewById(R.id.txtViewDatos);
        txtVwHolaMundo.setText("CÓDIGO EN ANDROID");

    }
}