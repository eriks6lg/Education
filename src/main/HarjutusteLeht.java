package main;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class HarjutusteLeht extends JPanel{
    public static final int ARVUTUSÜLESANDED = 1;
    public static final int VORRANDID = 2;
    public static final int VORRATUSED = 3;
    public static final int KUJUNDID = 4;
    public static final int TRIGONOMEETRIA = 5;
    public static final int VEKTORID = 6;
    public static String nimi;

    JPanel nupud = new JPanel();
    Nupp nupp1 = new Nupp("Ülesanne 1");
    Nupp nupp2 = new Nupp("Ülesanne 2");
    Nupp nupp3 = new Nupp("Ülesanne 3");
    Nupp nupp4 = new Nupp("Ülesanne 4");
    Nupp nupp5 = new Nupp("Ülesanne 5");
    Nupp nupp6 = new Nupp("Ülesanne 6");
    Nupp tagasi = new Nupp("Tagasi");

    public HarjutusteLeht(Integer valdkond) {
        Start.navigaator = "HarjutusteLeht";

        tagasi.setSize(100, 50);
        tagasi.setLocation(0, 0);
        this.add(tagasi);
        switch (valdkond) {
            case 1:
                nimi = "Arvutusulesanded";
                break;
            case 2:
                nimi = "Vorrandid";
                break;
            case 3:
                nimi = "Vorratused";
                break;
            case 4:
                nimi = "Kujundid";
                break;
            case 5:
                nimi = "Trigonomeetria";
                break;
            default:
                nimi = "Vektorid";
         }

        nupud.setLayout(new GridLayout(3, 2));
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
    }

    public void paintComponent(Graphics g) {
        try {
            String taustaNimi = "pildid/" + nimi + ".jpg";
            Image pilt = (Image) ImageIO.read(getClass().getResourceAsStream(taustaNimi));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {}
    }
}
