import java.rmi.*;
import java.rmi.server.*;


public class PalinRemote extends UnicastRemoteObject implements Palin
{

	PalinRemote()throws RemoteException
	{

		super();
	}


	public String Palindrome(String a)
	{

	String rev="";
	int len=0;
	char c;
	len=a.length();
	String temp="";


		for(int i=len-1;i>=0;i--)
		{
			c=a.charAt(i);
			temp+=c;
		}
			




			if(temp==a)
			{
				return "Palindrome";
			}
			else
			{
				return "NOT Palindrome";

			}
	}
}