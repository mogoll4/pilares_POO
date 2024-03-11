package com.citas.java;
import com.citas.java.Especialidad;
import com.citas.java.TipoIdentificacion;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
      
        //Crear o instanciar un medico
        Medico m = new Medico(1, 
        "Paula", 
        "Ortiz", 
        TipoIdentificacion.CC, 
        1235907490);

    }
}