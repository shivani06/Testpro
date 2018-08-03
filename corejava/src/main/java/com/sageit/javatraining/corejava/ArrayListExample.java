package com.sageit.javatraining.corejava;
// import java.io.*;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> ArrayListExample = new ArrayList<Integer>(n);
		for(int i=1;i<=n;i++)
			ArrayListExample.add(i);
		System.out.println(ArrayListExample);
		ArrayListExample.remove(3);
		System.out.println(ArrayListExample);
		for(int i=0;i<ArrayListExample.size();i++)
			System.out.print(ArrayListExample.get(i)+" ");

	}

}
