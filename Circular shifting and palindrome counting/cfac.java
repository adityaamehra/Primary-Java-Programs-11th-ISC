import java.util.*;
class cfac
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the string");
String s=ob.nextLine(),sn="",sn2="";
sn=s;
int l=s.length(),x,y,c=0;
for(x=0;x<l-1;x++)
{
sn=sn.substring(1,l)+sn.substring(0,1);
for(y=sn.length()-1;y>=0;y--)
sn2+=sn.charAt(y);
if(sn.equalsIgnoreCase(sn2))
c++;
sn2="";
}
System.out.println(s+"\n"+c);
}
}