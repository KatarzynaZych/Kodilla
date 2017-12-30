package com.kodilla.testing.mentor;

import java.util.List;

public class Jackpot {

    DateBase dateBase;

    public Jackpot(DateBase dateBase) {
        this.dateBase = dateBase;
    }


    public int jackpotLosuj(int... liczby) {

        int wygrana = 0;
        int ileLiczb = liczby.length;
        List<Integer> wylosowane = dateBase.wylosuj(ileLiczb);

        for (Integer liczba : liczby) {

            if (wylosowane.contains(liczba)) {

                wygrana++;
            }

        }
        return wygrana;

    }
}
