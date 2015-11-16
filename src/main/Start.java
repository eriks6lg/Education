package main;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {

        JFrame window = new JFrame("Matemaatika õpituba");

        MainPanel esileht = new MainPanel("Matemaatika õpituba", 300);
        MainPanel ulesanneteLeht = new MainPanel("Ülesanded", 500);
        JPanel nupud = new JPanel();
            JButton button1 = new JButton("Vektorid");
            JButton button2 = new JButton("Trigonomeetria");
            JButton button3 = new JButton("Tekstülesanded");
            JButton button4 = new JButton("Kujundid");
            JButton button5 = new JButton("Võrrandid");
            JButton button6 = new JButton("Võrratused");

            nupud.setLayout(new GridLayout(2, 3));
            nupud.add(button1);
            nupud.add(button2);
            nupud.add(button3);
            nupud.add(button4);
            nupud.add(button5);
            nupud.add(button6);

        JPanel ulesanneteNupud = new JPanel();
            JButton buttonUl1 = new JButton("Ülesanne 1");
            JButton buttonUl2 = new JButton("Ülesanne 2");
            JButton buttonUl3 = new JButton("Ülesanne 3");

            ulesanneteNupud.setLayout(new GridLayout(1, 3));
            ulesanneteNupud.add(buttonUl1);
            ulesanneteNupud.add(buttonUl2);
            ulesanneteNupud.add(buttonUl3);

        esileht.setLayout(null);
            esileht.add(nupud);
            nupud.setBounds(400, 300, 400, 200);

        ulesanneteLeht.setLayout(null);
            ulesanneteLeht.add(ulesanneteNupud);
            ulesanneteLeht.setBounds(400, 300, 400, 200);

        window.setContentPane(esileht);
        window.setSize(1200, 800);
        window.setResizable(false);
        window.setLocation(100, 50);
        window.setVisible(true);

    }

}
