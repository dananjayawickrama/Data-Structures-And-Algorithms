package A_Lec;

public class Queue_Class {
	
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	private int[] queueArr;
	
	public Queue_Class(int s) {
		
		maxSize = s;
		rear = -1;
		front = 0;
		noItems = 0;
		queueArr = new int[maxSize];
	}
	
	public void insert(int j) {
		
		if(rear == maxSize - 1) {
			System.out.println("Queue is full");
			
		}
		else {
			rear++;
			queueArr[rear] = j;
			noItems++;
			
		}
	}
	
	public int remove() {
		if(noItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			
			int temp = queueArr[front];
		    front++;
		    noItems--;
		   
		    return temp;
		}
	}
	
	public boolean isEmpty() {
		if(noItems == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(noItems == (maxSize - 1)) {
			return true;
		}
		else {
			return false;
		}
	}
}
