package data;

import business.Reserva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {
    public void createReserva(Reserva reserva) {
        String query = "INSERT INTO Reservas (idEspacio, idEvento, fechaHoraReserva, estadoReserva) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            if (reserva == null) {
                throw new IllegalArgumentException("La reserva no puede ser nula");
            }

            ps.setInt(1, reserva.getIdEspacio());
            ps.setInt(2, reserva.getIdEvento());
            ps.setTimestamp(3, Timestamp.valueOf(reserva.getFechaHoraReserva()));
            ps.setString(4, reserva.getEstadoReserva());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al crear la reserva: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public Reserva readReserva(int id) {
        String query = "SELECT * FROM Reservas WHERE id = ?";
        Reserva reserva = null;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                reserva = new Reserva(
                        rs.getInt("idEspacio"),
                        rs.getInt("idEvento"),
                        rs.getTimestamp("fechaHoraReserva").toLocalDateTime(),
                        rs.getString("estadoReserva")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al leer la reserva: " + e.getMessage());
        }
        return reserva;
    }

    public void updateReserva(Reserva reserva) {
        String query = "UPDATE Reservas SET idEspacio = ?, idEvento = ?, fechaHoraReserva = ?, estadoReserva = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, reserva.getIdEspacio());
            ps.setInt(2, reserva.getIdEvento());
            ps.setTimestamp(3, Timestamp.valueOf(reserva.getFechaHoraReserva()));
            ps.setString(4, reserva.getEstadoReserva());
            ps.setInt(5, reserva.getIdEspacio());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar la reserva: " + e.getMessage());
        }
    }

    public void deleteReserva(int id) {
        String query = "DELETE FROM Reservas WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar la reserva: " + e.getMessage());
        }
    }
}