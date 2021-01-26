package C_Tute2;

public class A_CircleQ {
	
	
	private int front;
	private int rear;
	private int noItems;
	private int maxsize;
	private int[] queueArray;
	
	
	public A_CircleQ(int s)
	{
		front = 0;
		rear = -1;
		noItems = 0;
		maxsize = s;
		queueArray = new int[maxsize];
		
	}
	
	
	public void insert(int m) {
		
		if(noItems == maxsize) {
			System.out.println("Circle Queue is Full");
		}else {
			
			if(rear == maxsize - 1)
				rear = -1;
			
			rear++;
			queueArray[rear] = m;
			noItems++;
		}
	}
	
	
	public int remove() {
		
		if(noItems == 0) {
			System.out.println("Circle Queue is Empty");
			return -99;
		}else {
			int temp = queueArray[front];
			front++;
			
			if(front == maxsize)
				front = 0;
			
			noItems--;
			return temp;
			
		}
	}
	
	
	public int peekFront() {
		
		if(noItems == 0) {
			System.out.println("Circle is Empty");
			return -99;
		}else {
			
			return queueArray[front];
		}
	}
	
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	
	public boolean isFull() {
		return (noItems == maxsize);
	}
	
}
