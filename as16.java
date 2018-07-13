import java.io.*;
class student{
    double s1,s2,s3,s4,s5,avg;
    String name,s;
    void add()
    {
        try{
             System.out.print("Give the name :");
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             name=br.readLine();
             System.out.print("Give the Marks :");
             s=br.readLine();
             s1=Double.parseDouble(s);
             s=br.readLine();
             s2=Double.parseDouble(s);
             s=br.readLine();
             s3=Double.parseDouble(s);
             s=br.readLine();
             s4=Double.parseDouble(s);
             s=br.readLine();
             s5=Double.parseDouble(s);
             avg=(s1+s2+s3+s4+s5)/5;
           }
        catch(Exception e)
        {
            System.out.println(e);
        }
   }

   void show()
   {
       System.out.println(name);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       System.out.println(s5);

   }
}
public class as16
{

    public static void main(String[] args) {
      try{
             student[][] ob=new student[10][5];
       int i,j=0;
       for(i=0;i<9;i++)
       {
           ob[i]=new student();
           ob[i].add();
       }
       for(i=0;i<5;i++)
       {
        if(ob[i].avg>ob[i+1].avg){
            j=i;
       }
        else
            j=i+1;
       }
       System.out.println("The best student is\n");
       ob[j].show();
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
    }

    }
