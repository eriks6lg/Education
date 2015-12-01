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
                Start.navigaator = "Arvutusülesanded";
                aken.setContentPane(Objektid.arvutusUlesanded);
                aken.setVisible(true);
            } else if (tekst.equals("Võrrandid")) {
                Start.navigaator = "Võrrandid";
                aken.setContentPane(Objektid.vorrandid);
                aken.setVisible(true);
            } else if (tekst.equals("Võrratused")) {
                Start.navigaator = "Võrratused";
                aken.setContentPane(Objektid.vorratused);
                aken.setVisible(true);
            } else if (tekst.equals("Kujundid")) {
                Start.navigaator = "Kujundid";
                aken.setContentPane(Objektid.kujundid);
                aken.setVisible(true);
            } else if (tekst.equals("Trigonomeetria")) {
                Start.navigaator = "Trigonomeetria";
                aken.setContentPane(Objektid.trigonomeetria);
                aken.setVisible(true);
            } else if (tekst.equals("Vektorid")) {
                Start.navigaator = "Vektorid";
                aken.setContentPane(Objektid.vektorid);
                aken.setVisible(true);
            }
            else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Kujundülesanne";
                aken.setContentPane(Objektid.kujundUlesanne1);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Kujundülesanne";
                aken.setContentPane(Objektid.kujundUlesanne2);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Kujundülesanne";
                aken.setContentPane(Objektid.kujundUlesanne3);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Kujundülesanne";
                aken.setContentPane(Objektid.kujundUlesanne4);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Kujundülesanne";
                aken.setContentPane(Objektid.kujundUlesanne5);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Kujundülesanne";
                aken.setContentPane(Objektid.kujundUlesanne6);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Kujundid";
                aken.setContentPane(Objektid.kujundid);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Arvutusülesanne";
                aken.setContentPane(Objektid.arvutusUlesanne1);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Arvutusülesanne";
                aken.setContentPane(Objektid.arvutusUlesanne2);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Arvutusülesanne";
                aken.setContentPane(Objektid.arvutusUlesanne3);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Arvutusülesanne";
                aken.setContentPane(Objektid.arvutusUlesanne4);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Arvutusülesanne";
                aken.setContentPane(Objektid.arvutusUlesanne5);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Arvutusülesanne";
                aken.setContentPane(Objektid.arvutusUlesanne6);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Arvutusülesanded";
                aken.setContentPane(Objektid.arvutusUlesanded);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                aken.setContentPane(Objektid.trigonomeetriaUlesanne1);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                aken.setContentPane(Objektid.trigonomeetriaUlesanne2);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                aken.setContentPane(Objektid.trigonomeetriaUlesanne3);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                aken.setContentPane(Objektid.trigonomeetriaUlesanne4);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                aken.setContentPane(Objektid.trigonomeetriaUlesanne5);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                aken.setContentPane(Objektid.trigonomeetriaUlesanne6);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetriaülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Trigonomeetria";
                aken.setContentPane(Objektid.trigonomeetria);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Võrrandülesanne";
                aken.setContentPane(Objektid.vorrandUlesanne1);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Võrrandülesanne";
                aken.setContentPane(Objektid.vorrandUlesanne2);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Võrrandülesanne";
                aken.setContentPane(Objektid.vorrandUlesanne3);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Võrrandülesanne";
                aken.setContentPane(Objektid.vorrandUlesanne4);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Võrrandülesanne";
                aken.setContentPane(Objektid.vorrandUlesanne5);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Võrrandülesanne";
                aken.setContentPane(Objektid.vorrandUlesanne6);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Võrrandid";
                aken.setContentPane(Objektid.vorrandid);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Võrratusülesanne";
                aken.setContentPane(Objektid.vorratusUlesanne1);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Võrratusülesanne";
                aken.setContentPane(Objektid.vorratusUlesanne2);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Võrratusülesanne";
                aken.setContentPane(Objektid.vorratusUlesanne3);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Võrratusülesanne";
                aken.setContentPane(Objektid.vorratusUlesanne4);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Võrratusülesanne";
                aken.setContentPane(Objektid.vorratusUlesanne5);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Võrratusülesanne";
                aken.setContentPane(Objektid.vorratusUlesanne6);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratusülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Võrratused";
                aken.setContentPane(Objektid.vorratused);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Vektorülesanne";
                aken.setContentPane(Objektid.vektorUlesanne1);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Vektorülesanne";
                aken.setContentPane(Objektid.vektorUlesanne2);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Vektorülesanne";
                aken.setContentPane(Objektid.vektorUlesanne3);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Vektorülesanne";
                aken.setContentPane(Objektid.vektorUlesanne4);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Vektorülesanne";
                aken.setContentPane(Objektid.vektorUlesanne5);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Vektorülesanne";
                aken.setContentPane(Objektid.vektorUlesanne6);
                aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Vektorid";
                aken.setContentPane(Objektid.vektorid);
                aken.setVisible(true);
            } else if (tekst.equals("Tagasi")) {
                Start.navigaator = "Esileht";
                aken.setContentPane(Objektid.esileht);
                aken.setVisible(true);
            }
        }
    }
}
