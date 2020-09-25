package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnInListener, btnPorClasAno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInListener = findViewById(R.id.btnInListener);
        btnPorClasAno = findViewById(R.id.btnPorClasAno);
        btnInListener.setOnClickListener(this);
        //final Context context = getApplicationContext();

        btnPorClasAno.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "POR CLASE ANÓNIMA 2", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    //EVENTO CLICK
    public void miClick(View v){
        Toast.makeText(this, "HOLA MUNDO", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "EVENTO POR INTERFAZ", Toast.LENGTH_LONG).show();
    }
}