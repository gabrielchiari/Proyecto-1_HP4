package com.gabrielchiari.proyecto_1_hp4.data;

public class DataStudent {
    private String cedula;
    private boolean voted = false;

    public DataStudent(String ced) {
        this.cedula = ced;}


    public String getCedula() {return cedula;}
    public void setCedula(String ced) {this.cedula = ced;}

    public boolean getVoted() {return voted;}
    public void setVoted(boolean votado) {this.voted = votado;}

}

