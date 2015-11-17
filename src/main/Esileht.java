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
        nupud.setLayout(new GridLayout(2, 3));
        nupud.add(nupp1);
        nupud.add(nupp2);
        nupud.add(nupp3);
        nupud.add(nupp4);
        nupud.add(nupp5);
        nupud.add(nupp6);
        nupp1.addMouseListener(new main.HiireKuulaja());
        nupp2.addMouseListener(new main.HiireKuulaja());
        nupp3.addMouseListener(new main.HiireKuulaja());
        nupp4.addMouseListener(new main.HiireKuulaja());
        nupp5.addMouseListener(new main.HiireKuulaja());
        nupp6.addMouseListener(new main.HiireKuulaja());

        this.setLayout(null);
        this.add(nupud);
        nupud.setBounds(400, 300, 400, 200);

    }

    public void paintComponent(Graphics g) {
        setBackground(new Color(0.8F, 0.8F, 1.0F));
        super.paintComponent(g);
        g.setColor(Color.getHSBColor(0.78F,0.8F, 0.5F));
        g.setFont(new Font("SANS_SERIF", Font.BOLD, 66));
        g.drawString("Matemaatika õpituba", 300, 100);
    }



}
