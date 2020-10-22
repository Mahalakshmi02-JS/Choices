public class Liquids{	
	public static void main(String[] stem)
	{
		System.out.println("JVM invokes main method");		
		String[] nameOfLiquids={"Milk","Water","Oil","Blood","Alcohol","Honey"};
		liquidNames(nameOfLiquids);	

		liquidNames(null);		
		System.out.println("exit main method ");
	}		
	public static void liquidNames(String[] names)
	{
		
		System.out.println("liquidNames "+ names );		
		int size=names.length;
		System.out.println("total length " +size);
		String liquidnameATIndex0=names[0];
				System.out.println("Liquid name at index 1 " +names[1]);
				System.out.println("Liquid name at index 2" +names[2]);
				System.out.println("Liquid name at index 5 " +names[5]);


		}
	
	}