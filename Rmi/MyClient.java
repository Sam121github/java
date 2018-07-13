import java.rmi.*;




public class MyClient
{

	public static void main(String args[])
	{	
		int i=0;

		try
		{

			Palin stub=(Palin)Naming.lookup("rmi://localhost:5000/SAM");
			System.out.println(stub.Palindrome("madam"));
		}catch(Exception e){System.out.println(e);}



	}
}