package harjutused.teemad;

public class Arvutusulesanded {

    public static class Ulesanne1 extends harjutused.Harjutus {

        public Ulesanne1() {
            super();
            kasAvatud = true;
            ulesandeNimi.setText("Ülesanne 1");
            kusimus.setText("Arvuta midagi Arvuta midagi Arvuta midagi Arvuta midagi Arvuta midagi Arvuta midagi Arvuta midagi" +
                    "Arvuta midagi Arvuta midagi Arvuta midagi");
            eelvastuseTekst = "VASTUS:";
            eelvastus.setText(eelvastuseTekst);
            oigeVastus = "kapsas";
            jargmHarjutus = main.Objektid.arvutusUlesanne2;
        }
    }
    public static class Ulesanne2 extends harjutused.Harjutus {

        public Ulesanne2() {
            super();
            ulesandeNimi.setText("Ülesanne 2");
            kasAvatud = true;


        }

    }
    public static class Ulesanne3 extends harjutused.Harjutus {

        public Ulesanne3() {
            super();
            ulesandeNimi.setText("Ülesanne 3");
        }
    }
    public static class Ulesanne4 extends harjutused.Harjutus {

        public Ulesanne4() {
            super();
            ulesandeNimi.setText("Ülesanne 4");
        }
    }
    public static class Ulesanne5 extends harjutused.Harjutus {

        public Ulesanne5() {
            super();
            ulesandeNimi.setText("Ülesanne 5");
        }
    }
    public static class Ulesanne6 extends harjutused.Harjutus {

        public Ulesanne6() {
            super();
            ulesandeNimi.setText("Ülesanne 6");
        }
    }
}