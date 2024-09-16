import java.util.*;
class ls
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the string");
String s=ob.nextLine(),sub="",lons="";
int l=s.length(),x,y,z;
boolean b=true;
for(x=0;x<l;x++)
for(y=x+1;y<=l;y++)
{
sub=s.substring(x,y);
for(z=0;z<sub.length();z++)
{
if(sub.indexOf(sub.charAt(z))!=sub.lastIndexOf(sub.charAt(z)))
{
b=false;
break;
}
}
if(b)
if(lons.length()<sub.length())
lons=sub;
b=true;
}
System.out.println(lons);
}
}