import java.io.*;


interface GCD{
 int computeGCD(int num1,int num2 );
}

class APPROACH1 implements GCD{

 int computeGCD(int a,int b)
{
        if (a % b == 0)
            return b;
        return computeGCD(b, a % b);
    }
}

class APPROACH2 implements GCD{
int r;
int computeGCD(int n1,int n2){
while(n2 != 0)
            {
                r = n1 % n2;
                n1 = n2;
                n2 = r;
            }
	return n1;           
 
}
}


class finale {


public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

finale obj1=new APPROACH1();
finale obj2=new APPROACH2();



System.out.println("Enter the first number");
int n1=Integer.parseInt(br.readLine());

System.out.println("Enter the first number");
int n2=Integer.parseInt(br.readLine());

int gccd=obj1.computeGCD(n1,n2);
System.out.println("GCD THROUGH ELUCID METHOD::"+gccd);
obj2.computeGCD(n1,n2);
System.out.print("GCD through factors:: = "+n1);

}
}
