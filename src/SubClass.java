 /**
 * 
 */

/**
 * @author darce
 *
 */
public class SubClass extends ParentClass {

	/**
	 * 
	 */
	public SubClass() {
		// TODO Auto-generated constructor stub
	}

	void display(){
		System.out.println("Child class method");
	   }
	   void printMsg(){
		   super.display();
		
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sb = new SubClass();
			sb.display();
			sb.printMsg();
	}

}
