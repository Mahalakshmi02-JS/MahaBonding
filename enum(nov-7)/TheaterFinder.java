public class TheaterFinder{
	
	public static void lowestAndBestUsingEnum(Theater theaterName)
{
	System.out.println("invoked lowestAndBestUsingEnum");
	System.out.println("arg 1 theaterName "+theaterName);
	switch(theaterName){
		case SADHANA:
				System.out.println("case is " +theaterName);
				System.out.println("Pre-booking in online available");
				System.out.println("Location: Arsikere");
				break;
				
			case JAIBHARATH:
				System.out.println("case is " +theaterName);
				System.out.println("House Full");
				System.out.println("Next show at 7:00");
				break;
				
			case PVR:
				System.out.println("case is " +theaterName);
				System.out.println("Movie: Chicchore");
				System.out.println("Location: Bangalore");
				break;
				
				default:
				System.out.println("None of Theaters Matched");
	}
					System.out.println("EXIT: lowestAndBestUsingEnum");
}
}