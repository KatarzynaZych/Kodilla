package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given

        Book book1 = new Book("Dark Lover", "J.R. Ward", LocalDateTime.now() );
        Book book2 = new Book("Twilight", "Stephenie Meyer", LocalDateTime.now() );
        Book book3 = new Book("Halfway to the Grave", "Jeaniene Frost", LocalDateTime.now() );
        Book book4 = new Book("Darkfever", " Karen Marie Moning", LocalDateTime.now() );
        Book book5 = new Book("Dead Until Dark", " Charlaine Harris", LocalDateTime.now());

        Library library = new Library("londonLibrary");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

//        IntStream.iterate(1,n->n+1)
//                .limit(5)
//                .forEach(n->library.getBooks().add(new Book("title"+n,"author"+n, LocalDateTime.now() )));

        //when
        //making shallow copy of object board
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Shallow library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        // making deep copy od object board
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Deep library");

        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book2);


        // then
        System.out.println(library.getBooks());
        System.out.println(cloneLibrary.getBooks());
        System.out.println(deepCloneLibrary.getBooks());

        Assert.assertEquals(4,library.getBooks().size());
        Assert.assertEquals(4,cloneLibrary.getBooks().size());
        Assert.assertEquals(5,deepCloneLibrary.getBooks().size());
        Assert.assertNotEquals(library.getBooks(),deepCloneLibrary);
    }

}
