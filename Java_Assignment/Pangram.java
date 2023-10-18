
import java.util.Scanner;
public class Pangram 
{
	static String toLowerCase(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch>=65 && ch<=90)
				res=res+(char)(ch+32);
			else if(ch>=97 && ch<=122)
				res=res+ch;
			else
				continue;
		}
		return res;
	}
	static String removeDuplicates(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			int j=0;
			for( ;j<i;j++)
			{
				if(str.charAt(i)== str.charAt(j))
				{
					break;
				}
			}
			if(i==j)
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		//converting all characters to lower case, and removing other special characters 
		//if any one is present
		str=toLowerCase(str);
		
		//remove duplicates in string
		str=removeDuplicates(str);
		
		//checking pangram or not
		if(str.length()==26)
		{
			System.out.println("Given string is PanGram");
		}
		else
		{
			System.out.println("Given string is not a PanGram");
		}
		sc.close();
	}

}
