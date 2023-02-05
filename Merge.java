package com.Array;

import java.util.*;
public class Merge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array A ");
		int n=sc.nextInt();
		System.out.println("Enter the ize of array B");
		int m=sc.nextInt();
		
		int a[]=new int[n];
		
		int b[]=new int[m];
		
		int z[]=new int[n+m];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a);

	}

}
