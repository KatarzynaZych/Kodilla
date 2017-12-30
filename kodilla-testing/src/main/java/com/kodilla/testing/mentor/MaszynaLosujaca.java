package com.kodilla.testing.mentor;

import java.util.List;

public class MaszynaLosujaca {

    DateBase dateBase ;

    public MaszynaLosujaca(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    public int minilotto(List<Integer> wylosujTeLiczby){

        List<Integer> wylosowane = dateBase.wylosuj(5);

        int wygrana = 0;

        for (Integer liczba: wylosujTeLiczby) {

            if(wylosowane.contains(liczba)){

                wygrana++;
            }
        }
        return wygrana;
    }
}
