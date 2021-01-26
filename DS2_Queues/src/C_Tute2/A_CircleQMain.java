package C_Tute2;

import java.util.Scanner;

public class A_CircleQMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("How many Elements Do you Insert to the Circle Queue : ");
		int eleQ = sc.nextInt();
		int myArray[] = new int[eleQ];
		A_CircleQ cq = new A_CircleQ(7);
		
		
		System.out.println();
		
		
		for(int r = 0;r < myArray.length;r++) {
			System.out.print("Enter "+(r+1)+" Element :");
			myArray[r] = sc.nextInt();
			cq.insert(myArray[r]);
		}
		
		

	
		
		System.out.print("How many Elements do you need to reverse : ");
		int elements = sc.nextInt();
		
		if(elements <= eleQ) {
			
			A_StackClass s1 = new A_StackClass(elements);
			
			for(int i = 0;i < elements;i++) {
				s1.push(cq.remove());
			}
			
			
			for(int i = 0;i < elements;i++) {
				cq.insert(s1.pop());
			}
			

			
			for(int i = 0;i < (myArray.length - elements);i++) {
				
				int tempRemove = cq.remove();
				cq.insert(tempRemove);
			}
			
			
			System.out.println("\nFirst Insert");
			
			for(int t = 0;t < myArray.length;t++) {
				
				System.out.print(myArray[t]);
				System.out.print(" ");
			}
			
			System.out.println();
			
			
			System.out.println("\nAfter reverse N Items");
			
			while(!cq.isEmpty()) {
				
				System.out.print(cq.remove());
				System.out.print(" ");
			}
			
			
		}else {
			
			System.out.println("Invalid");
		}
		
		
		
	}

}