import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame {
    private JTextField field1, field2, hasil;
    private JButton tambah, kurang, kali, bagi;

    public Kalkulator() {
        setTitle("Kalkulator Sederhana");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Komponen
        field1 = new JTextField();
        field2 = new JTextField();
        hasil = new JTextField();
        hasil.setEditable(false);

        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");

        // Tambahkan komponen ke frame
        add(new JLabel("Angka 1:"));
        add(field1);
        add(new JLabel("Angka 2:"));
        add(field2);
        add(new JLabel("Hasil:"));
        add(hasil);
        add(tambah);
        add(kurang);
        add(kali);
        add(bagi);

        // Event handling
        tambah.addActionListener(e -> hitung('+'));
        kurang.addActionListener(e -> hitung('-'));
        kali.addActionListener(e -> hitung('*'));
        bagi.addActionListener(e -> hitung('/'));

        setVisible(true);
    }

    private void hitung(char operator) {
        try {
            double angka1 = Double.parseDouble(field1.getText());
            double angka2 = Double.parseDouble(field2.getText());
            double result = 0;

            switch (operator) {
                case '+': result = angka1 + angka2; break;
                case '-': result = angka1 - angka2; break;
                case '*': result = angka1 * angka2; break;
                case '/': 
                    if (angka2 == 0) {
                        JOptionPane.showMessageDialog(this, "Tidak bisa dibagi 0!");
                        return;
                    }
                    result = angka1 / angka2;
                    break;
            }
            hasil.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input tidak valid!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Kalkulator::new);
    }
}
