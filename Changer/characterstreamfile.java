import java.util.*;
import java.io.*;
class characterstreamfile
{
public static void main(String ar[])throws Exception
{
Scanner ob=new Scanner(System.in);
FileWriter fw=new FileWriter("abc",true);
PrintWriter pw=new PrintWriter(fw);
String rn="",name="",t1="",t2="";
Double m1,m2,m3;
int n,x;
System.out.println("Enter the no. of students");
n=ob.nextInt();
for(x=0;x<n;x++)
{
try{
System.out.println("Enter the roll no. and name");
rn=ob.nextLine();
System.out.println(rn);
t1=ob.nextLine();
System.out.println(t1);
name=ob.nextLine();
System.out.println(t2+" "+name);
System.out.println("Enter the marks");
m1=ob.nextDouble();
m2=ob.nextDouble();
m3=ob.nextDouble();
}catch(Exception p)
{x--;continue;}
pw.println(t1+"@"+name+"@"+m1+"@"+m2+"@"+m3+"@");
}
pw.close();
fw.close();
ob.close();
}
}