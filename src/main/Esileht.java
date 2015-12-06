package main;
import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.io.IOException;

public class Esileht extends JPanel {
    JPanel nupud = new JPanel();
    Nupp nupp1 = new Nupp("Arvutusülesanded");
    Nupp nupp2 = new Nupp("Võrrandid");
    Nupp nupp3 = new Nupp("Võrratused");
    Nupp nupp4 = new Nupp("Kujundid");
    Nupp nupp5 = new Nupp("Trigonomeetria");
    Nupp nupp6 = new Nupp("Vektorid");

    public Esileht() {
        nupud.setLayout(new GridLayout(2, 3));
        nupud.add(nupp1);
        nupud.add(nupp2);
        nupud.add(nupp3);
        nupud.add(nupp4);
        nupud.add(nupp5);
        nupud.add(nupp6);
        nupud.setSize(500, 200);
        nupud.setLocation(150, 200);

        this.setLayout(null);
        this.add(nupud);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Image pilt = (Image)ImageIO.read(getClass().getResourceAsStream("pildid/Esileht.jpg"));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {}
    }
}
