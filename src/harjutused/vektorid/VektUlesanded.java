package harjutused.vektorid;

public class VektUlesanded {

    public class VektUlesanne1 extends harjutused.KusimusVastus{

        public VektUlesanne1 () {
            harjutuseJark = 1;
            harjutuseKirjeldus = "On antud vektor A=(2;3) ja vektor B=(3;-4). Leida nende vektorite summa!";
            eelVastus = "A + B = ";
            vastus = "(5;-1)";
        }

    }
    public class VektUlesanne2 extends harjutused.KusimusVastus{

        public VektUlesanne2 () {
            harjutuseJark = 2;
            harjutuseKirjeldus = "On antud vektor A=(3;8) ja vektor B (4;5). Leida nende vektorite skalaarkorrutis!";
            eelVastus = "A * B =";
            vastus = "52";
        }

    }
    public class VektUlesanne3 extends harjutused.ValikVastus{

        public VektUlesanne3 () {
            harjutuseJark = 3;
            harjutuseKirjeldus = "Vektorite lahutamisel me...";
            valikud = new String[]{"Jagame teise vektori esimesega", "liidame teise vektori vastandvektori", "ei tee midagi"};
            oigeValik = 2;
            kasViimane = true;
        }

    }

}
