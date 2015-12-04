package harjutused;

import main.Objektid;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Harjutus extends JPanel {

    public boolean kasAvatud;
    public JLabel ulesandeNimi = new JLabel();
    public JLabel kusimus = new JLabel();
    public JLabel eelvastus = new JLabel();
    public String eelvastuseTekst;
    public JTextField vastuseVali = new JTextField();
    public String kasutajaVastus;
    public String oigeVastus;
    public static Harjutus jargmHarjutus;
    public Harjutus seeHarjutus = this;


    main.Nupp tagasi = new main.Nupp("Tagasi");
    main.Nupp edasi = new main.Nupp("Järgmine ülesanne");

    public Harjutus() {
        Harjutus.jargmHarjutus = main.Objektid.arvutusUlesanne2;
        tagasi.setSize(100, 50);
        tagasi.setLocation(0, 0);
        edasi.setSize(250, 50);
        edasi.setLocation(542, 482);

        ulesandeNimi.setFont(new Font("Serif", Font.BOLD, 36));
        ulesandeNimi.setSize(176, 28);
        ulesandeNimi.setForeground(Color.BLACK);
        ulesandeNimi.setLocation(150, 188);

        kusimus.setFont(new Font("Serif", Font.PLAIN, 16));
        kusimus.setSize(486, 70);
        kusimus.setForeground(Color.BLACK);
        kusimus.setLocation(145, 250);

        eelvastus.setFont(new Font("Serif", Font.PLAIN, 40));
        eelvastus.setSize(230, 60);
        eelvastus.setForeground(Color.BLACK);
        eelvastus.setLocation(150, 387);

        vastuseVali.setFont(new Font("Serif", Font.PLAIN, 40));
        vastuseVali.setSize(300, 60);
        vastuseVali.setForeground(Color.BLACK);
        vastuseVali.setLocation(370, 387);

        this.setLayout(null);
        this.add(tagasi);
        this.add(ulesandeNimi);
        this.add(kusimus);
        this.add(eelvastus);
        this.add(vastuseVali);
        this.add(edasi);
        edasi.setVisible(false);
        vastuseVali.requestFocusInWindow();
        vastuseVali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kasutajaVastus = vastuseVali.getText();
                vastuseVali.setEnabled(false);

                if (kasutajaVastus.equals(oigeVastus)) {
                    edasi.setVisible(true);
                    eelvastus.setText("ÕIGE");
                    edasi.setText("Järgmine ülesanne");
                } else {
                    edasi.setText("Proovi uuesti");
                    edasi.setVisible(true);
                    eelvastus.setText("VALE");
                }
            }
        });
        edasi.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (edasi.getText().equals("Järgmine ülesanne")) {
                    main.Start.aken.setContentPane(Harjutus.jargmHarjutus);
                    main.Start.aken.setVisible(true);
                } else {
                    edasi.setVisible(false);
                    eelvastus.setText(seeHarjutus.eelvastuseTekst);
                    vastuseVali.setEnabled(true);


                }
            }



        });


    }



    public void paintComponent(Graphics g) {
        try {
            Image pilt = (Image) ImageIO.read(getClass().getResourceAsStream("TuhiPilt1.jpg"));
            g.drawImage(pilt, 0, 0, this);
        } catch (IOException e) {
        }
    }

}
