package Abc;

public class forloop {
	
	void numbers()
		{
			for(int i = 1; i<=10; i++)
			{
				//i = 2
				if(i%2==0)
				{
					System.out.println("Even number is "+i);
					
					
				}
				else
				{
					System.out.println("Odd number is "+i);
				}
			}
			
		}
	
	public static void main(String[] args) {
		forloop m = new forloop();
		m.numbers();
	}
	

}
