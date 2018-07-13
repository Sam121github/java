import java.util.*;

class c3{
	public static void main(String Arg[]){
	Scanner s = new Scanner(System.in);
	
	System.out.print("\nEnter valuse of RxC = ");
	int r=s.nextInt();
	int c=s.nextInt(),flg=0;
	int ary[][] =new int [r][c] ;

	for (int i=0;i< r;++i ){
		System.out.println();
		for(int j=0;j<c;++j){
			System.out.print("Enter valuse at arr["+i+"]["+j+"] : ");
			ary[i][j]=s.nextInt();
		}
	}

System.out.print("Ented valuse : \n");
	for (int i=0;i< r;++i ){
		System.out.println();
		for(int j=0;j<c;++j){
			System.out.print("\t"+ary[i][j]);
			
		}
	}
System.out.print(" \n");

lbl:{
if(flg==1)
	System.out.println("It is not upper triangle matrix ");
	

	for (int i=0;i< r;++i ){
		for(int j=0;j<c;++j){
			if( i>j && ary[i][j] != 0 ){
				flg=1;
				break lbl;
			}
			
		}
	}
if(flg==0)
{
	System.out.println("It is upper triangle matrix ");
	};

}


	System.out.println();
}	
}
