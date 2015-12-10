package harjutused;

/**
 * Vektorülesanded. Ülesanded individuaalselt
 * sisemistes klassides.
 */
public class Vektorid {

    public static class Ulesanne1 extends Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("A=(2,3), B=(4,-2), A+B=(... , 1)");
            eelvastuseTekst = "           ... =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 6;
        }
    }
    public static class Ulesanne2 extends Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kusimus.setText("A=(0, -9), B=(1, 1)");
            eelvastuseTekst = "   A * B =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = -9;
        }

    }
    public static class Ulesanne3 extends Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("Ülesanne 3");
            kusimus.setText("<html>Ruumilisel vektoril on <br>... koordinaati</html>");
            eelvastuseTekst = "        ... =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 3;
        }
    }
    public static class Ulesanne4 extends Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
            kusimus.setText("A=(4,3)");
            eelvastuseTekst = "   A pikkus";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 5;
        }
    }
    public static class Ulesanne5 extends Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("");
            kusimus.setText("A=(11, 0.2)");
            eelvastus.setLocation(20, 410);
            eelvastus.setSize(400, 70);
            eelvastuseTekst = "Ühikvektor j hulk:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 0;
        }
    }
    public static class Ulesanne6 extends Harjutus {

        public Ulesanne6() {
            super();
            kasViimane = true;
            ulesandeNimi.setText("Ülesanne 6");
            kusimus.setText("<html>A=(0,7), k=4 <br>k*A=(... , 28)</html>");
            eelvastuseTekst = "          ... =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 0;
        }
    }
}