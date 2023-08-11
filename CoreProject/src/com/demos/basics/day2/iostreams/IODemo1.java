package com.demos.basics.day2.iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IODemo1 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * InputStream ins=System.in; int i=0; while((i=ins.read())!=-1) {
		 * System.out.println((char)i); }
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);
	}
}
