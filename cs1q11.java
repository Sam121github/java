import java.util.*;



class cs1q11{
	
static int flg=0;

	
static class myException extends Exception{
		
public String toString(){
			
return "SameColorBallException\n\n\n";
		
}
	
}

	
static int RndmGntr(){
		
Random r=new Random();
		
return r.nextInt(4);
	
}

	
static void show(){
		
int temp,r,g,b,y,rndm;
		
temp=r=b=y=g=0;
		
for (int i=0;i<10 ; ++i) {
			
rndm=RndmGntr();
			
switch(rndm){
				
case 0:System.out.println((1+i)+".Red ball is picked"); ++r; break;
				case 1:System.out.println((1+i)+".Green ball is picked"); ++g; break;
				case 2:System.out.println((1+i)+".Blue ball is picked"); ++b; break;
				case 3:System.out.println((1+i)+".Yellow ball is picked"); ++y; break;
			
}

			
if(flg== 0){
				
temp=rndm;
				
flg=1;
			
}
			
else if(temp==rndm)
				
++flg;
			
else{
			
 temp=rndm;
			 
if(flg>=1)
			 	
flg=0;
			
}

			
try{
				
if(flg>=3)
				
throw new myException();
			
}catch(myException e){
				
System.out.println(e);
				
show();
}
	
}
	
System.out.println("Number of times balls picked\nYellow : "+y+" \nBlue : "+b+"\nRed : "+r+"\nGreen : "+g);
	
}




	
public static void main(String arg[]){
		
show();
	
}

}