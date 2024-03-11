package com.citas.java;

import java.time.LocalDate;

public class Paciente {
   
    private String correoElectronico;
    private Integer celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre TipoSangre;
    private char factorRH;
    


    public String getCorreoElectronico() {
        return correoElectronico;
    }



    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }



    public Integer getCelular() {
        return celular;
    }



    public void setCelular(Integer celular) {
        this.celular = celular;
    }



    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }



    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public Double getAltura() {
        return altura;
    }



    public void setAltura(Double altura) {
        this.altura = altura;
    }



    public Double getPeso() {
        return peso;
    }



    public void setPeso(Double peso) {
        this.peso = peso;
    }



    public TipoSangre getTipoSangre() {
        return TipoSangre;
    }



    public void setTipoSangre(TipoSangre tipoSangre) {
        TipoSangre = tipoSangre;
    }



    public char getFactorRH() {
        return factorRH;
    }



    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    
    
}
