  package java_Programs;

public class Derived extends Base{
	
	int b()
	{
		return 7;
	}
	

	public static void main(String[] args) {

		Base b1=new Base(2,5);
		Base b2=new Base();
		//Derived d1=(Derived) new Base();
		
		//b1.a();// calling base method using derived object of type base
		//b1.b();
		//d1.a();
		//d1.b();
		
	}

}
