package com.example.ac1_parte2.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac1_parte2.R;
public class AlbumHolder extends RecyclerView.ViewHolder{
    private TextView banda;
    private TextView ano;
    private TextView fotografo;
    private Button saibamais;
    private ImageView imagem;

    public AlbumHolder(@NonNull View itemView) {
        super(itemView);
        banda = (TextView) itemView.findViewById(R.id.banda);
        ano = (TextView) itemView.findViewById(R.id.ano);
        fotografo = (TextView) itemView.findViewById(R.id.fotografo);
        imagem = (ImageView) itemView.findViewById(R.id.imagem);
        saibamais = (Button) itemView.findViewById(R.id.btnMais);

    }

    public TextView getBanda() {
        return banda;
    }

    public TextView getAno() {
        return ano;
    }

    public TextView getFotografo() {
        return fotografo;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public Button getSaibamais() {
        return saibamais;
    }
}
