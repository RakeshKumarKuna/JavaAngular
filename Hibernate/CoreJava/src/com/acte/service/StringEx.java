package com.acte.service;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
       int arr[]=new int[5];	
  
       int arr1[]= {45,84,95};
       int arr2[][]= new int[3][3];
       arr2[0][0]=45;
       arr2[0][1]=48;
       arr2[1][0]=75;
      for(int i=0;i<arr2.length;i++) {
    	  for(int j=0;j<arr2.length;j++) {
    	  System.out.println(arr2[i][j]);
    	  }
      }
       arr[0]=12;
       arr[1]=45;
       arr[2]=12;
       arr[3]=45;
       arr[4]=12;   
       System.out.println(Arrays.toString(arr));
        }
	}

