package main;
import javax.swing.*;
import java.awt.event.*;

public class Start {

    public static void main(String[] args) {

        JFrame window = new JFrame("Matemaatika õpituba");

        Esileht esileht = new Esileht();

        HiireKuulaja hiireKuulaja = new HiireKuulaja();
        esileht.addMouseListener(hiireKuulaja);

        window.setContentPane(esileht);
        window.setSize(1200, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocation(100, 50);
        window.setVisible(true);

    }

}
