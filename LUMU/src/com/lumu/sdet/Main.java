/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lumu.sdet;

import com.lumu.sdet.controller.Algorithm;
import com.lumu.sdet.util.File;

/**
 *
 * @author ext_jhoflopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File();
        file.setPath("");
        file.setName("Prueba.txt");
        Algorithm alg = new Algorithm();
        alg.wordFrequencyCounter(file.readFile());
    }
    
}
