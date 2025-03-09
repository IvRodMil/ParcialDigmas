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

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getNumeroAsistentes() {
        return numeroAsistentes;
    }

    public void setNumeroAsistentes(int numeroAsistentes) {
        this.numeroAsistentes = numeroAsistentes;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}