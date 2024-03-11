package com.citas.java;

import java.time.LocalDateTime;

import com.citas.java.enums.EstadoCita;
import com.citas.java.interfaces.Agendable;

public class CitaMedico extends Cita implements Agendable {

    private Medico medico;
    private String motivo;
    private EstadoCita estado;

    public CitaMedico(Integer id, 
    LocalDateTime fecha, 
    Paciente paciente, 
    com.citas.java.consultorio consultorio,
    Medico m,
    String motivo,
    EstadoCita estado) {
        super(id, fecha, paciente, consultorio);
        this.medico = m;
        this.motivo = motivo;
        this.estado = estado;
       
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCta(LocalDateTime fecha) {
        super.setFecha(fecha); 
        this.estado = EstadoCita.AGENDADA;
    }

    @Override
    public void cancelarCita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        super.fecha = fecha;
    }

    

}
