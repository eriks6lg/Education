package main;

import harjutused.teemad.Arvutusulesanded;

import java.awt.event.*;
import javax.swing.*;

public class HiireKuulaja extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
        String tekst = ((JButton) e.getSource()).getText();

        if (((JButton) e.getSource()).isEnabled() == true) {

            if (tekst.equals("Arvutusülesanded")) {
                Start.navigaator = "Arvutusülesanded";
                Start.aken.setContentPane(Objektid.arvutusUlesanded);
                Start.aken.setVisible(true);
            } else if (tekst.equals("Võrrandid")) {
                Start.navigaator = "Võrrandid";
                Start.aken.setContentPane(Objektid.vorrandid);
                Start.aken.setVisible(true);
            } else if (tekst.equals("Võrratused")) {
                Start.navigaator = "Võrratused";
                Start.aken.setContentPane(Objektid.vorratused);
                Start.aken.setVisible(true);
            } else if (tekst.equals("Kujundid")) {
                Start.navigaator = "Kujundid";
                Start.aken.setContentPane(Objektid.kujundid);
                Start.aken.setVisible(true);
            } else if (tekst.equals("Trigonomeetria")) {
                Start.navigaator = "Trigonomeetria";
                Start.aken.setContentPane(Objektid.trigonomeetria);
                Start.aken.setVisible(true);
            } else if (tekst.equals("Vektorid")) {
                Start.navigaator = "Vektorid";
                Start.aken.setContentPane(Objektid.vektorid);
                Start.aken.setVisible(true);
            }
            else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Kujundülesanne";
                Start.aken.setContentPane(Objektid.kujundUlesanne1);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Kujundülesanne";
                Start.aken.setContentPane(Objektid.kujundUlesanne2);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Kujundülesanne";
                Start.aken.setContentPane(Objektid.kujundUlesanne3);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Kujundülesanne";
                Start.aken.setContentPane(Objektid.kujundUlesanne4);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Kujundülesanne";
                Start.aken.setContentPane(Objektid.kujundUlesanne5);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundid") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Kujundülesanne";
                Start.aken.setContentPane(Objektid.kujundUlesanne6);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Kujundülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Kujundid";
                Start.aken.setContentPane(Objektid.kujundid);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Arvutusülesanne";
                Start.aken.setContentPane(Objektid.arvutusUlesanne1);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Arvutusülesanne";
                Start.aken.setContentPane(Objektid.arvutusUlesanne2);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Arvutusülesanne";
                Start.aken.setContentPane(Objektid.arvutusUlesanne3);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Arvutusülesanne";
                Start.aken.setContentPane(Objektid.arvutusUlesanne4);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Arvutusülesanne";
                Start.aken.setContentPane(Objektid.arvutusUlesanne5);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanded") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Arvutusülesanne";
                Start.aken.setContentPane(Objektid.arvutusUlesanne6);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Arvutusülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Arvutusülesanded";
                Start.aken.setContentPane(Objektid.arvutusUlesanded);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                Start.aken.setContentPane(Objektid.trigonomeetriaUlesanne1);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                Start.aken.setContentPane(Objektid.trigonomeetriaUlesanne2);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                Start.aken.setContentPane(Objektid.trigonomeetriaUlesanne3);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                Start.aken.setContentPane(Objektid.trigonomeetriaUlesanne4);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                Start.aken.setContentPane(Objektid.trigonomeetriaUlesanne5);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetria") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Trigonomeetriaülesanne";
                Start.aken.setContentPane(Objektid.trigonomeetriaUlesanne6);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Trigonomeetriaülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Trigonomeetria";
                Start.aken.setContentPane(Objektid.trigonomeetria);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Võrrandülesanne";
                Start.aken.setContentPane(Objektid.vorrandUlesanne1);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Võrrandülesanne";
                Start.aken.setContentPane(Objektid.vorrandUlesanne2);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Võrrandülesanne";
                Start.aken.setContentPane(Objektid.vorrandUlesanne3);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Võrrandülesanne";
                Start.aken.setContentPane(Objektid.vorrandUlesanne4);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Võrrandülesanne";
                Start.aken.setContentPane(Objektid.vorrandUlesanne5);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandid") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Võrrandülesanne";
                Start.aken.setContentPane(Objektid.vorrandUlesanne6);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrrandülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Võrrandid";
                Start.aken.setContentPane(Objektid.vorrandid);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Võrratusülesanne";
                Start.aken.setContentPane(Objektid.vorratusUlesanne1);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Võrratusülesanne";
                Start.aken.setContentPane(Objektid.vorratusUlesanne2);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Võrratusülesanne";
                Start.aken.setContentPane(Objektid.vorratusUlesanne3);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Võrratusülesanne";
                Start.aken.setContentPane(Objektid.vorratusUlesanne4);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Võrratusülesanne";
                Start.aken.setContentPane(Objektid.vorratusUlesanne5);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratused") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Võrratusülesanne";
                Start.aken.setContentPane(Objektid.vorratusUlesanne6);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Võrratusülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Võrratused";
                Start.aken.setContentPane(Objektid.vorratused);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 1")) {
                Start.navigaator = "Vektorülesanne";
                Start.aken.setContentPane(Objektid.vektorUlesanne1);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 2")) {
                Start.navigaator = "Vektorülesanne";
                Start.aken.setContentPane(Objektid.vektorUlesanne2);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 3")) {
                Start.navigaator = "Vektorülesanne";
                Start.aken.setContentPane(Objektid.vektorUlesanne3);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 4")) {
                Start.navigaator = "Vektorülesanne";
                Start.aken.setContentPane(Objektid.vektorUlesanne4);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 5")) {
                Start.navigaator = "Vektorülesanne";
                Start.aken.setContentPane(Objektid.vektorUlesanne5);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorid") && tekst.equals("Ülesanne 6")) {
                Start.navigaator = "Vektorülesanne";
                Start.aken.setContentPane(Objektid.vektorUlesanne6);
                Start.aken.setVisible(true);
            } else if (Start.navigaator.equals("Vektorülesanne") && tekst.equals("Tagasi")) {
                Start.navigaator = "Vektorid";
                Start.aken.setContentPane(Objektid.vektorid);
                Start.aken.setVisible(true);
            } else if (tekst.equals("Tagasi")) {
                Start.navigaator = "Esileht";
                Start.aken.setContentPane(Objektid.esileht);
                Start.aken.setVisible(true);
            }
        }
    }
}
