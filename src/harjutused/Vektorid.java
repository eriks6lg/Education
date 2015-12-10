package harjutused;

public class Vektorid {

    public static class Ulesanne1 extends Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("A=(2,3), B=(4,-2), A+B=(... , 1)");
            eelvastuseTekst = "... =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 6;
        }
    }
    public static class Ulesanne2 extends Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kusimus.setText("A=(0, -9), B=(1, 1)");
            eelvastuseTekst = "A * B =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = -9;
        }

    }
    public static class Ulesanne3 extends Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("Ülesanne 3");
            kusimus.setText("Ruumilisel vektoril on ... koordinaati");
            eelvastuseTekst = "... =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 3;
        }
    }
    public static class Ulesanne4 extends Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
            kusimus.setText("A=(4,3");
            eelvastuseTekst = "A pikkus";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 5;
        }
    }
    public static class Ulesanne5 extends Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("");
            kusimus.setText("A=(11,0,2)");
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
            kusimus.setText("A=(0,7), k=4 k*A=(... , 28)");
            eelvastuseTekst = "... =";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = 0;
        }
    }
}