public class Watch{
	public static void main(String[]look)
	{
	System.out.println("Start printing Emails");
	arrayOfEmail();
	}
	public static void arrayOfEmail(){
		System.out.println("Invoke the array of Emails");
	String showroomEmail=("hondaabikes@gmail.com");
    String martEmail=("reliance@gmail.com");
    String myEmail= ("mahalakshmi@gmail.com");
    String[] emails={showroomEmail,martEmail,myEmail};

		 String firstIndexname=emails[0];
		 
		 System.out.println("Email Id at index zero "+firstIndexname);
		 
		 String secondIndexName=emails[1];
		 
		 System.out.println("Email Id at index one  "+secondIndexName);
		 
		 String thirdIndexName=emails[2];
		 
		 System.out.println("Email Id at index two  "+thirdIndexName);
	     int numberOfEmails=emails.length;
		 System.out.println("Total Emails are "+numberOfEmails);
	
	
	}
	
	
	}	
	
