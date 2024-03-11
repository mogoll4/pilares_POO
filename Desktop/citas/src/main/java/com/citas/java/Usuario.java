package com.citas.java;

public class Usuario {
    //lo protege en la clase padre
    //sera privada en ñas clases hijas
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected String TipoIdentificacion;
    protected Long numeroIdentificacion;
   
   
   
   
    public Usuario(int id, String nombres, String apellidos, String tipoIdentificacion, Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        TipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }




    public Usuario(int id2, String nombres2, String apellidos2, com.citas.java.TipoIdentificacion cc, int i) {
        
    }




    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getNombres() {
        return nombres;
    }




    public void setNombres(String nombres) {
        this.nombres = nombres;
    }




    public String getApellidos() {
        return apellidos;
    }




    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }




    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }




    public void setTipoIdentificacion(String tipoIdentificacion) {
        TipoIdentificacion = tipoIdentificacion;
    }




    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }




    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    
    
}
