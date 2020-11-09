enum App{
	GOOGLE,CONTACTS,GALLERY,ZOOM,WHATSAPP,INSTAGRAM,YOUTUBE,GMAIL,PLAYSTORE,AMAZONPRIME
	
}

public class AppTester{

public static void main(String[] checks)
{
	App[] allApps=App.values();
	System.out.println("Length: "+allApps.length);
	for(int initial=0;initial<allApps.length;initial++)
	{
		System.out.println("index @ " + initial);
		App AppValue=allApps[initial];
		System.out.println("Apps enum name " + AppValue);
		
	}
}
}
