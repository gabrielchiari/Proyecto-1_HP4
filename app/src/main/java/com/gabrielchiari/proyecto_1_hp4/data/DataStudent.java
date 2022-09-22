package com.gabrielchiari.proyecto_1_hp4.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class DataStudent implements Serializable {
    private String cedula, nombre, apellido, genero;
    private boolean voted = false;

    public DataStudent(String ced, String nom, String ape, String gene) {
        this.cedula = ced;
        this.nombre = nom;
        this.apellido = ape;
        this.genero = gene;
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String ced) {
        this.cedula = ced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String gene) {
        this.genero = gene;
    }

    public boolean getVoted() {
        return voted;
    }

    public void setVoted(boolean votado) {
        this.voted = votado;
    }

}

