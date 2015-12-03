package harjutused;
import main.HarjutusteLeht;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public abstract class Harjutus extends JPanel{

    public boolean kasAvatud;
    public JLabel ulesandeNimi = new JLabel();
    public JLabel kusimus = new JLabel();
    public JLabel eelvastus = new JLabel();
    public String kasutajaVastus;
    public String oigeVastus;



    main.Nupp tagasi = new main.Nupp("Tagasi");

    public Harjutus() {
        tagasi.setSize(100, 50);
        tagasi.setLocation(0, 0);
        ulesandeNimi.setFont(new Font("Serif", Font.BOLD, 28));
        ulesandeNimi.setSize(176, 28);
        ulesandeNimi.setForeground(Color.BLACK);
        ulesandeNimi.setLocation(145, 184);


        this.setLayout(null);
        this.add(tagasi);
        this.add(ulesandeNimi);
    }

    public void paintComponent(Graphics g) {
        try {
            Image pilt = (Image) ImageIO.read(getClass().getResourceAsStream("TuhiPilt1.jpg"));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {}
    }
}
