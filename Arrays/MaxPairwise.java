package Arrayss;

import java.util.Scanner;
/* this program takes number of element and each element from user.Then find the maximum pairwise product 
in the given array */
public class MaxPairwise{
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	     int elementNumber = scanner.nextInt();
	     int[] array = new int[elementNumber] ;
	     
	     for(int z =0 ; z < array.length;z++){
	         array[z]= scanner.nextInt();
	     }	 
	    
	     int product = 1;
	     int result=1;
	     for( int i = 0 ; i< array.length;i++){

	         for(int j =i+1 ; j<array.length;j++) {
	             result = array[i]*array[j] ;
	             if(product<result)
	             product=result;}
	     }
	     System.out.println(product);
	     scanner.close();
	}
	}

