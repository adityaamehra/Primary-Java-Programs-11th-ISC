import java.util.*;
class runaround
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number");
String s=ob.next();
int l=s.length(),a[]=new int[l],b[]=new int[l],x,y=0,z=0,h,temp=0,n=0;
boolean br=true;
for(x=0;x<l;x++)
{
a[x]=(int)(s.charAt(x)-48);
b[x]=(int)(s.charAt(x)-48);
}
b[0]=0;
while(true)
{
y=a[z];
for(x=0;x<y;x++)
{
z++;
if(z==l)
z=0;
}
b[z]=0;
for(h=0;h<l;h++)
{
if(b[h]==0)
temp++;
}
if(temp==l)
{
br=true;
break;
}
temp=0;
n++;
if(n>l)
{
br=false;
break;
}
}
if(br)
System.out.print("Runaround");
else
System.out.print("Not Runaround");
}
}