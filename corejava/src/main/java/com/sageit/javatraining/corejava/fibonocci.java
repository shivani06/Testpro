package com.sageit.javatraining.corejava;
import java.util.Scanner;
import java.util.*;

public class fibonocci 
{
	//int n1=0,n2=1;
	int i,n3,count=10;
	int[] Arrayi = new int[11];
	
	public void fibo()
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer:");
		int n1 = sc.nextInt();
		System.out.println(n1);
		System.out.println("enter second integer:");
	    int n2 = sc.nextInt();
	    sc.close();
	    System.out.println(n2);
	    //System.out.println("enter an integer ");
	    System.out.println("Fibonocci series is:");
	    ArrayList<Integer> list = new ArrayList<Integer>();
		//n3 = n1+n2;
		for(i=0;i<=count;i++) 
		{
		    Arrayi[i] = n1;
			list.add(n1);
		    n3 = n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(Arrayi[i]+",");	
			//System.out.print(list.get(i)+",");
		}
	 }
		public static void main(String[] args) {
			//System.out.println("enter an integer "+n1);
			//System.out.println("enter an integer "+n2);
			//System.out.println("Fibonocci series is:");
			fibonocci obj1 = new fibonocci();
			obj1.fibo();
		}	 
}
		
		
	



