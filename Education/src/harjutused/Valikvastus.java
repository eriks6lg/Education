package harjutused;

import java.util.ArrayList;

/**
 * Created by Erik on 09.11.2015.
 */
public class Valikvastus extends Harjutus {

    private int valikuteHulk;
    private int vastuseNumber;
    private ArrayList<String> valikud = new ArrayList<String>();


    public int getValikuteHulk() {
        return this.valikuteHulk;
    }

    public int getVastuseNumber() {
        return this.vastuseNumber;
    }

    public String getValik(int i) {
        return valikud.get(i);
    }
}
