package com.example.ac2_parte1.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac2_parte1.R;

public class SaibaMaisHolder extends RecyclerView.ViewHolder {

    private ImageView imagem1;
    private ImageView imagem2;
    private ImageView imagem3;
    private TextView desc;


    public SaibaMaisHolder(@NonNull View itemView) {
        super(itemView);
        imagem1 = (ImageView) itemView.findViewById(R.id.image1);
        imagem2 = (ImageView) itemView.findViewById(R.id.image2);
        imagem3 = (ImageView) itemView.findViewById(R.id.image3);
        desc = (TextView) itemView.findViewById(R.id.txtDesc);
    }

    public ImageView getImagem1() {
        return imagem1;
    }

    public void setImagem1(ImageView imagem1) {
        this.imagem1 = imagem1;
    }

    public ImageView getImagem2() {
        return imagem2;
    }

    public void setImagem2(ImageView imagem2) {
        this.imagem2 = imagem2;
    }

    public ImageView getImagem3() {
        return imagem3;
    }

    public void setImagem3(ImageView imagem3) {
        this.imagem3 = imagem3;
    }

    public TextView getDesc() {
        return desc;
    }

    public void setDesc(TextView desc) {
        this.desc = desc;
    }
}
