package test;

class customdemo extends Exception {
	
	public customdemo(String s) 
	{
		super(s);
	}

public static void main(String[] args)
{
	try 
	{
		throw new customdemo("hello");
	}
	catch(customdemo ex) 
	{
		System.out.println("exception handled");
		System.out.println(ex.getMessage());
	}
	
}
}
