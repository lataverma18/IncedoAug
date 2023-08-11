package com.demos.basics.day2.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		String str="Data to be written into the file!!!";
		File f=new File("A.txt");
		/*
		 * FileOutputStream fout=new FileOutputStream(f,true);
		 * fout.write(str.getBytes()); fout.close();
		 * System.out.println("Data Written Succesfully!!!");
		 */
		FileInputStream fin=new FileInputStream(f);
		InputStreamReader inr=new InputStreamReader(fin);
		BufferedReader br=new BufferedReader(inr);
		String str1=br.readLine();
		System.out.println(str1);
		
		br.close();
		inr.close();
		fin.close();
		
	}
}
