package B_Lab2;

public class A_QueueX {

	private int front;
	private int rear;
	private int noItems;
	private int maxsize;
	private int[] queueArray;
	
	
	public A_QueueX(int s)
	{
		front = 0;
		rear = -1;
		noItems = 0;
		maxsize = s;
		queueArray = new int[maxsize];
		
	}
	
	public void insert(int j)
	{
		if(rear == maxsize -1)
		{
			System.out.println("Queue is Full");
		}
		else
		{
			rear++;
			queueArray[rear] = j;
			noItems++;
		}
		
	}
	
	public int remove()
	{
		if(noItems == 0)
		{
			System.out.println("Empty");
			return -99;
		}
		else
		{
			int temp = queueArray[front];
		    front++;
		    noItems--;
		   
		    return temp;
		}
	}
	
	
	public boolean isEmpty()
	{
		if(noItems == 0)
			return true;
		else
			return false;
					
	}
	
	public boolean isFull()
	{
		if(rear == maxsize - 1)
			return true;
		else
			return false;
	}
	
}
