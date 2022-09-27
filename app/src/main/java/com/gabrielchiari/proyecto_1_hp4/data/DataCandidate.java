package com.gabrielchiari.proyecto_1_hp4.data;

import java.io.Serializable;

public class DataCandidate implements Serializable {
    private String nombreCompleto;
    private int _id, votosAdquiridos = 0, fotoPerfil;

    public DataCandidate(int id, int avatar, String fullName) {
        _id = id;
        nombreCompleto = fullName;
        fotoPerfil = avatar;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public int getAvatar() {
        return fotoPerfil;
    }

    public void setAvatar(int avatar) {
        fotoPerfil = avatar;
    }

    public int getVotos() {
        return votosAdquiridos;
    }

    public void setVotos(int votos) {
        votosAdquiridos = votos;
    }

    public String getFullName() {
        return nombreCompleto;
    }

    public void setFullName(String fullName) {
        nombreCompleto = fullName;
    }

}
