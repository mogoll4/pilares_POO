package com.citas.java;

import java.time.LocalDateTime;



public class Cita {
    
    protected Integer Id;
    protected LocalDateTime fecha;
    protected Paciente paciente;
    protected consultorio consultorio;
    
    
    

    public Cita(Integer id, 
    LocalDateTime fecha, Paciente paciente,
            com.citas.java.consultorio consultorio) {
        Id = id;
        this.fecha = fecha;
        
        this.paciente = paciente;
        this.consultorio = consultorio;
    }







    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }







    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }




    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }







    public consultorio getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(consultorio consultorio) {
        this.consultorio = consultorio;
    }



    
    
}
