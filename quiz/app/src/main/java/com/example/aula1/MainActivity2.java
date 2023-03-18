package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup groupRespostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        groupRespostas = (RadioGroup) findViewById(R.id.groupRespostas);

    }

    public void responder(View view){
        RadioButton radioSelecionado = (RadioButton)
                findViewById(groupRespostas.getCheckedRadioButtonId());
        Toast.makeText(this, radioSelecionado.getText().toString(), Toast.LENGTH_SHORT).show();

        String resposta = "4";

        if(radioSelecionado.getText().toString().equals(resposta)){
            Toast.makeText(this, "Resposta certa!", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this, "Resposta Errada! A resposta certa é 4!", Toast.LENGTH_SHORT).show();
        }
    }
}