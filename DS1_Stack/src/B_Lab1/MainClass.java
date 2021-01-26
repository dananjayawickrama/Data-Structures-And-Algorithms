package B_Lab1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter Your expression: ");
	String str = sc.next();
	int strlength = str.length();
	
	
	StackClass stc1 = new StackClass(strlength);
	
	for(int i = 0;i < strlength;i++) {
		
		char indexChar = str.charAt(i);
		
		
		if(indexChar == '(') {
			stc1.push(indexChar);
			
		}else if(indexChar == ')') {
			
			char temp2 = stc1.pop();
			
			if(temp2 != '(') {
				return;
			}
		}
	}
	
	if(stc1.isEmpty()) {
		System.out.println("Valid!");
	}else {
		System.out.println("Not Valid");
	}
	
	
		
	}

}
