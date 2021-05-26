import java.util.*;
import java.io.*; 
import java.util.Scanner;
class Plus
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next(); 
		int a=s.length(); 

	
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			if(s.charAt(i)!='+')
			{	
                String d=Character.toString(s.charAt(i));
				int c=Integer.parseInt(d);
				arr[i]=c;
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<a;i++)
		{

			if( arr[i]!=0)
			{	
				System.out.print(arr[i]);
			}
			if (i != a-1 && arr[i]!=0){
				System.out.print("+");
			}

		}
	}
}