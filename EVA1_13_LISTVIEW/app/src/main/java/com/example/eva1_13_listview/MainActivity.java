package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //DATOS
    String[] datos = {
            "Mole",
            "Tacos",
            "Tortas",
            "Burritos",
            "Tamales",
            "Enchiladas",
            "Quesadillas con queso",
            "Quesadillas sin queso",
            "Pizza",
            "Alitas",
            "Montados",
            "Huaraches",
            "Tlacoyos",
            "Gorditas",
            "Empanadas",
            "Flautas",
            "Enmoladas"};
    ListView lsVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsVwDatos = findViewById(R.id.lsVwDatos);

        lsVwDatos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                datos
        ));

        lsVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}