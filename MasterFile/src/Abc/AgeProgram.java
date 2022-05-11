package Abc;

public class AgeProgram {
	static int x = 500;  //global variable
	int y = 1000; //global variable
	
	/* what is global variable?
	 * - variables which are outside of any method.
	 * - scope of global variable is throughout the class
	 * - we can use global variable anywhere inside the class
	 * 
	 * */
	
	void additionMethod()  //method signature
	{
		//method body
		
		//Whatever we written under the method
		//scope will be limited in that method only
		System.out.println("addtion method exection start");
		int number1 = 100;  //local variable
		int number2 = 200;
		int addition = number1+number2;
		System.out.println("This is my method");
		System.out.println(addition);//300
		System.out.println("addtion method exection end");
		
		//why we use method?
		//We use methods to perform the actions.
		
		//what is local variable?
		//Variables which are declared inside the methods.
		//Scope of local variable lies into method body.
		//if we want to access local variable, we need to create an object of class
		
	}
	
	public static void main(String[] args) {
		
		/*main method
		 * - to execute any java program we need main method
		 * - execution of any program starts from main method
		 * - To access the methods, we need to create an object of class in main method
		 * */
		
		System.out.println("main method exection start");
		
		int num = 10; ///local variable
		
		
		/* class object : 
		 * - class object is used for accessing/calling the methods.
		 * - Even we can access the global variables using object of class.
		 * syntax of creating object of class : 
		 *  className objectName = new ClassName();
		 *  
		 *  syntax to call any method using object of class : 
		 *  objectName.methodName();
		 *  
		 * */
		
		AgeProgram obj = new AgeProgram(); //object of class
		obj.additionMethod(); //method called
		System.out.println("main method exection end");
		System.out.println(x);
		System.out.println(obj.y);
	}

}
