enum Subject{
        PHYSICS,CHEMISTRY,MATHS,BIOLOGY,STATISTICS,KANNADA,ENGLISH
}

public class SubjectTester{

public static void main(String[] reads)
{
	Subject[] allSubject=Subject.values();
	System.out.println("Length: "+allSubject.length);
	for(int initial=0;initial<allSubject.length;initial++)
	{
		System.out.println("index @ " + initial);
		Subject SubjectValue=allSubject[initial];
		System.out.println("Subject enum name " + SubjectValue);
		
	}
}
}
