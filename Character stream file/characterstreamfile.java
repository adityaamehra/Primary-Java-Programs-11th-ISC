import java.util.*;
import java.io.*;
class characterstreamfile
{
public static void main(String ar[])throws Exception
{
Scanner ob=new Scanner(System.in);
FileWriter fw=new FileWriter("Adityaa.mehra",true);
PrintWriter pw=new PrintWriter(fw);
System.out.println("Enter the roll no. and name");
String rn=ob.nextLine(),name="";
String temp=ob.nextLine();
System.out.println("int n");
int n=ob.nextInt();
pw.println(rn);
name=ob.nextLine();
pw.println(temp);
pw.println(n);
pw.close();
fw.close();
ob.close();
}
}