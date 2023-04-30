package com.example.ac2_parte1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ac2_parte1.adapter.SaibaMaisAdapter;
import com.example.ac2_parte1.dataset.SaibaMaisDataset;
import com.example.ac2_parte1.model.SaibaMais;

public class MainActivity extends AppCompatActivity {
    Button btnSaibaMais1;
    Button btnSaibaMais2;
    Button btnSaibaMais3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaibaMais1 = (Button) findViewById(R.id.btnSaibaMais1);
        btnSaibaMais2 = (Button) findViewById(R.id.btnSaibaMais2);
        btnSaibaMais3 = (Button) findViewById(R.id.btnSaibaMais4);

        btnSaibaMais1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        SaibaMaisActivity.class);
                intent.putExtra("opcao1", "opcao1");
                startActivity(intent);
            }
        });

        btnSaibaMais2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        SaibaMaisActivity.class);
                intent.putExtra("opcao2", "opcao2");
                startActivity(intent);
            }
        });

        btnSaibaMais3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        SaibaMaisActivity.class);
                intent.putExtra("opcao3", "opcao3");
                startActivity(intent);
            }
        });

    }
}