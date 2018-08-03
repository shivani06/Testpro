package test;

import java.util.Scanner;

public class fibonocci2 
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
		//n3 = n1+n2;
		for(i=0;i<=count;i++) 
		{
		    Arrayi[i] = n1;
		    n3 = n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(Arrayi[i]+",");		
		}
	 }
		public static void main(String[] args) {
			//System.out.println("enter an integer "+n1);
			//System.out.println("enter an integer "+n2);
			//System.out.println("Fibonocci series is:");
			fibonocci2 obj1 = new fibonocci2();
			obj1.fibo();
		}	 
}
		