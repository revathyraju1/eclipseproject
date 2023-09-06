package work;
class vehicle
{
	public void drive()
	{
		System.out.println("a car");
	}
}
class car extends vehicle
{
	

@Override
	public void drive() {
	System.out.print("repairing ");
		// TODO Auto-generated method stub
		super.drive();
	}
}


    public class Overriding {

	public static void main(String[] args) {
		car c=new car();
		c.drive();
		// TODO Auto-generated method stub

	}

}
