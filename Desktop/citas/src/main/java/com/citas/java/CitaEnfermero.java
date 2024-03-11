package com.citas.java;

import java.time.LocalDateTime;

import com.citas.java.interfaces.Agendable;

public class CitaEnfermero extends Cita implements Agendable{

    

    private String procedimiento;
    private Enfermeros enfermero;

    public CitaEnfermero(Integer id, 
    LocalDateTime fecha, 
    Paciente paciente, 
    com.citas.java.consultorio consultorio,
    Enfermeros e,
    String p) {
        super(id, fecha, paciente, consultorio);
        this.enfermero = e;
        this.procedimiento = p;
    }

    @Override
    public void agendarCta(LocalDateTime fecha) {
        super.fecha = fecha;
    }

    @Override
    public void cancelarCita() {
      System.out.println("cita cancelada");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
       super.fecha = fecha;
    }

}
