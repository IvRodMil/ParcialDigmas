package business;

import java.time.LocalDateTime;

public class Reserva {
    private int idEspacio;
    private int idEvento;
    private LocalDateTime fechaHoraReserva;
    private String estadoReserva;

    // Constructor
    public Reserva(int idEspacio, int idEvento, LocalDateTime fechaHoraReserva, String estadoReserva) {
        this.idEspacio = idEspacio;
        this.idEvento = idEvento;
        this.fechaHoraReserva = fechaHoraReserva;
        this.estadoReserva = estadoReserva;
    }

    // Getters
    public int getIdEspacio() {
        return idEspacio;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public LocalDateTime getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }
}