package harjutused;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public abstract class Harjutus extends JPanel{

    public String harjutuseNimi;
    public String harjutuseKirjeldus;
    public int harjutuseJark;
    public boolean kasViimane;
    public boolean kasAvatud;
    main.Nupp tagasi = new main.Nupp("Tagasi");

    public Harjutus() {
        tagasi.setSize(100, 50);
        tagasi.setLocation(0, 0);

        this.setLayout(null);
        this.add(tagasi);
    }

    public void paintComponent(Graphics g) {
        try {
            Image pilt = (Image) ImageIO.read(getClass().getResourceAsStream("TuhiPilt.jpg"));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {}
    }


}
