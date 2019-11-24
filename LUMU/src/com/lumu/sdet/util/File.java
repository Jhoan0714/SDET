/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lumu.sdet.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ext_jhoflopez
 */
public class File {

    private String path;
    private String name;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList readFile() {
        FileInputStream inputStream = null;
        Scanner sc = null;
        ArrayList<String> text = new ArrayList<String>();
        String tmp;
        try {
            inputStream = new FileInputStream(path + name);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                tmp = sc.nextLine();
                if (!tmp.equals("") && tmp != null) {
                    text.add(tmp);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (sc != null) {
                sc.close();
            }
        }
        return text;
    }

    public void writeFile(String value) {

    }

}
