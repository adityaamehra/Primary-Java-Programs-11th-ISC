import java.util.*;
class slsr
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Input");
int sl=ob.nextInt()-1,x=0,y,l,c=0,z=0,arr[]=new int[26],k;
boolean o=false;
String temp=ob.nextLine(),s=(ob.nextLine()).toLowerCase(),s2="";
l=s.length()-1;
StringBuffer sb=new StringBuffer(s);
while(!o)
{
try{
s2=s.substring(x,x+sl+1);
}catch(StringIndexOutOfBoundsException p)
{
x=-1;
s=sb.toString();
s2="";
l=s.length();
}
for(k='a';k<='z';k++)
{
for(int h=0;h<s.length();h++)
if(k==s.charAt(h))
c++;
arr[(int)(k)-97]=c;
c=0;
}
c=0;
for(k=0;k<arr.length;k++)
if(arr[k]>sl)
break;
if(k==arr.length)
o=true;
for(y=0;y<s2.length();y++)
{
for(z=0;z<s2.length();z++)
if(s2.charAt(y)==s2.charAt(z))
c++;
if(c==(sl+1))
{
sb.delete(x,x+sl+1);
break;
}
c=0;
}
x++;
c=0;
}
System.out.println(sb.toString());
}
}