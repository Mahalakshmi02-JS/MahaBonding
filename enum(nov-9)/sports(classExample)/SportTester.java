public class SportTester{
	public static void main(String[]name){
String getSportName="BASEBALL";
Sport i=Sport.valueOf(getSportName);		
		
		System.out.println(i);
		Sport[] allsports=Sport.values();
		System.out.println(allsports.length);
for(int sportsnames=0;sportsnames<allsports.length;sportsnames++){
	
	System.out.println("index" +sportsnames);
	Sport sportValue=allsports[sportsnames];
	System.out.println("sport enum value" +sportValue);
}
		
		
		
}
	
}