package business;

import java.time.LocalDateTime;

public class Reserva {
    private int idReserva;
    private int idEspacio;
    private int idEvento;
    private LocalDateTime fechaHoraReserva;
    private String estadoReserva;

    public Reserva(int idEspacio, int idEvento, LocalDateTime fechaHoraReserva, String estadoReserva) {
        this.idEspacio = idEspacio;
        this.idEvento = idEvento;
        this.fechaHoraReserva = fechaHoraReserva;
        this.estadoReserva = estadoReserva;
    }

    // Getters y Setters
}