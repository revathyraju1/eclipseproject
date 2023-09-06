package polymorphism;
	
class Parent1
{
	
	public void phone() 
	{
		System.out.println("samsung");
	}
	public void job()
	{
		System.out.println("Doctor");
	}

	
}
class Child1 extends Parent1
{

	@Override
	public void phone() {
		System.out.println("iphone");
		// TODO Auto-generated method stub
		super.phone();
	}

	@Override
	public void job() {
		System.out.println("engineer");
		// TODO Auto-generated method stub
		super.job();
	}
	
}





public class Methodoverriding { 
	public static void main(String[] args) {
		
	Child1 c=new Child1();
	c.job();
	c.phone();
	 Parent1 p=new Parent1();
	 p.job();
	 p.phone();
	 
	
	

	
		// TODO Auto-generated method stub

	}

}
