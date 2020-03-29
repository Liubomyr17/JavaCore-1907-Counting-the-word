package com.company;

/*

1907 Counting the word
Read the file name from the console.
The file contains words separated by punctuation marks.
Print to the console the number of words "world" that appear in the file.
Close streams.

Requirements:
1. The program should read the file name from the console (use BufferedReader).
2. BufferedReader must be closed for reading data from the console.
3. The program should read the contents of the file (use FileReader with the String constructor).
4. The stream of reading from the file (FileReader) should be closed.
5. The program should output to the console the number of words "world" that appear in the file.


*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        int count = 0;
//        int index = 0;
        String word = "world";
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.toString().split("\\W");
            for (String s : words)
                if (s.equals(word))
                    count++;
//            while ((index = s.indexOf(word, index+1)) >= 0)
//                count++;
        }
        fileReader.close();

        System.out.println(count);
    }
}




