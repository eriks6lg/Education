package main;

import javax.swing.*;
import java.awt.event.*;

/**
 * Projektis kasutatav MouseListener. Päris klassi MouseAdapter.
 * If/else lausetega määratakse tegevus vastavalt nupule
 * (nupule määratud teksti järgi).
 */
public class HiireKuulaja extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
        String tekst = ((JButton) e.getSource()).getText();

        if (((JButton) e.getSource()).isEnabled() == true) {

            if (tekst.equals("Arvutusülesanded")) {
                Start.teema = HarjutusteLeht.ARVUTUSULESANDED;
                Start.harjutuseMassiiv = Objektid.arvutusulesandedMassiiv;
                Start.aken.setContentPane(new HarjutusteLeht(HarjutusteLeht.ARVUTUSULESANDED));
                Start.aken.setVisible(true);
            } else if (tekst.equals("Võrrandid")) {
                Start.teema = HarjutusteLeht.VORRANDID;
                Start.harjutuseMassiiv = Objektid.vorrandulesandedMassiv;
                Start.aken.setContentPane(new HarjutusteLeht(HarjutusteLeht.VORRANDID));
                Start.aken.setVisible(true);
            } else if (tekst.equals("Võrratused")) {
                Start.teema = HarjutusteLeht.VORRATUSED;
                Start.harjutuseMassiiv = Objektid.vorratusulesandedMassiv;
                Start.aken.setContentPane(new HarjutusteLeht(HarjutusteLeht.VORRATUSED));
                Start.aken.setVisible(true);
            } else if (tekst.equals("Kujundid")) {
                Start.teema = HarjutusteLeht.KUJUNDID;
                Start.harjutuseMassiiv = Objektid.kujundulesandedMassiv;
                Start.aken.setContentPane(new HarjutusteLeht(HarjutusteLeht.KUJUNDID));
                Start.aken.setVisible(true);
            } else if (tekst.equals("Trigonomeetria")) {
                Start.teema = HarjutusteLeht.TRIGONOMEETRIA;
                Start.harjutuseMassiiv = Objektid.trigonomeetriaulesandedMassiv;
                Start.aken.setContentPane(new HarjutusteLeht(HarjutusteLeht.TRIGONOMEETRIA));
                Start.aken.setVisible(true);
            } else if (tekst.equals("Vektorid")) {
                Start.teema = HarjutusteLeht.VEKTORID;
                Start.harjutuseMassiiv = Objektid.vektorulesandedMassiv;
                Start.aken.setContentPane(new HarjutusteLeht(HarjutusteLeht.VEKTORID));
                Start.aken.setVisible(true);}

            else if (tekst.equals("Ülesanne 1")) {
                Start.aken.setContentPane(Start.harjutuseMassiiv[0]);
                Start.aken.setVisible(true);
                Start.jark = 0;
            } else if (tekst.equals("Ülesanne 2")) {
                Start.aken.setContentPane(Start.harjutuseMassiiv[1]);
                Start.aken.setVisible(true);
                Start.jark = 1;
            } else if (tekst.equals("Ülesanne 3")) {
                Start.aken.setContentPane(Start.harjutuseMassiiv[2]);
                Start.aken.setVisible(true);
                Start.jark = 2;
            } else if (tekst.equals("Ülesanne 4")) {
                Start.aken.setContentPane(Start.harjutuseMassiiv[3]);
                Start.aken.setVisible(true);
                Start.jark = 3;
            } else if (tekst.equals("Ülesanne 5")) {
                Start.aken.setContentPane(Start.harjutuseMassiiv[4]);
                Start.aken.setVisible(true);
                Start.jark = 4;
            } else if (tekst.equals("Ülesanne 6")) {
                Start.aken.setContentPane(Start.harjutuseMassiiv[5]);
                Start.aken.setVisible(true);
                Start.jark = 5;}

            else if (tekst.equals("Esilehele")) {
                Start.aken.setContentPane(new Esileht());
                Start.aken.setVisible(true);
            } else if (tekst.equals("Tagasi") || tekst.equals("Ülesannetelehele") ) {
                Start.aken.setContentPane(new HarjutusteLeht(Start.teema));
                Start.aken.setVisible(true);

                Start.harjutuseMassiiv[Start.jark].edasi.setVisible(false);
                Start.harjutuseMassiiv[Start.jark].oige.setVisible(false);
                Start.harjutuseMassiiv[Start.jark].ulesandeNimi.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].kusimus.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].eelvastus.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].eelvastus.setText(Start.harjutuseMassiiv[Start.jark].eelvastuseTekst);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setEnabled(true);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setText("");
            } else if (tekst.equals("Järgmine ülesanne")) {
                main.Start.aken.setContentPane(Start.harjutuseMassiiv[Start.jark+1]);
                main.Start.aken.setVisible(true);

                Start.harjutuseMassiiv[Start.jark].edasi.setVisible(false);
                Start.harjutuseMassiiv[Start.jark].oige.setVisible(false);
                Start.harjutuseMassiiv[Start.jark].ulesandeNimi.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].kusimus.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].eelvastus.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setVisible(true);
                Start.harjutuseMassiiv[Start.jark].eelvastus.setText(Start.harjutuseMassiiv[Start.jark].eelvastuseTekst);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setEnabled(true);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setText("");
                Start.harjutuseMassiiv[Start.jark+1].kasAvatud = true;

                Start.jark ++;
            } else if (tekst.equals("Proovi uuesti")) {
                Start.harjutuseMassiiv[Start.jark].uuesti.setVisible(false);
                Start.harjutuseMassiiv[Start.jark].eelvastus.setText(Start.harjutuseMassiiv[Start.jark].eelvastuseTekst);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setEnabled(true);
                Start.harjutuseMassiiv[Start.jark].vastuseVali.setText("");
                Start.harjutuseMassiiv[Start.jark].vastuseVali.requestFocusInWindow();
            }
        }
    }
}