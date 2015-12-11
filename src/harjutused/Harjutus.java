package harjutused;

import main.Start;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.border.CompoundBorder;
import java.io.IOException;

/**
 * Ülesandeleht. Pärib klassi JPanel, on
 * konteineriks JLabel, JTextField objektidele, samuti
 * ka nuppudele. Viimaste käitumine on defineeritud nii
 * JTextField objektile lisatud ActionListeneris kui ka
 * nuppudele lisatud MouseListeneris (HiireKuulaja).
 */
public abstract class Harjutus extends JPanel {
    /** Kas ülesandele määratud nupp on vajutatav (väärtust
     * kasutatakse HarjutusteLeht objekti loomisel.
     */
    public boolean kasAvatud;

    /** Kas ülesanne on vastavas teemavaldkonnas viimane. */
    public boolean kasViimane;

    public JLabel ulesandeNimi = new JLabel();
    public JLabel kusimus = new JLabel();
    public JLabel eelvastus = new JLabel();
    public JLabel oige = new JLabel("ÕIGE");

    /** Vastuse sisestuskast. */
    public JTextField vastuseVali = new JTextField();

    public String eelvastuseTekst;
    public String oigeVastusSone;
    public String kasutajaVastusSone;

    public double oigeVastus;
    public double kasutajaVastus;

    public main.Nupp tagasi = new main.Nupp("Tagasi");
    public main.Nupp edasi = new main.Nupp("Järgmine ülesanne");
    public main.Nupp uuesti = new main.Nupp("Proovi uuesti");

    /**
     * Konstruktor. Loob sisu, lisab JTextFieldile
     * ActionListeneri.
     */
    public Harjutus() {
        tagasi.setSize(100, 50);
        tagasi.setLocation(0, 0);

        edasi.setSize(250, 50);
        edasi.setLocation((800 - 250) / 2, (600 - 50) / 2);

        uuesti.setSize(150, 50);
        uuesti.setLocation(600, 500);

        ulesandeNimi.setFont(new Font("Serif", Font.BOLD, 50));
        ulesandeNimi.setSize(300, 50);
        ulesandeNimi.setForeground(Color.DARK_GRAY);
        ulesandeNimi.setLocation(150, 188);

        kusimus.setFont(new Font("Serif", Font.BOLD, 46));
        kusimus.setSize(700, 300);
        kusimus.setForeground(Color.BLACK);
        kusimus.setLocation(159, 150);

        eelvastus.setFont(new Font("Serif", Font.BOLD, 40));
        eelvastus.setSize(230, 70);
        eelvastus.setHorizontalTextPosition(JLabel.RIGHT);
        eelvastus.setForeground(Color.YELLOW);
        eelvastus.setLocation(150, 410);

        vastuseVali.setFont(new Font("Serif", Font.PLAIN, 40));
        vastuseVali.setSize(300, 70);
        vastuseVali.setForeground(Color.BLACK);
        vastuseVali.setBackground(Color.DARK_GRAY);
        vastuseVali.setBorder(new CompoundBorder(BorderFactory.createLineBorder(Color.WHITE, 2),
                BorderFactory.createLineBorder(Color.DARK_GRAY, 10)));
        vastuseVali.setLocation(370, 410);

        oige.setFont(new Font("Serif", Font.BOLD, 48));
        oige.setSize(150, 60);
        oige.setForeground(Color.RED);
        oige.setLocation((800 - 150) / 2, 179);

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

        vastuseVali.addActionListener(new ActionListener() {

            /**
             * Vastavalt tekstikasti sisule teostab edasised
             * toimingud.
             * @param e tegevusparameeter
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    kasutajaVastus = Double.parseDouble(vastuseVali.getText());
                    vastuseVali.setEnabled(false);

                    if (kasutajaVastus == oigeVastus) {
                        oige.setVisible(true);
                        edasi.setVisible(true);
                        eelvastus.setVisible(false);
                        ulesandeNimi.setVisible(false);
                        vastuseVali.setVisible(false);
                        kusimus.setVisible(false);

                        if (kasViimane == true) {
                            edasi.setText("Ülesannetelehele");
                        } else {
                            Start.harjutuseMassiiv[Start.jark+1].kasAvatud = true;
                        }
                    } else {
                        uuesti.setVisible(true);
                        eelvastus.setText("VALE");
                        vastuseVali.setEnabled(false);
                    }
                } catch (NumberFormatException exept) {
                    kasutajaVastusSone = vastuseVali.getText();
                    vastuseVali.setEnabled(false);

                    if (kasutajaVastusSone.trim().equals(oigeVastusSone)) {

                        oige.setVisible(true);
                        edasi.setVisible(true);
                        eelvastus.setVisible(false);
                        ulesandeNimi.setVisible(false);
                        vastuseVali.setVisible(false);
                        kusimus.setVisible(false);

                        if (kasViimane == true) {
                            edasi.setText("Ülesannetelehele");
                            Start.harjutuseMassiiv[Start.jark+1].kasAvatud = true;
                        }
                    } else {
                        uuesti.setVisible(true);
                        eelvastus.setText("VALE");
                        vastuseVali.setEnabled(false);
                    }
                }
            }
        });
    }

    /**
     * Joonistab ülesandele tausta.
     * @param g graafikakontekst
     */
    public void paintComponent(Graphics g) {
        try {
            Image pilt = (Image) ImageIO.read(getClass().getResourceAsStream("Taust.jpg"));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {
        }
    }
}
