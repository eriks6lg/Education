package main;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class HarjutusteLeht extends JPanel {
    public static final int ARVUTUSULESANDED = 1;
    public static final int VORRANDID = 2;
    public static final int VORRATUSED = 3;
    public static final int KUJUNDID = 4;
    public static final int TRIGONOMEETRIA = 5;
    public static final int VEKTORID = 6;
    public String nimi;

    JPanel nupud = new JPanel();
    Nupp nupp1 = new Nupp("Ülesanne 1");
    Nupp nupp2 = new Nupp("Ülesanne 2");
    Nupp nupp3 = new Nupp("Ülesanne 3");
    Nupp nupp4 = new Nupp("Ülesanne 4");
    Nupp nupp5 = new Nupp("Ülesanne 5");
    Nupp nupp6 = new Nupp("Ülesanne 6");
    Nupp tagasi = new Nupp("Tagasi");

    public HarjutusteLeht(Integer valdkond) {
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
        nupud.setSize(400, 200);
        nupud.setLocation(200, 200);
        nupud.add(nupp1);
        nupud.add(nupp2);
        nupud.add(nupp3);
        nupud.add(nupp4);
        nupud.add(nupp5);
        nupud.add(nupp6);

        this.setLayout(null);
        this.add(nupud);

        switch (nimi) {
            case "Arvutusulesanded":
                nupp1.setEnabled(Objektid.arvutusUlesanne1.kasAvatud);
                nupp2.setEnabled(Objektid.arvutusUlesanne2.kasAvatud);
                nupp3.setEnabled(Objektid.arvutusUlesanne3.kasAvatud);
                nupp4.setEnabled(Objektid.arvutusUlesanne4.kasAvatud);
                nupp5.setEnabled(Objektid.arvutusUlesanne5.kasAvatud);
                nupp6.setEnabled(Objektid.arvutusUlesanne6.kasAvatud);
                break;
            case "Vorrandid":
                nupp1.setEnabled(Objektid.vorrandUlesanne1.kasAvatud);
                nupp2.setEnabled(Objektid.vorrandUlesanne2.kasAvatud);
                nupp3.setEnabled(Objektid.vorrandUlesanne3.kasAvatud);
                nupp4.setEnabled(Objektid.vorrandUlesanne4.kasAvatud);
                nupp5.setEnabled(Objektid.vorrandUlesanne5.kasAvatud);
                nupp6.setEnabled(Objektid.vorrandUlesanne6.kasAvatud);
                break;
            case "Vorratused":
                nupp1.setEnabled(Objektid.vorratusUlesanne1.kasAvatud);
                nupp2.setEnabled(Objektid.vorratusUlesanne2.kasAvatud);
                nupp3.setEnabled(Objektid.vorratusUlesanne3.kasAvatud);
                nupp4.setEnabled(Objektid.vorratusUlesanne4.kasAvatud);
                nupp5.setEnabled(Objektid.vorratusUlesanne5.kasAvatud);
                nupp6.setEnabled(Objektid.vorratusUlesanne6.kasAvatud);
                break;
            case "Trigonomeetria":
                nupp1.setEnabled(Objektid.trigonomeetriaUlesanne1.kasAvatud);
                nupp2.setEnabled(Objektid.trigonomeetriaUlesanne2.kasAvatud);
                nupp3.setEnabled(Objektid.trigonomeetriaUlesanne3.kasAvatud);
                nupp4.setEnabled(Objektid.trigonomeetriaUlesanne4.kasAvatud);
                nupp5.setEnabled(Objektid.trigonomeetriaUlesanne5.kasAvatud);
                nupp6.setEnabled(Objektid.trigonomeetriaUlesanne6.kasAvatud);
                break;
            case "Kujundid":
                nupp1.setEnabled(Objektid.kujundUlesanne1.kasAvatud);
                nupp2.setEnabled(Objektid.kujundUlesanne2.kasAvatud);
                nupp3.setEnabled(Objektid.kujundUlesanne3.kasAvatud);
                nupp4.setEnabled(Objektid.kujundUlesanne4.kasAvatud);
                nupp5.setEnabled(Objektid.kujundUlesanne5.kasAvatud);
                nupp6.setEnabled(Objektid.kujundUlesanne6.kasAvatud);
                break;
            default:
                nupp1.setEnabled(Objektid.vektorUlesanne1.kasAvatud);
                nupp2.setEnabled(Objektid.vektorUlesanne2.kasAvatud);
                nupp3.setEnabled(Objektid.vektorUlesanne3.kasAvatud);
                nupp4.setEnabled(Objektid.vektorUlesanne4.kasAvatud);
                nupp5.setEnabled(Objektid.vektorUlesanne5.kasAvatud);
                nupp6.setEnabled(Objektid.vektorUlesanne6.kasAvatud);
                break;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            String taustaNimi = "pildid/" + nimi + ".jpg";
            Image pilt = (Image)(ImageIO.read(getClass().getResourceAsStream(taustaNimi)));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {}
    }
}
