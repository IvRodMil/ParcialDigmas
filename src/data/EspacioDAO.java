package data;

import business.Espacio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EspacioDAO {
    public List<Espacio> getAllEspacios() throws SQLException {
        List<Espacio> espacios = new ArrayList<>();
        String query = "SELECT * FROM Espacios";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Espacio espacio = new Espacio(rs.getInt("idEspacio"), rs.getString("nombreEspacio"),
                        rs.getString("direccion"), rs.getInt("capacidad"), rs.getString("tipoEvento"));
                espacios.add(espacio);
            }
        }
        return espacios;
    }
}