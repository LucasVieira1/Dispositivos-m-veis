package com.example.ac1_parte2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ac1_parte2.R;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.ac1_parte2.model.Album;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumHolder>{
    private List<Album> album;
    public AlbumAdapter(List<Album> album){
        this.album = album;
    }
    @NonNull
    @Override
    public AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AlbumHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_album, parent,
                                false));

    }

    @Override
    public void onBindViewHolder(@NonNull AlbumHolder holder, int position) {
        Album albuns = album.get(position);
        holder.getBanda().setText(albuns.getBanda());
        holder.getAno().setText(albuns.getAno() + "");
        holder.getFotografo().setText(albuns.getFotografo());
        holder.getSaibamais().setOnClickListener(view -> Toast.makeText( view.getContext(), "" +
                albuns.getSaibamais(), Toast.LENGTH_SHORT).show());
        holder.getImagem().setImageResource(albuns.getImagem());
    }

    @Override
    public int getItemCount() {

        return album == null ? 0 : album.size();
    }
}
