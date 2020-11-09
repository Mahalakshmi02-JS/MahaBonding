enum IplTeam{
     RCB,MI,DC,KKR,SRH,KIXP,CSK,RR
}

public class IplTeamTester{

public static void main(String[] runs)
{
	IplTeam[] allIplTeam=IplTeam.values();
	System.out.println("Length: "+allIplTeam.length);
	for(int initial=0;initial<allIplTeam.length;initial++)
	{
		System.out.println("index @ " + initial);
		IplTeam IplTeamValue=allIplTeam[initial];
		System.out.println("IplTeam enum name " + IplTeamValue);
		
	}
}
}
