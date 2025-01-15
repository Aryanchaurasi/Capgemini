import java.util.Scanner;
public class VovelConsonantCounter
{
	public static void main(String args [])
	{
		Scanner input=new Scanner (System.in);
		String str=input.nextLine();
		vovelConsonantCounter(str);//Called the function
	}
	public static void vovelConsonantCounter(String string)
	{
		int vovelCounter=0,consonantCounter=0;//Declared counter with value zero
		String vovel ="aeiou";
		String str=string.toLowerCase();
		for (int i = 0; i < str.length(); i++) 
		{
            		char ch = str.charAt(i);
            		if (Character.isLetter(ch))//Check weather the input is Character
			{
                		if (vovel.indexOf(ch) != -1) //Check weater the input is vovel
				{
                    			vovelCounter++;
                		} 
				else 
				{
                    			consonantCounter++;
                		}
            		}
        	}
		//Print Statement
		System.out.println("There are total "+ vovelCounter +"number of Vovels in "+str);
		System.out.println("There are total "+ consonantCounter +"number of consonant in "+str);

	}
}