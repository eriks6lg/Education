package main;
import javax.swing.*;
import java.awt.*;

public abstract class Leht extends JPanel {
    String nimi;

    public void paintComponent(Graphics g) {
        setBackground(new Color(0.8F, 0.8F, 1.0F));
        super.paintComponent(g);
        g.setColor(Color.getHSBColor(0.78F,0.8F, 0.5F));
        g.setFont(new Font("SANS_SERIF", Font.BOLD, 50));
        int tekstiLaius = g.getFontMetrics().stringWidth(nimi);
        g.drawString(nimi, (800-tekstiLaius)/2, 100);
    }
}
