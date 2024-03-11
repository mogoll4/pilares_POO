package com.citas.java;

public class consultorio {
    private int Id;
    private String direccion;
    private int numero;
    
    
    public consultorio(int id, String direccion, int numero) {
        Id = id;
        this.direccion = direccion;
        this.numero = numero;
    }


    public int getId() {
        return Id;
    }


    public void setId(int id) {
        Id = id;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
