package data;

import business.Reserva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {
    public void createReserva(Reserva reserva) throws SQLException {
        String query = "INSERT INTO Reservas (idEspacio, idEvento, fechaHoraReserva, estadoReserva) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, reserva.getIdEspacio());
            ps.setInt(2, reserva.getIdEvento());
            ps.setTimestamp(3, Timestamp.valueOf(reserva.getFechaHoraReserva()));
            ps.setString(4, reserva.getEstadoReserva());
            ps.executeUpdate();
        }
    }
}