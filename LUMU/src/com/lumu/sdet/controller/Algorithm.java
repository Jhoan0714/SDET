/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lumu.sdet.controller;

import java.util.ArrayList;

/**
 *
 * @author ext_jhoflopez
 */
public class Algorithm {

    public void wordFrequencyCounter(ArrayList<String> data) {
        int arraySize = data.size();
        int characters = 0;
        int words = 0;
        String tmpData;
        String[] tmpWords;
        int tmp;
        ArrayList<String> classified = new ArrayList<>();
        ArrayList<String[][]> finalClassified = new ArrayList<>();
        String[][] tmpClassified;
        for (int i = 0; i < arraySize; i++) {
            tmpData = data.get(i);
            characters += tmpData.length();
            tmpWords = tmpData.split(" ");
            words += tmpWords.length;
            for (int j = 0; j < tmpWords.length; j++) {
                tmp = classified.indexOf(tmpWords[j]);
                if (tmp < 0) {
                    classified.add(tmpWords[j]);
                    finalClassified.add(new String[][]{{tmpWords[j]}, {"1"}});
                } else {
                    tmpClassified = finalClassified.get(tmp);
                    finalClassified.set(tmp, new String[][]{{tmpClassified[0][0]}, {(Integer.parseInt(tmpClassified[1][0]) + 1) + ""}});
                }
            }

        }
        System.out.println(characters + " words" );
        System.out.println(words + " characters\n\n");
        for (int i = 0; i < finalClassified.size(); i++) {
            System.out.println(finalClassified.get(i)[0][0] + ": " + finalClassified.get(i)[1][0]);
        }
    }
}
