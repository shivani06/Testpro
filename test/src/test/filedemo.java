package test;

class exceptiondemo2 {
	public void hello() {
		System.out.println("hello");
		
	}
}

class hi2 extends exceptiondemo2{
	
	public void hi22() {
		try {
		super.hello();
		System.out.println(10/0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception caught");
			}
		}
	}
class filedemo{
	public static void main(String[] args) {
		hi2 obj1 = new hi2();
		obj1.hi22();
		
	}
}