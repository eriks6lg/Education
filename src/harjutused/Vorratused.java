package harjutused;

/**
 * Võrratusülesanded. Ülesanded individuaalselt
 * sisemistes klassides.
 */
public class Vorratused {

    public static class Ulesanne1 extends Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("x > 3. x = 2. Tõene või väär?");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "väär";
        }
    }
    public static class Ulesanne2 extends Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kusimus.setText("x + 1 < 0");
            eelvastuseTekst = "             x < ";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = -1;
        }

    }
    public static class Ulesanne3 extends Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("Ülesanne 3");
            kusimus.setText("<html>200x <= 40. x = 0.2. <br>Tõene või väär?</html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "tõene";
        }
    }
    public static class Ulesanne4 extends Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
            kusimus.setText("<html>(x+1)(x-1) > 0 x = 1.<br>Tõene või väär?</html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "väär";
        }
    }
    public static class Ulesanne5 extends Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("Ülesanne 5");
            kusimus.setText("<html>4y >= 8. y = -2.<br>Tõene või väär?</html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "väär";
        }
    }
    public static class Ulesanne6 extends Harjutus {

        public Ulesanne6() {
            super();
            kasViimane = true;
            ulesandeNimi.setText("Ülesanne 6");
            kusimus.setText("<html>0<x<3, x = 3.<br>Tõene või väär?</html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "väär";
        }
    }
}