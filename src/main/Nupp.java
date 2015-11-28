package main;
import javax.swing.JButton;
import java.awt.*;

public class Nupp extends JButton {

    public Nupp (String nimi) {
        super(nimi);
        this.setFont(new Font("Sans_Serif", Font.PLAIN, 16));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.CYAN);
        this.addMouseListener(new HiireKuulaja());
    }
}
