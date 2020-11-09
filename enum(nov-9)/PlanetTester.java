public enum Planet{
	MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUNE
	
}
public class PlanetTester{

public static void main(String[] pulls)
{
	Planet[] allPlanets=Planet.values();
	System.out.println("Length: "+allPlanets.length);
	for(int initial=0;initial<allPlanets.length;initial++)
	{
		System.out.println("index @ " + initial);
		Planet PlanetValue=allPlanets[initial];
		System.out.println("Planets enum name " + PlanetValue);
		
	}
}
}
