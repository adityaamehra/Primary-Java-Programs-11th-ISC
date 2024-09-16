import java.util.*;
class binnew
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number");
String s=(ob.next()).toLowerCase(),s2="";
int l=s.length(),x,y,z=0;
for(x=0;x<l;x++)
for(y=x;y<l;y++)
{
s2=s.substring(x,y+1);
z=s2.length();
if(s2.charAt(0)=='1'&&s2.charAt(z-1)=='1')
System.out.println(s2);
s2="";
}
}
}