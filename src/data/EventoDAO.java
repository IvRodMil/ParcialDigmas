package data;

import business.Evento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventoDAO {
    public List<Evento> getAllEventos() throws SQLException {
        List<Evento> eventos = new ArrayList<>();
        String query = "SELECT * FROM Eventos";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Evento evento = new Evento(rs.getInt("idEvento"), rs.getString("nombreEvento"),
                        rs.getTimestamp("fechaHora"), rs.getInt("numeroAsistentes"), rs.getString("tipoEvento"));
                eventos.add(evento);
            }
        }
        return eventos;
    }
}