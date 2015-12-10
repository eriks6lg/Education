package harjutused;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Harjutus extends JPanel {

    public boolean kasAvatud;
    public boolean kasViimane;
    public JLabel ulesandeNimi = new JLabel();
    public JLabel kusimus = new JLabel();
    public JLabel eelvastus = new JLabel();
    public JLabel oige = new JLabel("ÕIGE");
    public String eelvastuseTekst;
    public JTextField vastuseVali = new JTextField();
    public double kasutajaVastus;
    public double oigeVastus;
    public int harjutuseJark;
    public String oigeVastusSone;
    public String kasutajaVastusSone;

    public main.Nupp tagasi = new main.Nupp("Tagasi");
    public main.Nupp edasi = new main.Nupp("Järgmine ülesanne");
    public main.Nupp uuesti = new main.Nupp("Proovi uuesti");

    public Harjutus() {

        tagasi.setSize(100, 50);
        tagasi.setLocation(0, 0);
        edasi.setSize(250, 50);
        edasi.setLocation((800 - 250) / 2, (600 - 50) / 2);
        uuesti.setSize(150, 50);
        uuesti.setLocation(600, 500);

        ulesandeNimi.setFont(new Font("Serif", Font.BOLD, 36));
        ulesandeNimi.setSize(176, 28);
        ulesandeNimi.setForeground(Color.RED);
        ulesandeNimi.setLocation(150, 188);

        kusimus.setFont(new Font("Serif", Font.PLAIN, 36));
        kusimus.setSize(700, 300);
        kusimus.setForeground(Color.WHITE);
        kusimus.setLocation(159, 150);

        eelvastus.setFont(new Font("Serif", Font.PLAIN, 40));
        eelvastus.setSize(230, 60);
        eelvastus.setForeground(Color.WHITE);
        eelvastus.setLocation(150, 387);

        vastuseVali.setFont(new Font("Serif", Font.PLAIN, 40));
        vastuseVali.setSize(300, 60);
        vastuseVali.setForeground(Color.BLACK);
        vastuseVali.setLocation(370, 387);

        oige.setFont(new Font("Serif", Font.BOLD, 48));
        oige.setSize(150, 60);
        oige.setLocation((800 - 150) / 2, 200);
        oige.setForeground(Color.RED);

        this.setLayout(null);
        this.add(tagasi);
        this.add(ulesandeNimi);
        this.add(kusimus);
        this.add(eelvastus);
        this.add(vastuseVali);
        this.add(edasi);
        this.add(oige);
        this.add(uuesti);
        oige.setVisible(false);
        edasi.setVisible(false);
        uuesti.setVisible(false);
        vastuseVali.requestFocusInWindow();
        vastuseVali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    kasutajaVastus = Double.parseDouble(vastuseVali.getText());
                    kasutajaVastusSone = vastuseVali.getText();
                    vastuseVali.setEnabled(false);

                    if ((kasutajaVastus == oigeVastus) || (kasutajaVastusSone.equals(oigeVastusSone))) {
                        oige.setVisible(true);
                        edasi.setVisible(true);
                        eelvastus.setVisible(false);
                        ulesandeNimi.setVisible(false);
                        vastuseVali.setVisible(false);
                        kusimus.setVisible(false);

                        if (kasViimane == true) {
                            edasi.setText("Ülesannete lehele");
                        }
                    } else {
                        uuesti.setVisible(true);
                        eelvastus.setText("VALE");
                        vastuseVali.setEnabled(false);
                    }
                } catch (NumberFormatException exept) {
                    uuesti.setVisible(true);
                    eelvastus.setText("VALE");
                    vastuseVali.setEnabled(false);
                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        try {
            Image pilt = (Image) ImageIO.read(getClass().getResourceAsStream("Taust.jpg"));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {
        }
    }

}
