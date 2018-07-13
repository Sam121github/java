import java.util.IllegalFormatConversionException;
class cs1q6
{
	public static void main (String [] args)
	{
		String arr[][] = {{"a", "int"}, {"b", "float"}, {"s", "String"}, {"x", "int"}};
		int a = 5;
		float b = 6;
		String s = "Hello ";
		try
		{
			String.format("sum is %d"+" avg is %f ", a,b);
			System.out.println("Correct Syntax");
		}
		catch(IllegalFormatConversionException e)
		{
			System.out.println("Wrong Syntax");
		}

		try
		{	
			String.format(" name is %s"+"sum is %d avg is %f ", s,a,b);
			System.out.println("Correct Syntax");
		}
		catch(IllegalFormatConversionException e)
		{
			System.out.println("Wrong Syntax");
		}
		try
		{
			String.format("sum is %d"+" avg is %f ", b,a);
			System.out.println("Correct Syntax");
		}
		catch(IllegalFormatConversionException e)
		{
			System.out.println("Wrong Syntax");
		}

		

	}
}