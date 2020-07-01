package abstractclass;

abstract class Compartment {
	abstract void notice();
	}
	class FirstClass extends Compartment
	{
	void notice()
	{
		System.out.println("Its FIRSTCLASS");
		}
	}
	class Ladies extends Compartment
	{
	void notice()
	{
		System.out.println("Its LADIES Compartment");
		}
	}
	class General extends Compartment
	{
	void notice()
	{
		System.out.println("Its GENERAL Compartment");
		}
	}
	class Luggage extends Compartment
	{
	void notice()
	{
		System.out.println("Its LUGGAGE");
		}
	}
	public class Firstprogram
	{
	public static void main(String[] args)
	{
		Compartment c[] = new Compartment[10];
		double i = Math.random()*5;
		int x = (int)i;
		System.out.println(x);
		switch(x)
		{
		case 1: c[0] = new FirstClass();
		c[0].notice();
		break;
		case 2: c[1] = new Ladies();
		c[1].notice();
		break;
		case 3: c[2] = new General();
		c[2].notice();
		break;
		case 4: c[3] = new Luggage();
		c[3].notice();
		break;
		default: System.out.println("Invalid Choice");
		}
		}
}
