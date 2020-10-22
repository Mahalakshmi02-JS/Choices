public class Travel
{
	public static void main(String[] bus)
	{
		System.out.println("JVM invoked main method");
		String[] statesPresentInIndia={"karnataka",
		"jammu and kashmir","Tami nadu",
		"Andrapradesh","Goa","Gujarath",
		"Punjab","Uttarapradesh","Hariyana",
		"Rajastan","Madhyapradesh","kerala","Maharashtra",
		"Chattisghar","Delhi"};
		nameOfStates(statesPresentInIndia);
		System.out.println("exit from main method");
	}
			
	public static void nameOfStates(String[] names)
	{
		System.out.println("name Of States=" +names);
		int size=names.length;
		System.out.println("Size of array=" +size);
		System.out.println("state at index 7=" +names[7]);
		System.out.println("state at index 0=" +names[0]);
		System.out.println("state at index 5=" +names[5]);
		System.out.println("state at index 12=" +names[12]);
        System.out.println("state at index 10=" +names[10]);
		System.out.println("state at index 9=" +names[9]);
        System.out.println("state at index 2=" +names[2]);

	}
}
	