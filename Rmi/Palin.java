import java.rmi.*;
public interface Palin extends Remote
{
	
	public String Palindrome(String a)throws RemoteException; 	

}