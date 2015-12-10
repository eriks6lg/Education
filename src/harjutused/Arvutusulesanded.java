package harjutused;

public class Arvutusulesanded {

    public static class Ulesanne1 extends Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("2 + 2");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 4;
        }
    }
    public static class Ulesanne2 extends Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kusimus.setText("12 : 4 + 2 X 1");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 5;
        }

    }
    public static class Ulesanne3 extends Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("Ülesanne 3");
            kusimus.setText("35 : (2 - 1 x (-5))");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 5;
        }
    }
    public static class Ulesanne4 extends Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
            kusimus.setText("<html>2<sup>3</sup> - 5 X 0.5</html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 5.5;
        }
    }
    public static class Ulesanne5 extends Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("Ülesanne 5");
            kusimus.setText("<html>|-3.9| + 4 X 0.5<sup>2</sup></html>");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 4;
        }
    }
    public static class Ulesanne6 extends Harjutus {

        public Ulesanne6() {
            super();
            kasViimane = true;
            ulesandeNimi.setText("Ülesanne 6");
            kusimus.setText("x + 32 = 9");
            eelvastuseTekst = "              x = ";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = -23;
        }
    }
}