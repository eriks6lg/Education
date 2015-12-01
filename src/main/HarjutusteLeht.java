package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public abstract class HarjutusteLeht extends JPanel {
    public static final int ARVUTUSÜLESANDED = 1;
    public static final int VORRANDID = 2;
    public static final int VORRATUSED = 3;
    public static final int KUJUNDID = 4;
    public static final int TRIGONOMEETRIA = 5;
    public static final int VEKTORID = 6;
    public static String nimi;

    JPanel nupud = new JPanel();
    Nupp[] nupuArr = new Nupp[6];


    Nupp tagasi = new Nupp("Tagasi");

    public HarjutusteLeht(Integer valdkond) {

        for (int i = 0; i < 6; i++) {
            nupuArr[i] = new Nupp("Ülesanne " + (i + 1));
        }

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
        for (int i = 0; i < 6; i++) {
            nupud.add(nupuArr[i]);
        }

        nupud.setSize(400, 200);
        nupud.setLocation(200, 200);

        this.setLayout(null);
        this.add(nupud);

        switch (nimi) {

            case "Arvutusulesanded":
                nupuArr[0].setEnabled(Objektid.arvutusUlesanne1.kasAvatud);
                nupuArr[1].setEnabled(Objektid.arvutusUlesanne2.kasAvatud);
                nupuArr[2].setEnabled(Objektid.arvutusUlesanne3.kasAvatud);
                nupuArr[3].setEnabled(Objektid.arvutusUlesanne4.kasAvatud);
                nupuArr[4].setEnabled(Objektid.arvutusUlesanne5.kasAvatud);
                nupuArr[5].setEnabled(Objektid.arvutusUlesanne6.kasAvatud);
        }
    }

    public void paintComponent(Graphics g) {
        try {
            String taustaNimi = "pildid/" + nimi + ".jpg";
            Image pilt = (Image) ImageIO.read(getClass().getResourceAsStream(taustaNimi));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {
        }
    }
}
