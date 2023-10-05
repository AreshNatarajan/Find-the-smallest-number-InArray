package org.practice;

public class FindTheSmallestNumberInArray {

	public static void main(String[] args) {
		
		int[] Array1 = {5,3,6,8,2,9,1,12,45,678};
		
		int Array2 = Array1[0];
		
		
		for(int i = 1;i < Array1.length;i++) {
			if(Array1[i] < Array2) {
				System.out.println(Array2 + "/" + Array1[i]);
				Array2 = Array1[i];
			}
		}
		
		System.out.println(Array2);
	}

}
