import java.io.*;
import java.math.*;

interface getinterest
{
void getsi();
void getci();
}

class Assessment2 implements getinterest
{

double inib;
double roi;
double years;
double t;


Assessment2(double init,double ri,double yr,double tea)
{
inib=init;
roi=ri;
years=yr;
t=tea;
}

public void getsi()
{
double si=0.0f;

si= roi*inib*years;
System.out.println("SIMPLE INTEREST:"+si);
System.out.println("BALANCE AMOUNT:"+(si+inib));


}

public void getci()
{
double ci=0.0f;
double nt=years*t;
ci=Math.pow(inib*(1.0+((roi)/years)),years);
 //ci=p*Math.pow(1.0+r/100.0,n)-p;
System.out.println("COMPOUND INTEREST:"+ci);
System.out.println("BALANCE AMOUNT:"+(ci+inib));



}
}
class assess22{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	double ini;
double r;
double y,te;
ini=r=y=te=0.0;

	System.out.println("ENTER THE initial balance");
	ini=Double.parseDouble(br.readLine());
	System.out.println("ENTER the rate of interesrt");
	r=Double.parseDouble(br.readLine());
	System.out.println("ENTER no of compunding years");
	y=Double.parseDouble(br.readLine());
	System.out.println("ENTER no.of years");
	te=Double.parseDouble(br.readLine());
	
	Assessment2 obj=new Assessment2(ini,r,y,te);
	//obj.Assessment2(ini,r,y,te);
	obj.getsi();
	obj.getci();
	
}
	
	
	
	
}

