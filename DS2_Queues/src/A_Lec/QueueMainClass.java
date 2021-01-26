package A_Lec;

import java.util.Scanner;

public class QueueMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Queue_Class mainQueue = new Queue_Class(2);
	    mainQueue.insert(12);
	    mainQueue.insert(123);
	    
	    System.out.println(mainQueue.remove());
	}
}
	