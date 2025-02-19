package com.day1.basic;

import java.io.*;
import java.util.*;

public class ReadCSVFile {
    public static void main(String[] args) {
        //file to read
        String filePath="src/main/java/com/day1/basic/source.csv";

        try(BufferedReader br= new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line=br.readLine())!=null){
                String[] columns=line.split(",");
                System.out.println("Id: "+columns[0]+",Name: "+columns[1]+",Age: "+columns[2]+ ",Marks: "+columns[3]);

            }
            //catch the exception if file not found
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {//catch the IO exception
            throw new RuntimeException(e);
        }
    }
}
