package com.example.ac2_parte1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ac2_parte1.adapter.SaibaMaisAdapter;
import com.example.ac2_parte1.dataset.SaibaMaisDataset;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SaibaMaisActivity extends AppCompatActivity {

    MainActivity mainActivity;

    private RecyclerView recyclerAlbum;
    private SaibaMaisAdapter albumAdapter;

    Button site;
    Button mapa;
    Button telefonar;

    FloatingActionButton voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saiba_mais);
        site = (Button) findViewById(R.id.btnSite);
        mapa = (Button) findViewById(R.id.btnMapa);
        telefonar = (Button) findViewById(R.id.btnTelefonar);
        voltar = (FloatingActionButton) findViewById(R.id.btnVoltar);

        if(getIntent().hasExtra("opcao1")){
            lista1();

            //ABRIR MAPA
            mapa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://goo.gl/maps/jN6RPL6Qc842g4cS9");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                }
            });

            //ABRIR SITE
            site.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.sorocaba.sp.gov.br/zoologico/");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                }
            });

            //TELEFONAR
            telefonar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(SaibaMaisActivity.this,
                            TelefonarActivity.class);
                    intent.putExtra("opcao1", "opcao1");
                    startActivity(intent);
                }
            });

        }
        else if(getIntent().hasExtra("opcao2")){
            lista2();

            //ABRIR MAPA
            mapa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://goo.gl/maps/Y3dgnGy1y7S8ZYjX8");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                }
            });

            //ABRIR SITE
            site.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://iguatemi.com.br/esplanada/");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                }
            });

            //TELEFONAR
            telefonar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(SaibaMaisActivity.this,
                            TelefonarActivity.class);
                    intent.putExtra("opcao2", "opcao2");
                    startActivity(intent);
                }
            });
        }
        else if(getIntent().hasExtra("opcao3")){
            lista3();

            //ABRIR MAPA
            mapa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://goo.gl/maps/dUQSWNYr9NE3bzCb9");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                }
            });

            //ABRIR SITE
            site.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://meioambiente.sorocaba.sp.gov.br/gestaoambiental/parque-natural-chico-mendes/");
                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i);
                }
            });

            //TELEFONAR
            telefonar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(SaibaMaisActivity.this,
                            TelefonarActivity.class);
                    intent.putExtra("opcao3", "opcao3");
                    startActivity(intent);
                }
            });
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SaibaMaisActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void lista1() {
        recyclerAlbum = (RecyclerView)findViewById(R.id.recyclerAlbum);
        recyclerAlbum.setLayoutManager(new LinearLayoutManager(this));
        albumAdapter = new SaibaMaisAdapter(SaibaMaisDataset.getlista1());
        recyclerAlbum.setAdapter(albumAdapter);
        recyclerAlbum.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }
    private void lista2() {
        recyclerAlbum = (RecyclerView)findViewById(R.id.recyclerAlbum);
        recyclerAlbum.setLayoutManager(new LinearLayoutManager(this));
        albumAdapter = new SaibaMaisAdapter(SaibaMaisDataset.getlista2());
        recyclerAlbum.setAdapter(albumAdapter);
        recyclerAlbum.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }
    private void lista3() {
        recyclerAlbum = (RecyclerView)findViewById(R.id.recyclerAlbum);
        recyclerAlbum.setLayoutManager(new LinearLayoutManager(this));
        albumAdapter = new SaibaMaisAdapter(SaibaMaisDataset.getlista3());
        recyclerAlbum.setAdapter(albumAdapter);
        recyclerAlbum.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }

}