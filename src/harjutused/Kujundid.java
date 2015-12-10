package harjutused;

/**
 * Kujundülesanded. Ülesanded individuaalselt
 * sisemistes klassides.
 */
public class Kujundid {

    public static class Ulesanne1 extends Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("Mitu nurka on kuusnurgal?");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 6;
            oigeVastusSone = "kuus";
        }
    }
    public static class Ulesanne2 extends Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kusimus.setText("<html>Ristküliku pikkus on 5,<br>laius on 8</html>");
            eelvastuseTekst = "Pindala:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 40;
        }

    }
    public static class Ulesanne3 extends Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("Ülesanne 3");
            kusimus.setText("<html>Kolmnurga alus on 4,<br>" +
                    "pindala on 24</html>");
            eelvastuseTekst = "Kõrgus:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 12;
        }
    }
    public static class Ulesanne4 extends Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
            kusimus.setText("Kuubi ruumala on 27");
            eelvastus.setLocation(100, 410);
            eelvastus.setSize(250, 70);
            eelvastuseTekst = "Külje pikkus:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 3;
            oigeVastusSone = "kolm";
        }
    }
    public static class Ulesanne5 extends Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("Ülesanne 5");
            kusimus.setText("<html>Võrdhaarse kolmnurga ümber-<br>mõõt on 13, " +
                    "haara pikkus on 3</html>");
            eelvastuseTekst = "     Alus:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 7;
        }
    }
    public static class Ulesanne6 extends Harjutus {

        public Ulesanne6() {
            super();
            kasViimane = true;
            ulesandeNimi.setText("Ülesanne 6");
            kusimus.setText("<html>Ringi ümbermõõt on 4 \t&#960;</html>");
            eelvastuseTekst = "Raadius:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 2;
        }
    }
}