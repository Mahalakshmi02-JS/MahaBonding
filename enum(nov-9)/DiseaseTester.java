enum Disease{
	
	CORONA,PLAGUE,CHOLERA,TUBERCULOSIS,TYPHOID,DENGUE,MALARIA,CANCER
}

public class DiseaseTester{

public static void main(String[] attacks)
{
	Disease[] allDisease=Disease.values();
	System.out.println("Length: "+allDisease.length);
	for(int initial=0;initial<allDisease.length;initial++)
	{
		System.out.println("index @ " + initial);
		Disease DiseaseValue=allDisease[initial];
		System.out.println("Disease enum name " + DiseaseValue);
		
	}
}
}
