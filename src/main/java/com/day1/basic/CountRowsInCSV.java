package com.day1.basic;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CountRowsInCSV {
    public static void main(String[] args) {
          //source file to read the rows
        String filePath="src/main/java/com/day1/basic/destination.csv";
        int count=0;
        try(CSVReader reader=new CSVReader(new FileReader(filePath))) {
            List<String[]> list= reader.readAll();
            count = list.size();//get number of rows
            System.out.println(count);
        } catch(IOException e){//catch IO exception
            e.printStackTrace();
        } catch (CsvException e) {//handle CSV Exception
            throw new RuntimeException(e);
        }
    }
}
