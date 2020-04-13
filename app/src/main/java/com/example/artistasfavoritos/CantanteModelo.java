package com.example.artistasfavoritos;

public class CantanteModelo {
    private String catante, nacionalidad;
    private int imgcatante;

    public CantanteModelo() {
    }

    public CantanteModelo(String catante, String nacionalidad, int imgcatante) {
        this.catante = catante;
        this.nacionalidad = nacionalidad;
        this.imgcatante = imgcatante;
    }

    public String getCatante() {
        return catante;
    }

    public void setCatante(String catante) {
        this.catante = catante;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getImgcatante() {
        return imgcatante;
    }

    public void setImgcatante(int imgcatante) {
        this.imgcatante = imgcatante;
    }
}
