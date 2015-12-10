package harjutused;

public class Vorrandid {

    public static class Ulesanne1 extends Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("x(x+1)=0");
            eelvastuseTekst = "x1=0, x2=";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = -1;
        }
    }
    public static class Ulesanne2 extends Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kusimus.setText("<html>x<sup>2</sup> - 5 + 4 = 0</html>");
            eelvastuseTekst = "x1=4, x2=";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 1;
        }

    }
    public static class Ulesanne3 extends Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("ln4 = 2");
            kusimus.setText("Tõene või väär?");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "väär";
        }
    }
    public static class Ulesanne4 extends Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
            kusimus.setText("x=3, y=3x. Antud tingimustel");
            eelvastuseTekst = "y =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 9;
        }
    }
    public static class Ulesanne5 extends Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("Ülesanne 5");
            kusimus.setText("<html>3<sup>x</sup> = 27</html>");
            eelvastuseTekst = "x =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 3;
        }
    }
    public static class Ulesanne6 extends Harjutus {

        public Ulesanne6() {
            super();
            kasViimane = true;
            ulesandeNimi.setText("");
            kusimus.setText("6 : 18 + 1 : 3 = x + 4 : 6");
            eelvastuseTekst = "x =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 0;
        }
    }
}