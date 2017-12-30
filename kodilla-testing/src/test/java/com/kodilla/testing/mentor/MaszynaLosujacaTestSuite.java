package com.kodilla.testing.mentor;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MaszynaLosujacaTestSuite {

    @Test
    public void testMiniLotto(){
    //given

        DateBase dateBaseMock = mock(DateBase.class);
        List<Integer> liczbyLosowane = new ArrayList<>();
        liczbyLosowane.add(11);
        liczbyLosowane.add(15);
        liczbyLosowane.add(20);
        liczbyLosowane.add(1);
        liczbyLosowane.add(36);
        MaszynaLosujaca maszynaLosujaca = new MaszynaLosujaca(dateBaseMock);

    //when

        List<Integer> liczbySkreslone = new ArrayList<>();
        liczbySkreslone.add(5);
        liczbySkreslone.add(11);
        liczbySkreslone.add(8);
        liczbySkreslone.add(20);
        liczbySkreslone.add(2);
        when(dateBaseMock.wylosuj(5)).thenReturn(liczbyLosowane);

        int wynik1 = maszynaLosujaca.minilotto(liczbySkreslone);

    //then

        Assert.assertEquals(2, wynik1);

    }

    @Test
    public void testJackpotLosuj2(){

        DateBase dateBaseMock = mock(DateBase.class);
        List<Integer> liczbyLosowane = new ArrayList<>();
        liczbyLosowane.add(1);
        liczbyLosowane.add(8);
        Jackpot jackpot = new Jackpot(dateBaseMock);

        //when
        when(dateBaseMock.wylosuj(2)).thenReturn(liczbyLosowane);
        int wynik2 = jackpot.jackpotLosuj(1,2);

        //then

        Assert.assertEquals(1, wynik2);

    }

    @Test
    public void testJackpotLosuj5(){

        DateBase dateBaseMock = mock(DateBase.class);
        List<Integer> liczbyLosowane = new ArrayList<>();

        liczbyLosowane.add(1);
        liczbyLosowane.add(2);
        liczbyLosowane.add(11);
        liczbyLosowane.add(22);
        liczbyLosowane.add(49);
        Jackpot jackpot = new Jackpot(dateBaseMock);

        //when
        when(dateBaseMock.wylosuj(5)).thenReturn(liczbyLosowane);
        int wynik3 = jackpot.jackpotLosuj(5,20,11,25,42);

        //then

        Assert.assertEquals(1, wynik3);

    }
}

