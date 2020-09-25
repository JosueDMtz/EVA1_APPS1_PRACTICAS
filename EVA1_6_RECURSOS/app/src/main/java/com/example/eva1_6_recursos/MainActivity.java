package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVwDatos;
    ImageView imVwAnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imVwAnd = findViewById(R.id.imVwAnd);
        txtVwDatos = findViewById(R.id.txtVwDatos);
        imVwAnd.setImageResource(R.drawable.cloud2);
        txtVwDatos.setText(R.string.mis_datos);
    }
}