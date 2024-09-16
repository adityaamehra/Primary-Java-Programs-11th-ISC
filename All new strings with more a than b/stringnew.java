import java.util.*;
import java.io.*;
class stringnew
{
public static void main(String args[])throws IOException
{
Scanner ob=new Scanner(System.in);
FileOutputStream fs=new FileOutputStream("Adityaa.mehra",true);
DataOutputStream ds=new DataOutputStream(fs);
FileInputStream fn=new FileInputStream("Adityaa.mehra");
DataInputStream dn=new DataInputStream(fn);
System.out.println("Enter the string");
String s=(ob.next()).toLowerCase(),s2="",s3="";
int l=s.length(),x,stp=0,y,a=0,c=0,z=0;
for(x=0;x<l;x++)
{
for(stp=x;stp<l;stp++)
{
s2=s.substring(x,stp+1);
for(y=0;y<s2.length();y++)
{
if(s2.charAt(y)=='a')
a++;
else
c++;
}
if(a>c)
ds.writeUTF(s2);
s2="";
a=0;
c=0;
}
}
ds.close();
fs.close();

}
}