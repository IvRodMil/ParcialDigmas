package business;

public class Espacio {
    private int idEspacio;
    private String nombreEspacio;
    private String direccion;
    private int capacidad;
    private String tipoEvento;

    public Espacio(int idEspacio, String nombreEspacio, String direccion, int capacidad, String tipoEvento) {
        this.idEspacio = idEspacio;
        this.nombreEspacio = nombreEspacio;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.tipoEvento = tipoEvento;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
