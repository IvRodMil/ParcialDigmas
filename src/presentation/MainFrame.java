package presentation;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Gestión de Eventos y Reservas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Aquí se pueden añadir los paneles o formularios necesarios
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}