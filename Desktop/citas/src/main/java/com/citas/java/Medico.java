package com.citas.java;

import com.citas.java.Especialidad;
public class Medico extends Usuario {
    private  Long registroMedico;
    private Especialidad especialidad;

    public Medico(int id, 
        String nombres, 
        String apellidos, 
        com.citas.java.TipoIdentificacion cc, 
        int i) {
        //la invocacion o llamado a super debe ser la primera instruccion en el construsctor
        //de la clase hija
            super(id, nombres, 
                apellidos, 
                cc, 
                i);
                this.registroMedico = registroMedico;
                this.especialidad = especialidad;
        
    }


    
   
    


    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }



    public Especialidad getEspecialidad() {
        return especialidad;
    }



    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    
}
