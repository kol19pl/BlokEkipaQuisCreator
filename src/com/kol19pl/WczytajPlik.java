package com.kol19pl;



import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class WczytajPlik {
    public String[] Pytania;
    public String[] Odp1;
    public String[] Odp2;
    public String[] Odp3;
    public String[] Odp4;
    public String[] Poprawne1;
    public String[] Poprawne2;
    public String[] Poprawne3;
    public String[] Poprawne4;






    private void WypiszTabelki(ArrayList<Pytanie> pytania) {
        int i = pytania.size();
        Pytania = new String[i];
        Odp1 = new String[i];
        Odp2 = new String[i];
        Odp3 = new String[i];
        Odp4 = new String[i];
        Poprawne1 = new String[i];
        Poprawne2 = new String[i];
        Poprawne3 = new String[i];
        Poprawne4 = new String[i];
        int n =0;
        for (Pytanie pytanie : pytania){
            Pytania[n] = pytanie.pyt;
            Odp1[n] = pytanie.odp1;
            Odp2[n] = pytanie.odp2;
            Odp3[n] = pytanie.odp3;
            Odp4[n] = pytanie.odp4;
            Poprawne1[n] = pytanie.odpP1;
            Poprawne2[n] = pytanie.odpP2;
            Poprawne3[n] = pytanie.odpP3;
            Poprawne4[n] = pytanie.odpP4;
            n++;
        }
     //   Log.d("Deb", String.valueOf(i));
    }
}
