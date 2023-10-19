package com.arraysmodule;

import java.util.Scanner;

public class SubarrayOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		 for(int i=0;i<arr.length;i++) {
	    	   arr[i]=sc.nextInt();
	       }
		 //main logic
		 for(int si=0;si<n;si++) {
			 for(int ei=si;ei<n;ei++) {
				 for(int k=si;k<=ei;k++) {
					 System.out.print(arr[k]+" ");
				 }
				 System.out.println();
			 }
			 
		 }
	}

}
