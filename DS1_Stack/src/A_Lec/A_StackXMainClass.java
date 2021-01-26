package A_Lec;

public class A_StackXMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		A_StackX x1 = new A_StackX(3);
		
		x1.push(2);//insert first
		x1.push(3);
		x1.push(4);//insert last
		x1.push(5);//print stack is full
		x1.push(6);//print stack is full
		
		
		System.out.println();
		
		
		while(!x1.isEmpty()) {
			
			int temp = x1.pop();
			
			System.out.println("removing "+temp);
		}

	}

}
