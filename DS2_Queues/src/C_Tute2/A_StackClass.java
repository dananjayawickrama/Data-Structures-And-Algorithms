package C_Tute2;

public class A_StackClass {


	
	private int top;
	private int maxsize;
	private int stackArray[];
	
	
	public A_StackClass(int s)
	{
		top = -1;//no any items yet
		maxsize = s;//set array size
		stackArray = new int[maxsize];//create array
		
	}

	public void push(int j)
	{
		if(top == maxsize -1)
			System.out.println("Stack is full");
		else
		{
			top++;
			stackArray[top] = j;
		}
	}
	
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is Empty");
			return -99;
		}
		else
		{
			int temp = stackArray[top];
			top--;
			return temp;
		}
	}
	
	public int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is Empty");
			return -99;
		}
		else
		{
			int rem = stackArray[top];
			return rem;
		}
	}
	
	
	public boolean isEmpty() {
		//1st method
		//return(top == -1);
		
		//2nd method
		if(top == -1)
			return true;
		else
			return false;
	}
	
	
	public boolean isFull() {
		//1st method
		
		return(top == maxsize -1);
		
		//2nd method
		/*
		 
		 if(top == maxsize - 1)
		     return true;
		  else
		  	return false;
		 
		 
		 */
	}
	
	
	
}
