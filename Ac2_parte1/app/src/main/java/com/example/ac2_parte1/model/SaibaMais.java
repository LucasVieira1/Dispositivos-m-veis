package com.example.ac2_parte1.model;

public class SaibaMais {

    public int image1;
    public int image2;
    public int image3;
    public String desc;
    public int cont = 0;

    public SaibaMais(int cont) {
        this.cont = cont;
    }

    public SaibaMais() {
    }

    public SaibaMais(int image1, int image2, int image3, String desc) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.desc = desc;
    }
    public int getCont() {
        return this.cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
