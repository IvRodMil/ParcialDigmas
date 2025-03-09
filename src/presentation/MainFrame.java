package presentation;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Gestión de Eventos y Reservas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar componentes
        initUI();
    }

    private void initUI() {
        // Crear un panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Crear un panel de botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton btnEspacios = new JButton("Gestionar Espacios");
        JButton btnEventos = new JButton("Gestionar Eventos");
        JButton btnReservas = new JButton("Gestionar Reservas");

        // Agregar listeners a los botones
        btnEspacios.addActionListener(e -> {
            // Lógica para gestionar espacios
            JOptionPane.showMessageDialog(this, "Abrir gestión de espacios");
        });

        btnEventos.addActionListener(e -> {
            // Lógica para gestionar eventos
            JOptionPane.showMessageDialog(this, "Abrir gestión de eventos");
        });

        btnReservas.addActionListener(e -> {
            // Lógica para gestionar reservas
            JOptionPane.showMessageDialog(this, "Abrir gestión de reservas");
        });

        // Agregar botones al panel de botones
        buttonPanel.add(btnEspacios);
        buttonPanel.add(btnEventos);
        buttonPanel.add(btnReservas);

        // Agregar el panel de botones al panel principal
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Agregar el panel principal a la ventana
        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}