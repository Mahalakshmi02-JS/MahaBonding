public class TheaterTester{


public static void main(String[] display)
{

System.out.println("invoked main, doing switch and enum");
String name="JAIBHARATH";
Theater theaterName=Theater.valueOf(name);

TheaterFinder.lowestAndBestUsingEnum(theaterName);

System.out.println("EXIT :: main doing switch and enum");
}

}








