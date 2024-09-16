import java.util.*;
class aasnew
{public static void main(String ag[])
{Scanner sc=new Scanner (System.in);
int b=0,n,x,p=0,y;

System.out.println("enter the length of array");
n=sc.nextInt();
int a[]=new int[n];
for(x=0;x<n;x++)
{a[x]=sc.nextInt();}
 x=0;

while(b<n)
{if ((a[x]+x)>n)
 p=(a[x]+x)-n-1;
else
{p=a[x]+x-1;}
a[x]=0;

for(y=x+1;y<=p;y++)
{if(y==n)
 y=y-n;
if(a[y]==0)
{p++;
if(p>n)
{p=p-n;
x++;}
b++;

}}}
}}