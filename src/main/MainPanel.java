package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;

public class MainPanel extends JPanel {

    private String pealkiri;
    private int suurus;


    public MainPanel(String nimi, int suurus) {

        this.pealkiri = nimi;
        this.suurus = suurus;
    }

    public void paintComponent(Graphics g) {
        setBackground(new Color(0.8F, 0.8F, 1.0F));
        super.paintComponent(g);
        g.setColor(Color.getHSBColor(0.78F,0.8F, 0.5F));
        g.setFont(new Font("SANS_SERIF", Font.BOLD, 66));
        g.drawString(pealkiri, suurus, 100);
    }
}
