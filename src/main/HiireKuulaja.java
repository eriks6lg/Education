package main;
import harjutused.teemad.Arvutusulesanded;

import java.awt.event.*;
import javax.swing.*;

public class HiireKuulaja extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
        String tekst =  ((JButton)e.getSource()).getText();
        JFrame aken = (JFrame) (((JButton) e.getSource()).getTopLevelAncestor());
        JPanel sisu = (JPanel)aken.getContentPane();

        if (tekst.equals("Arvutusülesanded")) {
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.ARVUTUSÜLESANDED));
            aken.setVisible(true);
        } else if (tekst.equals("Võrrandid")) {
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.VORRANDID));
            aken.setVisible(true);
        } else if (tekst.equals("Võrratused")) {
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.VORRATUSED));
            aken.setVisible(true);
        } else if (tekst.equals("Kujundid")) {
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.KUJUNDID));
            aken.setVisible(true);
        } else if (tekst.equals("Trigonomeetria")) {
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.TRIGONOMEETRIA));
            aken.setVisible(true);
        } else if (tekst.equals("Vektorid")) {
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.VEKTORID));
            aken.setVisible(true);
        } else if (tekst.equals("Tagasi") && Start.navigaator.equals("HarjutusteLeht")) {
            aken.setContentPane(new main.Esileht());
            aken.setVisible(true);
        }

        else if (HarjutusteLeht.nimi.equals("Arvutusulesanded") && tekst.equals("Ülesanne 1")){
            harjutused.teemad.Arvutusulesanded.Ulesanne1 ulesanne = new harjutused.teemad.Arvutusulesanded.Ulesanne1();
            aken.setContentPane(ulesanne);
            aken.setVisible(true);
        } else if (HarjutusteLeht.nimi.equals("Arvutusulesanded") && tekst.equals("Ülesanne 2")){
            harjutused.teemad.Arvutusulesanded.Ulesanne2 ulesanne = new harjutused.teemad.Arvutusulesanded.Ulesanne2();
            aken.setContentPane(ulesanne);
            aken.setVisible(true);
        } else if (HarjutusteLeht.nimi.equals("Arvutusulesanded") && tekst.equals("Ülesanne 3")){
            harjutused.teemad.Arvutusulesanded.Ulesanne3 ulesanne = new harjutused.teemad.Arvutusulesanded.Ulesanne3();
            aken.setContentPane(ulesanne);
            aken.setVisible(true);
        } else if (HarjutusteLeht.nimi.equals("Arvutusulesanded") && tekst.equals("Ülesanne 4")){
            harjutused.teemad.Arvutusulesanded.Ulesanne4 ulesanne = new harjutused.teemad.Arvutusulesanded.Ulesanne4();
            aken.setContentPane(ulesanne);
            aken.setVisible(true);
        } else if (HarjutusteLeht.nimi.equals("Arvutusulesanded") && tekst.equals("Ülesanne 5")){
            harjutused.teemad.Arvutusulesanded.Ulesanne5 ulesanne = new harjutused.teemad.Arvutusulesanded.Ulesanne5();
            aken.setContentPane(ulesanne);
            aken.setVisible(true);
        } else if (HarjutusteLeht.nimi.equals("Arvutusulesanded") && tekst.equals("Ülesanne 6")){
            harjutused.teemad.Arvutusulesanded.Ulesanne6 ulesanne = new harjutused.teemad.Arvutusulesanded.Ulesanne6();
            aken.setContentPane(ulesanne);
            aken.setVisible(true);
        }
        else if (Start.navigaator.equals("ArvutusUlesanne") && tekst.equals("Tagasi")){
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.ARVUTUSÜLESANDED));
            aken.setVisible(true);
        }
    }
}
