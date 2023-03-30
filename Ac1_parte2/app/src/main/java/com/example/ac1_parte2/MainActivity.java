package com.example.ac1_parte2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ac1_parte2.adapter.AlbumAdapter;
import com.example.ac1_parte2.dataset.AlbumDataset;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerAlbum;
    private AlbumAdapter albumAdapter;

    boolean muda = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecycler();
    }

    private void setupRecycler() {
        recyclerAlbum = (RecyclerView)findViewById(R.id.recyclerAlbum);
        recyclerAlbum.setLayoutManager(new LinearLayoutManager(this));
        albumAdapter = new AlbumAdapter(AlbumDataset.getlista());
        recyclerAlbum.setAdapter(albumAdapter);
        recyclerAlbum.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }

    public void mudaGrid(View view) {
        if(muda == false){
            recyclerAlbum.setLayoutManager(new LinearLayoutManager(this,
                    RecyclerView.VERTICAL,false));
            muda =true;
        }else{
            recyclerAlbum.setLayoutManager(new GridLayoutManager(this,2));
            muda = false;

        }

    }

    public void teste(View view) {
        Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show();
    }




}