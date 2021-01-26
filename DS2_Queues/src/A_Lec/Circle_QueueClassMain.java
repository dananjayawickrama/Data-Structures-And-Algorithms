package A_Lec;

public class Circle_QueueClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle_QueueClass  theQueue = new Circle_QueueClass(6);  // create a queue with max size 10
		
		 theQueue.insert(10);  // insert given items
		 theQueue.insert(20);
		 theQueue.insert(30);
		 theQueue.insert(40);
		 theQueue.insert(50);
		 theQueue.insert(60);
		 
		 System.out.println("\n Removing front element : "+theQueue.remove());
		 
		theQueue.insert(70);
		 
		System.out.println(); 
	
		
		
		
		 
		 while( !theQueue.isEmpty() ) {    // until it is empty, delete item from queue
		
			int val = theQueue.remove();
			System.out.print(val);
			System.out.print(" ");
		}
	
	
	}

}
