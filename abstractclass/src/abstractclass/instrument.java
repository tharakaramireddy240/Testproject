package abstractclass;
abstract class instrument {
	abstract void play(); {
		
	}

}
class Piano extends instrument

{
	 public void play()
	{
		System.out.println("Piano is playing  tan tan tan tan");
	}
}
class Flute extends instrument
{
    public void play()
    {
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
class Guitar extends instrument
{
	 public void play(){
		System.out.println("Guitar is playing  tin  tin  tin");
	}
}
class inst{
	public static void main(String args[])
	{
		instrument inst[]=new instrument[10];
		for(int i=1;i<3;i++)
		{
			inst[i]=new Piano();
			inst[i].play();
		}
		for(int i=3;i<7;i++)
		{
			inst[i]=new Flute();
			inst[i].play();
			
		}
		for(int i=7;i<10;i++)
		{
			inst[i]=new Guitar();
			inst[i].play();
			
		}
	}
}
