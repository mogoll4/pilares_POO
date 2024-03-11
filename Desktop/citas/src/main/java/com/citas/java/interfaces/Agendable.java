package com.citas.java.interfaces;

import java.time.LocalDateTime;

public interface Agendable {
    //Definir comportamientos que otras clases deben implementar.
    public void agendarCta(LocalDateTime fecha);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fecha);

                                                                                                                                                                                                                                                                                            
}
