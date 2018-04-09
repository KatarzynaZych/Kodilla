package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //given
        Set<BookA> bookTestSet = new HashSet<>();
        BookA bookA1 = new BookA("Matt de la Peña","Ball Don’t Lie",2017,"BA001");
        BookA bookA2 = new BookA("Adam Mansbach and Alan Zweibel","Benjamin Franklin You’ve Got Mail",2015,"BA002");
        BookA bookA3 = new BookA(" Phillip Pullman","La Belle Sauvage",2017,"BA003");
        BookA bookA4 = new BookA("Nic Stone","Dear Martin",2010,"BA004");
        BookA bookA5 = new BookA("J. K. Rowling","Fantastic Beasts and Where to Find Them",2016,"BA005");

        bookTestSet.add(bookA1);
        bookTestSet.add(bookA2);
        bookTestSet.add(bookA3);
        bookTestSet.add(bookA4);
        bookTestSet.add(bookA5);

        //when
        MedianAdapter medianAdapter = new MedianAdapter();
        int medianBookA = medianAdapter.publicationYearMedian(bookTestSet);

        //then
        Assert.assertEquals(2016,medianBookA);
    }
}
