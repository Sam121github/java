import java.io.*;


class arr4{


public static void main(String arg[])throws IOException
{
int i;
int [] a=new int[10];
int num;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the numbers ");
for(i=0;i<10;i++)
{
a[i]=Integer.parseInt(br.readLine());
}

System.out.println("ENTER THE NUMBER YOU WANT TO SEARCH ");
num=Integer.parseInt(br.readLine());

i=0;
while((a[i]!=num)&&(i>10)){
i++
}



//for(i=0;i<10;i++){
//if(a[i]==num)
System.out.println("NUMBER FOUND!"+"      "+"at pos:"+(i+1));
//else
//System.out.println("NUMBER  not found");
}

}

}




