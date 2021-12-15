package com.belhard.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class Task1 {
	    public static void main(String[] args) throws IOException {
	        LineNumberReader lnr = new LineNumberReader(new FileReader(new File("1.txt")));
	        String s = lnr.readLine();
	        String tmp;
	        ArrayList<String> out = new ArrayList<String>();
	        do {
	            String[] arr = s.split(" ");
	            for (int i = 0; i < arr.length; i++) {
	                arr[i] = arr[i].trim();
	            }
	            tmp = join(arr);
	            if (!tmp.equals(""))
	                out.add(tmp);
	            s = lnr.readLine();
	        } while (s != null);
	        for (String string : out) {
	            System.out.println(string);
	        }
	    }
	 
	    public static String join(String[] arr) {
	        StringBuilder sb = new StringBuilder();
	        for (String string : arr) {
	            if (!string.equals(""))
	                sb.append(string).append(" ");
	        }
	        return sb.toString().trim();
	    }
	}


