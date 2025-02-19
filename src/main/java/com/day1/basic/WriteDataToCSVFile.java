package com.day1.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToCSVFile {
    public static void main(String[] args) {
        //destination file to write the csv file
        String filePath="src/main/java/com/day1/basic/destination.csv";

        try(BufferedWriter bw= new BufferedWriter(new FileWriter(filePath))){
            bw.write("Id,Name,Department,Salary\n");
            bw.write("111,Garima,Engineering,60000\n");
            bw.write("121,Raj,Finance,60000\n");
            bw.write("131,Rani,Teaching,60000\n");
            bw.write("142,Sam,HR,60000\n");
            bw.write("145,John,Engineering,60000\n");

        } catch (IOException e) {//catch IO Exception
            throw new RuntimeException(e);
        }
    }
}
