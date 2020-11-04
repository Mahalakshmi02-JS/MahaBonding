public class Volume{

public static void main(String[]raises){
	
	System.out.println("JVM Invoked Main");
	System.out.println("Printing Country names in runtime");
	for(int names=0;names<raises.length;names++)
	 {
	  System.out.println("Index number is " +names);
	  String countryName=raises[names];
	  System.out.println("countryName "+countryName);
	   }
	   
	   System.out.println("EXIT  :: main");		
}
}