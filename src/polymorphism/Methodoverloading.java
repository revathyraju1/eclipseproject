package polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(2.5,52);
		ob.add(52,2.5);
		ob.add(10,100);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	public void add ()
	{
		int a=20,b=40;
		int c=a+b;
		System.out.println("value"+c);
	}
	public void add(int a, int b) 
	{
		int c=a+b;
		System.out.println("value"+c);
		
	
	}
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println("value"+c);
	}
	public void add( int a , double  b)
	{
		double c=a+b;
		System.out.println("value"+c);
	}


	

	

}
