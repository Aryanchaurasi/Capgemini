import java.util.Scanner;
public class Split
{
	public static void main(String  []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence")

		String str= sc.nextLine();
		String [] manualSplit = manualSplitter(str);
		String [] builtin=str.split("\\s+");
		for (int i=0;i<manualSplit.length;i++)
		{
			if(manualSplit.length==builtin.length)
			{
				System.out.println("Both the splits are same");
				System.out.println("The manually splitted word is :"+ manualSplit[i]);
				System.out.println("The built in splitted word is : "+ builtin[i]);
			}
			else
			{
				System.out.println("Both are not equal");
			}
		}
	}
	public static String [] manualSplitter(String str)
	{
		int count=0;
		while(true)//Runned a Infinite loop
		{
			try
			{
				str.charAt(count);//runned a program that returns the character at i and will give the exception
				count++;

			}
			catch(Exception e)
			{
				break;
			}
		}
		int wordCount = 1;  // At least one word exists
        	for (int i = 0; i < count; i++)
		{
            		if (str.charAt(i) == ' ')
			{
                		wordCount++;
            		}
        	}
		int[] spaceIndexes = new int[wordCount - 1];//Create an array to store the indexes of spaces
        	int spaceIndexCount = 0;
		for (int i = 0; i < count; i++) 
		{
            		if (str.charAt(i) == ' ')// Find the positions of spaces in the string
			{
                		spaceIndexes[spaceIndexCount++] = i;
            		}
        	}
        	String[] words = new String[wordCount];// Create an array to store the words
        	int start = 0;
        	int wordIndex = 0;
		for (int i = 0; i < wordCount; i++)// Extract words using space indexes
		{
            		int end = (i < wordCount - 1) ? spaceIndexes[i] : count;
            		words[wordIndex] = str.substring(start, end).trim();
            		start = end + 1;  // Move start index to the next word
            		wordIndex++;
        	}
		return words;

		
	}
}