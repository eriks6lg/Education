package main;
import javax.swing.*;

public class Start {

    public static String navigaator = "Esileht";

    public static JFrame aken = new JFrame("Matemaatika õpituba");

    public static void main(String[] args) {



        aken.setContentPane(Objektid.esileht);
        aken.setSize(800, 600);
        aken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aken.setResizable(false);
        aken.setVisible(true);
    }

}
