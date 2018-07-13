






import java.util.*;


interface gcd{
	
 public int ComputeGcd(int num1,int num2);

}


class Approch1 implements gcd{

public int ComputeGcd(int num1,int num2){
		
if(num1==0)
			
return num2;
		
else 
			
return ComputeGcd(num2%num1,num1);
	
}
}


class Approch2 implements gcd{
	
public int ComputeGcd(int num1,int num2){
		
int CompGCD=1;
		
for (int i=2;i<=num1 && num2>=i ;++i )
			
if(num1%i==0 && num2%i ==0 )
				
CompGCD=i;
			
		
return CompGCD;
	
}	

}


class cs1q10{

public static void main(String agr[]){
		
Approch1 obj=new Approch1();
		
Approch2 obj1=new Approch2();
		
Scanner s=new Scanner(System.in);
		
System.out.print("Enter any two numbers : ");
		
int num1=s.nextInt();
		
int num2=s.nextInt();

		
System.out.println("GCD by Euclid’s algorithm   : "+obj.ComputeGcd(num1,num2) );
		System.out.println("GCD by traditional approch  : "+obj1.ComputeGcd(num1,num2) );
	
}

}