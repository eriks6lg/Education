package main;
import javax.swing.*;

public class Start {

    public static String navigaator = "Esileht";

    public static void main(String[] args) {

        JFrame window = new JFrame("Matemaatika õpituba");

        window.setContentPane(Objektid.esileht);
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }

}
