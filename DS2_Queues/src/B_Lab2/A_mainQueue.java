package B_Lab2;

import java.util.*;
public class A_mainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		A_QueueX aq1 = new A_QueueX(5);
		int[] tId = new int[5];
		
		
		for(int i = 0;i < 5;i++) {
			
			System.out.print("Enter "+(i+1)+" transaction ID : ");
		    tId[i] = sc.nextInt();
		    int temp1 = tId[i];
		    aq1.insert(temp1);
		}
		

		
		
		System.out.println();
				
				A_QueueX evenQ = new A_QueueX(tId.length);
				A_QueueX oddQ = new A_QueueX(tId.length);
				
				for(int y = 0;y < tId.length;y++) {
					
					int temp = tId[y];
					
					if(temp % 2 == 0) {
						evenQ.insert(temp);
						System.out.println("ID "+temp+" is sent to PC1");
					}else {
						oddQ.insert(temp);
						System.out.println("ID "+temp+" is sent to PC2");
					}
						
				}
				  
				
				//display
				
				System.out.println("\n\nPC1");
				while(!evenQ.isEmpty()) {
					
					System.out.println("Transaction "+evenQ.remove());
				}
				
				System.out.println("\n\nPC2");
				while(!oddQ.isEmpty()) {
					
					System.out.println("Transaction "+oddQ.remove());
				}
		
	}

}
