package main;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.IOException;

/**
 * Programmis kasutatav harjutustemenüü. Päris klassi JPanel,
 * on konteineriks väiksemale JPanelile, mis omakorda on
 * konteineriks kuuele ülesandeid kehastavale nupule.
 */
public class HarjutusteLeht extends JPanel {

    /**
     * Konstandid, mida kasutatakse isendi loomisel
     * (parameetritena) ja Start.teema määramisel.
     */
    public static final int ARVUTUSULESANDED = 1;
    public static final int VORRANDID = 2;
    public static final int VORRATUSED = 3;
    public static final int KUJUNDID = 4;
    public static final int TRIGONOMEETRIA = 5;
    public static final int VEKTORID = 6;

    /** Väljavalitud teemakonstant. */
    public int valdkond;

    JPanel nupud = new JPanel();
    Nupp nupp1 = new Nupp("Ülesanne 1");
    Nupp nupp2 = new Nupp("Ülesanne 2");
    Nupp nupp3 = new Nupp("Ülesanne 3");
    Nupp nupp4 = new Nupp("Ülesanne 4");
    Nupp nupp5 = new Nupp("Ülesanne 5");
    Nupp nupp6 = new Nupp("Ülesanne 6");
    Nupp esilehele = new Nupp("Esilehele");

    /**
     * Konstruktor.
     * @param valdkonnaNumber määran ülesannete teemavaldkonna.
     */
    public HarjutusteLeht(Integer valdkonnaNumber) {
        this.valdkond = valdkonnaNumber;

        nupp1.setEnabled(Start.harjutuseMassiiv[0].kasAvatud);
        nupp2.setEnabled(Start.harjutuseMassiiv[1].kasAvatud);
        nupp3.setEnabled(Start.harjutuseMassiiv[2].kasAvatud);
        nupp4.setEnabled(Start.harjutuseMassiiv[3].kasAvatud);
        nupp5.setEnabled(Start.harjutuseMassiiv[4].kasAvatud);
        nupp6.setEnabled(Start.harjutuseMassiiv[5].kasAvatud);

        esilehele.setSize(100, 50);
        esilehele.setLocation(0, 0);

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
        this.add(esilehele);
    }

    /**
     * Joonistab teemavaldkonnale vastava taustapildi.
     * Aadressi pildi jaoks saab ta valdkonnakonstandilt.
     * @param g graafikakontekst
     */
    public void paintComponent(Graphics g) {
        try {
            String taustaTee = "pildid/" + valdkond + ".jpg";
            Image pilt = (Image)(ImageIO.read(getClass().getResourceAsStream(taustaTee)));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {}
    }
}
