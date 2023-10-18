import java.util.Scanner;
public class RomanToInteger {

	static int value(char c)
	{
		if(c=='I')
			return 1;
		else if(c=='V')
			return 5;
		else if(c=='X')
			return 10;
		else if(c=='L')
			return 50;
		else if(c=='C')
			return 100;
		else if(c=='D')
			return 500;
		else if(c=='M')
			return 1000;
		else
			return 0;
		
	}
	static int convert(String str) 
	{
		int total=0;
		for(int i=0;i<str.length();i++)
		{
			int s1=value(str.charAt(i));
			if(i+1 < str.length())
			{
				int s2=value(str.charAt(i+1));
				if(s1 >=s2)
				{
					total += s1;
				}
				else
				{
					total -= s1;
				}
			}
			else
			{
				total +=s1;
			}
		}
		return total;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Roman Number");
		String str = sc.next();
		System.out.println(str+" integer value is "+convert(str));
		sc.close();
	}

	

}
