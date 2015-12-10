package main;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Nupp extends JButton {

    public Nupp (String nimi) {
        super(nimi);
        this.setFont(new Font("Sans_Serif", Font.PLAIN, 16));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.addMouseListener(new HiireKuulaja());
    }
}
