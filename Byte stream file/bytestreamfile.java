import java.io.*;
class bytestreamfile
{
public static void main(String ar[])throws IOException
{
InputStreamReader ob1=new InputStreamReader(System.in);
BufferedReader ob=new BufferedReader(ob1);
FileOutputStream fs=new FileOutputStream("Adityaa.mehra",true);
DataOutputStream ds=new DataOutputStream(fs);
System.out.println("Enter the roll no. and name");
String r=ob.readLine(),n=ob.readLine();
ds.writeUTF(r);
ds.writeUTF(n);
System.out.println("Enter int n0");
int n0=Integer.parseInt(ob.readLine());
ds.writeInt(n0);
ds.close();
fs.close();
ob.close();
ob1.close();
}
}