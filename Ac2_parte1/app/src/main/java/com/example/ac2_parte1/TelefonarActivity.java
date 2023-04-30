package com.example.ac2_parte1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelefonarActivity extends AppCompatActivity {

    FloatingActionButton voltar;

    Button btnDiscar;
    TextView txtNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefonar);
        voltar = (FloatingActionButton) findViewById(R.id.btnVoltar1);
        btnDiscar = (Button) findViewById(R.id.btnDiscar);
        txtNumero = (TextView) findViewById(R.id.txtNumero);

        if(getIntent().hasExtra("opcao1")){
            txtNumero.setText("(15) 3227-5454");
        }
        else if(getIntent().hasExtra("opcao2")){
            txtNumero.setText("(15) 3042-1400");
        }
        else if(getIntent().hasExtra("opcao3")){
            txtNumero.setText("(15) 3228-1256");
        }


            voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelefonarActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });

        btnDiscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fazerLigacao(Intent.ACTION_CALL);
            }
        });
    }

    private void fazerLigacao(String acao) {
        Uri uri = Uri.parse("tel:" + txtNumero.getText().toString());
        Intent i = new Intent(acao,uri);

        int permissao = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);
        if(permissao != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{
                    Manifest.permission.CALL_PHONE
            },1);
        }else {
            startActivity(i);
        }
    }
}