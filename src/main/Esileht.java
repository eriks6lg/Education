package main;
import javax.swing.*;
import java.awt.*;

public class Esileht extends Leht {
    JPanel nupud = new JPanel();
    JButton nupp1 = new JButton("Vektorid");
    JButton nupp2 = new JButton("Trigonomeetria");
    JButton nupp3 = new JButton("Tekstülesanded");
    JButton nupp4 = new JButton("Kujundid");
    JButton nupp5 = new JButton("Võrrandid");
    JButton nupp6 = new JButton("Võrratused");

    public Esileht() {
        nimi = "Matemaatika õpituba";
        nupud.setLayout(new GridLayout(2, 3));
        nupud.add(nupp1);
        nupud.add(nupp2);
        nupud.add(nupp3);
        nupud.add(nupp4);
        nupud.add(nupp5);
        nupud.add(nupp6);
        nupud.setSize(400, 200);
        nupud.setLocation(200, 200);

        this.setLayout(null);
        this.add(nupud);

        nupp1.addMouseListener(new HiireKuulaja());
        nupp2.addMouseListener(new HiireKuulaja());
        nupp3.addMouseListener(new HiireKuulaja());
        nupp4.addMouseListener(new HiireKuulaja());
        nupp5.addMouseListener(new HiireKuulaja());
        nupp6.addMouseListener(new HiireKuulaja());
    }
}
