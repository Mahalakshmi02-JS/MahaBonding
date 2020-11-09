enum Laptop{
	HP,LENOVA,DELL,ASUS,ACER,APPLE
	
}

public class LaptopTester{
	public static void main(String[] buttons)
	{
		String laptopNames=buttons[0];
	
		Laptop convertedLaptopFromString=Laptop.valueOf(laptopNames);
	
		System.out.println(convertedLaptopFromString);
	}
}	



