package ru.kpfu.itis.group408.terziyan.palindrome;

import java.util.Scanner;

public class Palindrome {
	boolean f = false;
	void compare(String st, int i){
		if ((st.length()/2)>i && st.charAt(i) == st.charAt(st.length()-i-1) ){
			i++;
			compare(st,i); 
		}
		if (st.length()/2 == i){
			f = true;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String st = scan.nextLine();
		Palindrome palindrome = new Palindrome();
		palindrome.compare(st, 0);
		if(palindrome.f){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
