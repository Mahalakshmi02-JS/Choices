public class Photo{
public static void main(String[]js)
{
System.out.println("Start Printing ten characters");	
	arrayOfCharacters();
}
	public static void arrayOfCharacters(){
	System.out.println("Invoked array of Characters");
char firstLetter='M';
char secondLetter='A';
char thirdLetter='H';
char fourthLetter='A';
char fifthLetter='L';
char sixthLetter='A';
char seventhLetter='K';
char eighthLetter='S';
char ninthLetter='M';
char tenthLetter='I';
char [] letters={firstLetter,secondLetter,thirdLetter,fourthLetter,
                    fifthLetter,sixthLetter,seventhLetter,eighthLetter,ninthLetter,tenthLetter};
char nameOfLetters1 =letters[0];
		 System.out.println("firstLetter= "+nameOfLetters1);
	
	char nameOfLetters2=letters[1];
		 System.out.println("secondLetter= "+nameOfLetters2);
	
char nameOfLetters3=letters[2];
		 System.out.println("thirdLetter= "+nameOfLetters3);
		 char nameOfLetters4=letters[3];
		 System.out.println("fourthLetter= "+nameOfLetters4);
		 char nameOfLetters5=letters[4];
		 System.out.println("fifthLetter= "+nameOfLetters5);
		 char nameOfLetters6=letters[5];
		 System.out.println("sixthLetter= "+nameOfLetters6);
		 char nameOfLetters7=letters[6];
		 System.out.println("seventhLetter= "+nameOfLetters7);
		 char nameOfLetters8=letters[7];
		 System.out.println("eighthLetter= "+nameOfLetters8);
		 char nameOfLetters9=letters[8];
		 System.out.println("ninthLetter= "+nameOfLetters9);
		 char nameOfLetters10=letters[9];
		 System.out.println("tenthLetter= "+nameOfLetters10);
		 int sizeOfcharacter=letters.length;
		 System.out.println("Total number of characters :" +sizeOfcharacter);
		 
}	
}
