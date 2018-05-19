package com.company.hiro.sandbox.customclass;

public class itemGridView {

    public String texto;
    public int resDrawable;

    public itemGridView(String texto, int resDrawable) {
        this.texto = texto;
        this.resDrawable = resDrawable;
    }

    @Override
    public String toString() {
        return "Texto: " + texto + " \nResDrawable: " + resDrawable;
    }
}
