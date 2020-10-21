public class Charger{
public static void main(String[]power)
{
System.out.println("List of percentages");	
	arrayOfPercentages();
}
	public static void arrayOfPercentages(){
	System.out.println("Invoked array of Percentages");

float sslcPercentage=89.55f;
float pucPercenatge=90.36f;
float degreePercentage=74.23f;
float [] percent={sslcPercentage,pucPercenatge,degreePercentage};
float marks1 =percent[0];
		 System.out.println("sslcPercentage= "+marks1);
	
	float marks2=percent[1];
		 System.out.println("pucPercenatge= "+marks2);
	
float marks3=percent[2];	
		 System.out.println("degreePercentage= "+marks3);
}	
}
