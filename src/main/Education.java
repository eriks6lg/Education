package main;
import harjutused.Harjutus;
import harjutused.vektorid.VektUlesanded;

import java.util.Scanner;


public class Education {

    public static void main(String[] args) {

        Scanner skanner = new Scanner(System.in);

        System.out.println("See on matemaatika õppeprogramm.\nValige sobiv teemavaldkond lahendamiseks:\n" +
                "1. Vektorid\n2. Trigonomeetria\n3. Tekstülesanded\n4. Võrrandid\n5. Võrratused\n6. Kujundid\n");
        System.out.print("Teie valik (number): ");

        int valdkond = skanner.nextInt();
        String valdkondString;
        while(valdkond>6 || valdkond<1) {
            System.out.println("Valdkond pole defineeritud!!!");
            System.out.print("Teie valik (number): ");
            valdkond = skanner.nextInt();
        }

        Harjutus[] valitudValdkond;

        Harjutus[] vektorid = new Harjutus[3];
        VektUlesanded vekUle = new VektUlesanded();
        vektorid[0] = vekUle.new VektUlesanne1();
        vektorid[1] = vekUle.new VektUlesanne2();
        vektorid[2] = vekUle.new VektUlesanne3();

        Harjutus[] trigonomeetria = new Harjutus[3];
        Harjutus[] tekstulesanded = new Harjutus[3];
        Harjutus[] vorrandid = new Harjutus[3];
        Harjutus[] vorratused = new Harjutus[3];
        Harjutus[] kujundid = new Harjutus[3];

        switch(valdkond) {
            case 1:
                valitudValdkond = vektorid;
                valdkondString = "vektorid";
                break;
            case 2:
                valitudValdkond = trigonomeetria;
                valdkondString = "trigonomeetria";
                break;
            case 3:
                valitudValdkond = tekstulesanded;
                valdkondString = "tekstülesanded";
                break;
            case 4:
                valitudValdkond = vorrandid;
                valdkondString = "võrrandid";
                break;
            case 5:
                valitudValdkond = vorratused;
                valdkondString = "võrratused";
                break;
            default:
                valitudValdkond = kujundid;
                valdkondString = "kujundid";
                break;
        }

        System.out.println("Valisite valdkonna " + valdkondString + ".");

        for (int ulesanne = 0; ulesanne<valitudValdkond.length; ulesanne++) {

            valitudValdkond[ulesanne].kaivitaUlesanne();
            System.out.println();

        }






    }
}
