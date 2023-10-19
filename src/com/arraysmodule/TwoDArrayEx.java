package com.arraysmodule;

import java.util.Scanner;

public class TwoDArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int arr[][]=new int[3][4];
		Scanner sc=new Scanner(System.in);
		
		//traverse
		for(int i=0;i<3;i++) { //row no
			for(int j=0;j<4;j++) { //col no
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) { //row no
			for(int j=0;j<4;j++) { //col no
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int j=0;j<4;j++) { //row no i=row
			for(int i=0;i<3;i++) { //col no =j
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// printing row wise

		
		
		
	}

}
