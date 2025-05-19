package com.throwskeyword;

public class CheckArrayIndexOutOfBound {
	public void readArray(int arr[], int index) {
		if(index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("Array index not found");
		}else {
			System.out.println(arr[index]);
		}
	}
	public static void main(String[] args) {
		CheckArrayIndexOutOfBound c = new CheckArrayIndexOutOfBound();
		
		c.readArray(new int[] {10,253,52,36,54} , 6);
	}

}
