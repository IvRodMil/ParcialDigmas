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

    // Getters y Setters
}
