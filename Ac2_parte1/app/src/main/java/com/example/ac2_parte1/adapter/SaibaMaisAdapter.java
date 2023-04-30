package com.example.ac2_parte1.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac2_parte1.R;
import com.example.ac2_parte1.model.SaibaMais;

import java.util.List;

public class SaibaMaisAdapter extends RecyclerView.Adapter<SaibaMaisHolder> {

    private List<SaibaMais> saiba;

    public SaibaMaisAdapter(List<SaibaMais> a) {
        this.saiba = a;
    }

    @NonNull
    @Override
    public SaibaMaisHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SaibaMaisHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.saibamais_layout, parent,
                                false));    }

    @Override
    public void onBindViewHolder(@NonNull SaibaMaisHolder holder, int position) {
        SaibaMais saibaMais = saiba.get(position);
        holder.getImagem1().setImageResource(saibaMais.getImage1());
        holder.getImagem2().setImageResource(saibaMais.getImage2());
        holder.getImagem3().setImageResource(saibaMais.getImage3());
        holder.getDesc().setText(saibaMais.getDesc());
    }

    @Override
    public int getItemCount() {
        return saiba == null ? 0 : saiba.size();
    }
}
