public class CarBrand{
	public static String[] listOfBrands(){
		System.out.println("listOfBrands invoked");
		
		String[] carBrands={"TOYOTA","BMW","HYUNDAI","SUZUKI","HONDA","JAGUAR","AUDI","FORD"};
		
		System.out.println("brand size  " +carBrands.length);
		
		for(int brands=0;brands<carBrands.length;brands++)
		{
			System.out.println("Brand @ index "+brands);
			String roads=carBrands[brands];
			System.out.println("Car Brand is "+ roads);
		}
	  	return carBrands; 
	}
}
