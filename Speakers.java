public class Speakers{
	
	public static void main(String[] boxes)
	{
		System.out.println("invoked main method by JVM");
		arrayOfBoolean();
		System.out.println("exiting main method by JVM");
	}
	
	
	
	public static void arrayOfBoolean()
	{
		 System.out.println("invoked arrayOfBoolean");
	
		 boolean milkIsBlack=false;
	     
	     boolean[] statement={true,false};
		 
		 
		 boolean elementAtIndex1=statement[0];
		 
		 System.out.println("Element at index one "+elementAtIndex1);
		 
		 boolean elementAtIndex2=statement[1];
		 
		 System.out.println("Element at index two "+elementAtIndex2);
		 
		
	}
}
	