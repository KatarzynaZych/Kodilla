package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    Map<BookSignature,BookB> newBookMap = new HashMap<>();

    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        for (BookA book : bookSet){
            BookSignature signature = new BookSignature(book.getSignature());
            BookB newBook = new BookB(book.getAuthor(),book.getTitle(),book.getPublicationYear());
            newBookMap.put(signature,newBook);
        }
        return medianPublicationYear(newBookMap);
    }
}
