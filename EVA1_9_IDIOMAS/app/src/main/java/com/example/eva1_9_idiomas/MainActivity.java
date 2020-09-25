package com.example.eva1_9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpIdiomas;
    RadioButton btnEspanol;
    RadioButton btnIngles;
    RadioButton btnMucho, btnPoco, btnNada;
    TextView txtVwNom, txtVwApe, txtVwSex;
    EditText editTextNom, editTextApe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpIdiomas = findViewById(R.id.rdGrpIdiomas);
        btnEspanol = findViewById(R.id.btnEspañol);
        btnIngles = findViewById(R.id.btnIngles);
        btnMucho = findViewById(R.id.btnMucho);
        btnPoco = findViewById(R.id.btnPoco);
        btnNada = findViewById(R.id.btnNada);
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwApe = findViewById(R.id.txtVwApe);
        txtVwSex = findViewById(R.id.txtVwSex);
        editTextNom = findViewById(R.id.editTextNom);
        editTextApe = findViewById(R.id.editTextApe);

        rdGrpIdiomas.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.btnEspañol){
                    btnEspanol.setText(R.string.btn_es_español);
                    btnIngles.setText(R.string.btn_es_ingles);
                    btnMucho.setText(R.string.btn_es_mucho);
                    btnPoco.setText(R.string.btn_es_poco);
                    btnNada.setText(R.string.btn_es_nada);
                    txtVwNom.setText(R.string.txt_es_nombre);
                    txtVwApe.setText(R.string.txt_es_apellido);
                    txtVwSex.setText(R.string.txt_es_sexo);
                    editTextNom.setText(R.string.hint_es_nombre);
                    editTextApe.setText(R.string.hint_es_apellido);
                }else if (i == R.id.btnIngles){
                    btnEspanol.setText(R.string.btn_en_español);
                    btnIngles.setText(R.string.btn_en_ingles);
                    btnMucho.setText(R.string.btn_en_mucho);
                    btnPoco.setText(R.string.btn_en_poco);
                    btnNada.setText(R.string.btn_en_nada);
                    txtVwNom.setText(R.string.txt_en_nombre);
                    txtVwApe.setText(R.string.txt_en_apellido);
                    txtVwSex.setText(R.string.txt_en_sexo);
                    editTextNom.setText(R.string.hint_en_nombre);
                    editTextApe.setText(R.string.hint_en_apellido);
                }
            }
        });
    }
}