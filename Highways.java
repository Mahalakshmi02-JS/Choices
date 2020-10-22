public class Highways{
		
	public static void main(String[] roads)
	{
		
		System.out.println("JVM invoked main");	
      String nameOfflowers ="lilly";		
	  
		flowerName("rose");		
		flowerName(null);			
		//countryName();
		flowerName(nameOfflowers);
		
		System.out.println("exit from main method");
	}
	
	
	public static void flowerName(String name)
	{
		System.out.println("flower names are :" + name);
		
	}
	
	
}
