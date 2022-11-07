package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        Solution solution = new Solution();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = br.readLine();
            String fileName2 = br.readLine();
            BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1));
            BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));
            String line1 = "";
            while ((line1 = fileReader1.readLine()) != null) {
                allLines.add(line1);
            }
            String line2 = "";
            while ((line2 = fileReader2.readLine()) != null) {
                forRemoveLines.add(line2);
            }
            br.close();
            fileReader1.close();
            fileReader2.close();
        } catch (CorruptedDataException e) {
        } catch (IOException e) {
        }
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.removeAll(allLines);
            throw new CorruptedDataException();
        }

    }
}
