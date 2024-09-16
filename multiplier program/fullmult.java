import java.util.*;
class fullmult
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n=0,x,y;
String a1,b1,arr[],frs;
int l;
long a,k,b,fr,temp;
System.out.println("Enter the two numbers");
a1=sc.next();
b1=sc.next();
a=Long.parseLong(a1);
b=Long.parseLong(b1);
fr=a*b;
frs=Long.toString(fr);
arr=new String[b1.length()];
temp=b;
while(temp!=0)
{
k=temp%10;
arr[n]=Long.toString(a*k);
temp=temp/10;
n++;
}
for(y=0;y<(frs.length()-a1.length());y++)
System.out.print(" ");
System.out.print(a);
System.out.println();
for(y=0;y<(frs.length()-b1.length()-1);y++)
System.out.print(" ");
System.out.print("x"+b);
System.out.println();
for(x=0;x<frs.length();x++)
System.out.print("-");
System.out.println();
for(x=0;x<b1.length();x++)
{ 
if((arr[x].equals("0")))
l=arr[x].length()+1+x;
else
l=arr[x].length();
for(y=0;y<(frs.length()-(l+x));y++)
System.out.print(" ");
if(!(arr[x].equals("0")))
System.out.print(arr[x]);
else
for(int h=0;h<a1.length();h++)
System.out.print(0);
for(y=0;y<x;y++)
System.out.print("x");
System.out.println();
}
for(x=0;x<frs.length();x++)
System.out.print("-");
System.out.println();
System.out.println(fr);
for(x=0;x<frs.length();x++)
System.out.print("-");
}
}