package business;

import java.sql.Timestamp;

public class Evento {
    private int idEvento;
    private String nombreEvento;
    private Timestamp fechaHora;
    private int numeroAsistentes;
    private String tipoEvento;

    public Evento(int idEvento, String nombreEvento, Timestamp fechaHora, int numeroAsistentes, String tipoEvento) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.fechaHora = fechaHora;
        this.numeroAsistentes = numeroAsistentes;
        this.tipoEvento = tipoEvento;
    }

    // Getters y Setters
}