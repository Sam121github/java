	
class Tfreq extends Thread{
		
int run(int f[]){
			
int len=f.length,fsum=0;
			
for (int i=0;i< len; ++i) {
				
fsum+=f[i];
			
}
		
return fsum;
		
}
	
}

	
class Compfx extends Thread{
		
int run (int f[],int x[]){
			
int fxsum=0;
			
if(f.length != x.length)
				
return 0;

			
for (int i=0 ; i<f.length ; ++i) {
				
fxsum=fxsum+(f[i]*x[i]);
			
}
		
return fxsum;
		
}
	
}


class cs1q12{

	
public static void main(String arg[]){
		
int marks[]={1,2,3,4,5,6,7,8,9,10};
		
int std[]={3,4,17,8,23,10,4,6,5,2};
		
Tfreq f=new Tfreq();
		
Compfx fx=new Compfx();

		
 f.start();
		 
fx.start();
		 
System.out.println("Total F. : "+  f.run(marks) );
		
 System.out.println("Total XF : "+  fx.run(marks,std) );
		
 System.out.println("Mean : "+ (fx.run(marks,std)/f.run(marks)));
	}

}