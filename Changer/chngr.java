import java.io.*;
import java.util.*;
class chngr
{
public static void main(String ar[])throws Exception
{
Scanner ob=new Scanner(System.in);
FileReader fr;
BufferedReader br;
FileWriter fw;
PrintWriter pw;
File f;
String s,k[],rn="";
int ch,x;
while(true)
{
System.out.println("Enter the choice\n1.Name\n2.Marks\n3.Exit");
ch=ob.nextInt();
switch(ch)
{
case 1:
fr=new FileReader("abc");
br=new BufferedReader(fr);
fw=new FileWriter("temp");
pw=new PrintWriter(fw);
String t=ob.nextLine();
System.out.println("Enter the roll number");
rn=ob.nextLine();
while((s=br.readLine())!=null)
{
k=s.split("@");
System.out.println(k[0]);
if(k[0].equals(rn))
{
System.out.println("Enter the name");
k[1]=ob.nextLine();
}
pw.println(k[0]+"@"+k[1]+"@"+k[2]+"@"+k[3]+"@"+k[4]+"@");
}
pw.close();
fw.close();
br.close();
fr.close();
f=new File("abc");
f.delete();
f=new File("temp");
f.renameTo(new File("abc"));
break;
case 2:
t=ob.nextLine();
fr=new FileReader("abc");
br=new BufferedReader(fr);
fw=new FileWriter("temp");
pw=new PrintWriter(fw);
System.out.println("Enter the roll number");
rn=ob.nextLine();
while((s=br.readLine())!=null)
{
k=s.split("@");
if(k[0].equals(rn))
{
System.out.println("Enter the marks");
k[2]=Double.toString(ob.nextDouble());
k[3]=Double.toString(ob.nextDouble());
k[4]=Double.toString(ob.nextDouble());
}
pw.println(k[0]+"@"+k[1]+"@"+k[2]+"@"+k[3]+"@"+k[4]+"@");
}
pw.close();
fw.close();
br.close();
fr.close();
f=new File("abc");
f.delete();
f=new File("temp");
f.renameTo(new File("abc"));
break;
case 3:
System.exit(0);
break;
default:
System.out.println("Enter exeptable values");
}
}
}
}