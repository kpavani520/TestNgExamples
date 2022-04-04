package com.examples;

public class NumberOfDigits {

	public boolean isPalindrome(int num) {
		int reverse = reverseNum(num);
		if(num == reverse) {
			System.out.println(num +" is palindrome");
			return true;
			}
		else
			System.out.println(num +" is not a palindrome");
		return false;
	}

	public int reverseNum(int num) {
		// TODO Auto-generated method stub
		int result=0;
	while(num>0) {
		int temp=num%10;
		 result = result*10+temp;
		num=num/10;
	}
	return result;
	}
}
