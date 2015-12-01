package main;

import harjutused.teemad.Arvutusulesanded;

import java.awt.event.*;
import javax.swing.*;

public class HiireKuulaja extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
        String tekst = ((JButton) e.getSource()).getText();
        JFrame aken = (JFrame) (((JButton) e.getSource()).getTopLevelAncestor());

        if (((JButton) e.getSource()).isEnabled() == true) {

            if (tekst.equals("Arvutusülesanded")) {
                Start.navigaator = "HarjutusteLeht1";
                aken.setContentPane(Objektid.arvutusUlesanded);
                aken.setVisible(true);
            } else if (tekst.equals("Võrrandid")) {
                Start.navigaator = "HarjutusteLeht2";
                aken.setContentPane(Objektid.vorrandid);
                aken.setVisible(true);
            } else if (tekst.equals("Võrratused")) {
                Start.navigaator = "HarjutusteLeht3";
                aken.setContentPane(Objektid.vorratused);
                aken.setVisible(true);
            } else if (tekst.equals("Kujundid")) {
                Start.navigaator = "HarjutusteLeht4";
                aken.setContentPane(Objektid.kujundid);
                aken.setVisible(true);
            } else if (tekst.equals("Trigonomeetria")) {
                Start.navigaator = "HarjutusteLeht5";
                aken.setContentPane(Objektid.trigonomeetria);
                aken.setVisible(true);
            } else if (tekst.equals("Vektorid")) {
                Start.navigaator = "HarjutusteLeht6";
                aken.setContentPane(Objektid.vektorid);
                aken.setVisible(true);
            } else if (tekst.equals("Tagasi") && Start.navigaator.charAt(0) == 'H') {
                aken.setContentPane(Objektid.esileht);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("HarjutusteLeht1") && tekst.equals("Ülesanne 1")) {
                aken.setContentPane(Objektid.arvutusUlesanne1);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("HarjutusteLeht1") && tekst.equals("Ülesanne 2")) {
                aken.setContentPane(Objektid.arvutusUlesanne2);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("HarjutusteLeht1") && tekst.equals("Ülesanne 3")) {
                aken.setContentPane(Objektid.arvutusUlesanne3);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("HarjutusteLeht1") && tekst.equals("Ülesanne 4")) {
                aken.setContentPane(Objektid.arvutusUlesanne4);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("HarjutusteLeht1") && tekst.equals("Ülesanne 5")) {
                aken.setContentPane(Objektid.arvutusUlesanne5);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("HarjutusteLeht1") && tekst.equals("Ülesanne 6")) {
                aken.setContentPane(Objektid.arvutusUlesanne6);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("HarjutusteLeht1") && tekst.equals("Tagasi")) {
                aken.setContentPane(Objektid.arvutusUlesanded);
                aken.setVisible(true);
            }
        }
    }
}
