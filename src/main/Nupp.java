package main;

import javax.swing.*;
import java.awt.*;

/**
 * Programmis kasutatava nupuobjekti klass. Pärib klassi JButton, määrab
 * uued värvid ja projektis kasutatava MouseListeneri (HiireKuulaja).
 */
public class Nupp extends JButton {

    public Nupp (String nimi) {
        super(nimi);
        this.setFont(new Font("Sans_Serif", Font.PLAIN, 16));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.addMouseListener(new HiireKuulaja());
    }
}
