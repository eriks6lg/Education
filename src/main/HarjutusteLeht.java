package main;
import javax.swing.*;
import java.awt.*;

public class HarjutusteLeht extends Leht{
    public static final int VEKTORID = 1;
    public static final int TRIGONOMEETRIA = 2;
    public static final int TEKSTULESANDED = 3;
    public static final int KUJUNDID = 4;
    public static final int VORRANDID = 5;
    public static final int VORRATUSED = 6;


    JPanel nupud = new JPanel();
    JButton nupp1 = new JButton("Ülesanne 1");
    JButton nupp2 = new JButton("Ülesanne 2");
    JButton nupp3 = new JButton("Ülesanne 3");
    JButton tagasi = new JButton("Tagasi");
    public HarjutusteLeht(Integer valdkond) {
        tagasi.setSize(75, 50);
        tagasi.setLocation(0, 0);
        this.add(tagasi);
        switch (valdkond) {
            case 1:
                nimi = "Vektorid";
                break;
            case 2:
                nimi = "Trigonomeetria";
                break;
            case 3:
                nimi = "Tekstülesanded";
                break;
            case 4:
                nimi = "Kujundid";
                break;
            case 5:
                nimi = "Võrrandid";
                break;
            default:
                nimi = "Võrratused";
        }

        nupud.setLayout(new GridLayout(1, 3));
        nupud.add(nupp1);
        nupud.add(nupp2);
        nupud.add(nupp3);
        nupud.setSize(400, 200);
        nupud.setLocation(200, 200);

        this.setLayout(null);
        this.add(nupud);

        nupp1.addMouseListener(new HiireKuulaja());
        nupp2.addMouseListener(new HiireKuulaja());
        nupp3.addMouseListener(new HiireKuulaja());
        tagasi.addMouseListener(new HiireKuulaja());
    }
}
