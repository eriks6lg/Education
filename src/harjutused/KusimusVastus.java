package harjutused;
import java.util.Scanner;

public abstract class KusimusVastus extends Harjutus {

    public String vastus;
    public String eelVastus;
    public String kasutajaVastus;
    boolean vastasOigesti;

    public void kaivitaUlesanne() {

        Scanner skanner = new Scanner(System.in);

        System.out.println("Ülesanne " + harjutuseJark + ": " + harjutuseKirjeldus);
        System.out.print(eelVastus);
        kasutajaVastus = skanner.nextLine();
        while (!(kasutajaVastus.equals(vastus))) {
            System.out.println("Vale vastus, proovige uuesti!!!");
            System.out.print(eelVastus);
            kasutajaVastus = skanner.nextLine();
        }
        vastasOigesti = true;
        System.out.println("Tubli, vastus on õige.");
        if (kasViimane == true) {
            System.out.println("Tubli töö. Antud valdkonnas on kõik ülesanded lahendatud!");
        } else {
            System.out.println("Liigume edasi järgmise ülesande juurde");
        }


    }
}
