package main;
import javax.swing.*;
import java.awt.*;


public abstract class Leht extends JPanel {

    JButton tagasiNupp = new JButton("TAGASI");


    public void paintComponent(Graphics g) {
        setBackground(new Color(0.8F, 0.8F, 1.0F));
        super.paintComponent(g);
        this.setLayout(null);
        this.setBounds(50, 50, 100, 100 );

    }
}
