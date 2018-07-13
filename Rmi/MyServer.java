import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{

public static void main(String args[]){
try{

Palin stub=new PalinRemote();
Naming.rebind("rmi://localhost:5000/SAM",stub);

}catch(Exception e){System.out.println(e);}
}

}