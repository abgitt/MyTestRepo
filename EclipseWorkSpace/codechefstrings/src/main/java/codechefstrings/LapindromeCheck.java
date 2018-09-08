package codechefstrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LapindromeCheck {

	public static void main(String[] args) {
			
		Scanner in= new Scanner(System.in);
		System.out.println("Enter num of testcases");
		int n=in.nextInt();
		for(int tc=0;tc<2;n++)
		{
			System.out.println("Enter string"+tc);
			String str = in.next();
			String sub1="",sub2="";
			
			if(str.length()%2==0)
			{
				sub1=getSubstring(str,0,str.length()/2);
				sub2=getSubstring(str,str.length()/2,str.length());
				System.out.println(sub1);
				System.out.println(sub2);
			}
			else
			{
				sub1=getSubstring(str,0,str.length()/2);
				sub2=getSubstring(str,str.length()/2+1,str.length());
				System.out.println(sub1);
				System.out.println(sub2);
			}
			
			Set<Character> s1=new HashSet<Character>();
			Set<Character> s2=new HashSet<Character>();

			char[] ar1=sub1.toCharArray();
			char[] ar2=sub2.toCharArray();
			s1=convertCharacterArraytoHashSet(ar1);
			s2=convertCharacterArraytoHashSet(ar2);
			
			boolean checkAvailChar = checkAvailCharacters(s1,s2);
			int frequencyOfChar,k=0;
			
			if(checkAvailChar)
			{
				for(k=0;k<s1.size();k++)
				{
					char c=Character.MIN_VALUE;
					frequencyOfChar=0;
					if(k<s1.toString().length())
					{
						c=s1.toString().charAt(k);
					}
					int s1CharFreq = countcharFreqInString(sub1,c);
					int s2CharFreq = countcharFreqInString(sub2,c);
					if(s1CharFreq != s2CharFreq)
					{
						System.out.println("NO");
						break;
					}
				}
				if(k==s1.size())
				{
					System.out.println("YES");
				}
			}
			else
			{
				System.out.println("NO");
			}
		}	
	}
	
	static int countcharFreqInString(String str,char c)
	{
		int count=0;
		for(int char_itr=0;char_itr<str.length();char_itr++)
		{
			if(c==str.charAt(char_itr))
				count++;
		}
		return count;
		
	}
	
	static boolean checkAvailCharacters(Set<Character> s1,Set<Character> s2)
	{
		
		int cmp=(s1.toString()).compareToIgnoreCase(s2.toString());
		System.out.println(s1+""+s2);
		if(cmp==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static  HashSet<Character> convertCharacterArraytoHashSet(char[] ar)
	{
		Set<Character> hs = new HashSet<Character>();
		for(int i=0;i<ar.length;i++)
		{
			hs.add(ar[i]);
		}
		return  (HashSet<Character>) hs;
	}
	
	static String getSubstring(String str,int start,int length)
	{
		StringBuffer substr=new StringBuffer();
		for(int i=start;i<length;i++)
		{
			substr.append(str.charAt(i));
		}
		return substr.toString();
	}

}
