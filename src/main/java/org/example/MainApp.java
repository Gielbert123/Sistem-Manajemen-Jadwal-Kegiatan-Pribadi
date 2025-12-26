package org.example;

import org.example.Kegiatan;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class MainApp extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private List<Kegiatan> daftarKegiatan;

    public MainApp() {
        setTitle("Personal Activity Manager");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        daftarKegiatan = FileHandler.bacaSemua();
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Inisialisasi Halaman
        mainPanel.add(buatDashboard(), "Dashboard");
        mainPanel.add(buatInputPage(), "Input");
        mainPanel.add(buatListPage(), "List");
        mainPanel.add(buatLaporanPage(), "Laporan");

        add(mainPanel);
        setVisible(true);
    }

    // --- 1. HALAMAN DASHBOARD ---
    private JPanel buatDashboard() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
        panel.setBackground(new Color(240, 248, 255));

        JLabel title = new JLabel("MANAGEMENT JADWAL", JLabel.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 24));

        JButton btnInput = new JButton("Input Jadwal Baru");
        JButton btnList = new JButton("Lihat Daftar Jadwal");
        JButton btnReport = new JButton("Laporan Statistik");

        styleButton(btnInput); styleButton(btnList); styleButton(btnReport);

        btnInput.addActionListener(e -> cardLayout.show(mainPanel, "Input"));
        btnList.addActionListener(e -> {
            mainPanel.add(buatListPage(), "List"); // Refresh data
            cardLayout.show(mainPanel, "List");
        });
        btnReport.addActionListener(e -> {
            mainPanel.add(buatLaporanPage(), "Laporan"); // Refresh data
            cardLayout.show(mainPanel, "Laporan");
        });

        panel.add(title);
        panel.add(btnInput);
        panel.add(btnList);
        panel.add(btnReport);
        return panel;
    }

    // --- 2. HALAMAN INPUT ---
    private JPanel buatInputPage() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextField txtJudul = new JTextField(15);
        JTextField txtTgl = new JTextField("YYYY-MM-DD", 15);
        String[] kats = {"Pekerjaan", "Kuliah", "Hobi", "Lainnya"};
        JComboBox<String> cbKat = new JComboBox<>(kats);

        gbc.gridx = 0; gbc.gridy = 0; panel.add(new JLabel("Judul Kegiatan:"), gbc);
        gbc.gridx = 1; panel.add(txtJudul, gbc);
        gbc.gridx = 0; gbc.gridy = 1; panel.add(new JLabel("Tanggal:"), gbc);
        gbc.gridx = 1; panel.add(txtTgl, gbc);
        gbc.gridx = 0; gbc.gridy = 2; panel.add(new JLabel("Kategori:"), gbc);
        gbc.gridx = 1; panel.add(cbKat, gbc);

        JButton btnSimpan = new JButton("Simpan");
        JButton btnBack = new JButton("Kembali");

        btnSimpan.addActionListener(e -> {
            daftarKegiatan.add(new Kegiatan(txtJudul.getText(), txtTgl.getText(), cbKat.getSelectedItem().toString()));
            FileHandler.simpanSemua(daftarKegiatan);
            JOptionPane.showMessageDialog(this, "Jadwal Berhasil Disimpan!");
            cardLayout.show(mainPanel, "Dashboard");
        });

        btnBack.addActionListener(e -> cardLayout.show(mainPanel, "Dashboard"));

        gbc.gridx = 0; gbc.gridy = 3; panel.add(btnBack, gbc);
        gbc.gridx = 1; panel.add(btnSimpan, gbc);

        return panel;
    }


    private void styleButton(JButton btn) {
        btn.setBackground(new Color(70, 130, 180));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Arial", Font.BOLD, 14));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::new);
    }
}