package harjutused;

public class Trigonomeetria {

    public static class Ulesanne1 extends Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("Cos 30");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 0.5;
        }
    }
    public static class Ulesanne2 extends Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kusimus.setText("Sin/Cos");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "tan";
        }

    }
    public static class Ulesanne3 extends Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("Ülesanne 3");
            kusimus.setText("<html>Sin<sup>2</sup>x + Cis<sup>2</sup>x</html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 1;
        }
    }
    public static class Ulesanne4 extends Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
            kusimus.setText("<html>&#8730;(kaatet1<sup>2</sup> + kaatet2<sup>2</sup>)</html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "hüpotenuus";
        }
    }
    public static class Ulesanne5 extends Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("Ülesanne 5");
            kusimus.setText("Sinusfunktsioon on paaris/paaritu");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastusSone = "paaritu";
        }
    }
    public static class Ulesanne6 extends Harjutus {

        public Ulesanne6() {
            super();
            kasViimane = true;
            ulesandeNimi.setText("Ülesanne 6");
            kusimus.setText("ArcCos(0.5)");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 60;
        }
    }
}