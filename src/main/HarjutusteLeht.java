package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HarjutusteLeht extends Leht{

    String nimi;

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

    public HarjutusteLeht(Integer valdkond) {
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
        nupp1.addMouseListener(new main.HiireKuulaja());

        this.setLayout(null);
        this.add(nupud);
        nupud.setBounds(380, 300, 400, 200);

    }

    public void paintComponent(Graphics g) {
        setBackground(new Color(0.8F, 0.8F, 1.0F));
        super.paintComponent(g);
        g.setColor(Color.getHSBColor(0.78F,0.8F, 0.5F));
        g.setFont(new Font("SANS_SERIF", Font.BOLD, 66));
        g.drawString(nimi, 450, 100);
    }
}
