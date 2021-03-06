package com.kodilla.exception.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        Path path = Paths.get(file.getPath());

        try {
            Stream<String> fileLines = Files.lines(path);
        }catch (IOException e){
            System.out.println("Oh no! oh oh ");
        }


        System.out.println(file.getPath());
    }

}
