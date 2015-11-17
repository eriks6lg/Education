package main;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import main.HiireKuulaja;



public class HiireKuulaja extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
        String tekst =  ((JButton)e.getSource()).getText();
        if (tekst.equals("Vektorid")) {
            JFrame aken = (JFrame)(((JButton) e.getSource()).getTopLevelAncestor());
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.VEKTORID));
            aken.setVisible(true);
        } else if (tekst.equals("Võrratused")) {
            JFrame aken = (JFrame)(((JButton) e.getSource()).getTopLevelAncestor());
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.VORRATUSED));
            aken.setVisible(true);
        } else if (tekst.equals("Võrrandid")) {
            JFrame aken = (JFrame)(((JButton) e.getSource()).getTopLevelAncestor());
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.VORRANDID));
            aken.setVisible(true);
        } else if (tekst.equals("Tekstülesanded")) {
            JFrame aken = (JFrame)(((JButton) e.getSource()).getTopLevelAncestor());
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.TEKSTULESANDED));
            aken.setVisible(true);
        } else if (tekst.equals("Kujundid")) {
            JFrame aken = (JFrame)(((JButton) e.getSource()).getTopLevelAncestor());
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.KUJUNDID));
            aken.setVisible(true);
        } else if (tekst.equals("Trigonomeetria")) {
            JFrame aken = (JFrame) (((JButton) e.getSource()).getTopLevelAncestor());
            aken.setContentPane(new main.HarjutusteLeht(HarjutusteLeht.TRIGONOMEETRIA));
            aken.setVisible(true);
        }

    }
}
