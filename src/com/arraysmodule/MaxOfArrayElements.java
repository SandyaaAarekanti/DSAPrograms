package com.arraysmodule;

import java.util.Scanner;

public class MaxOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//main logic
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
     
	}
		System.out.println(max);
		
	}
}

