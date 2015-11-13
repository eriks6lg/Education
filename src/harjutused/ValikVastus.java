package harjutused;
import java.util.ArrayList;
import java.util.Scanner;


public abstract class ValikVastus extends Harjutus {

    public int oigeValik;
    public String[] valikud;
    public int kasutajaValik;

    public void kaivitaUlesanne() {
        Scanner skanner = new Scanner(System.in);

        System.out.println("Ülesanne " + harjutuseJark + ": " + harjutuseKirjeldus);

        for (int i=0; i<valikud.length; i++) {
            System.out.printf("%s: " + valikud[i], i+1);
            System.out.println();
        }
        System.out.print("Teie valik: ");
        kasutajaValik = skanner.nextInt();
        while (kasutajaValik != oigeValik) {
            System.out.println("Vale vastus. Proovige uuesti!!!");
            kasutajaValik = skanner.nextInt();
        }
        System.out.println("Tubli, vastus on õige.");
        if (kasViimane == true) {
            System.out.println("Tubli töö. Antud valdkonnas on kõik ülesanded lahendatud!");
        } else {
            System.out.println("Liigume edasi järgmise ülesande juurde");
        }
    }

}
