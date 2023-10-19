package com.arraysmodule;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// int arr1={1,2,3,4,5};
		// int arr2[]=new int[5];
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println(arr[2]);
       //length
       System.out.println(arr.length);
       //set 
       arr[3]=90;
       System.out.println(arr[3]);
       //traverse
       for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
       }
	}

}
