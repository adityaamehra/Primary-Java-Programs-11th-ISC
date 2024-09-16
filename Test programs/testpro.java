import java.util.*;
class set
{
private int arr[],n;
public set(int n)
{
this.n=n;
arr=new int[n];
}
public void in()
{
Scanner ob=new Scanner(System.in);
int x,y,temp;
for(x=0;x<n;x++)
{
System.out.println("Enter the value");
temp=ob.nextInt();
for(y=x-1;y>=0;y--)
{
if(temp==arr[y])
{
x--;
System.out.println("Please enter the unique value");
continue;
}
}
arr[x]=temp;
}
}
public set union(set m)
{
int x,nsx=0,y;int arm[]=new int[m.n];int arn[]=new int[n];
set ns=new set(m.n+n);
for(x=0;x<n;x++)
arn[x]=arr[x];
for(x=0;x<m.n;x++)
arm[x]=m.arr[x];
for(x=0;x<n;x++)
for(y=0;y<m.n;y++)
if(arr[x]==m.arr[y])
{
ns.arr[nsx]=arr[x];
nsx++;
}
for(x=0;x<n;x++)
for(y=0;y<ns.n;y++)
if(arn[x]==ns.arr[y])
arn[x]=0;
for(x=0;x<m.n;x++)
for(y=0;y<ns.n;y++)
if(arm[x]==ns.arr[y])
arm[x]=0;
for(x=0;x<n;x++)
if(arn[x]!=0)
ns.arr[nsx++]=arn[x];
for(x=0;x<m.n;x++)
if(arm[x]!=0)
ns.arr[nsx++]=arm[x];
return ns;
}
public set intersection(set m)
{
int x,y,nsx=0;
set ns=new set(m.n+n);
for(x=0;x<n;x++)
for(y=0;y<m.n;y++)
if(arr[x]==m.arr[y])
{
ns.arr[nsx]=arr[x];
nsx++;
}
return ns;
}
public void cartesion(set m)
{
int x,y;
for(x=0;x<n;x++)
for(y=0;y<m.n;y++)
System.out.print("("+arr[x]+","+m.arr[y]+")");
}
public void out()
{
int x;
for(x=0;x<n;x++)
if(arr[x]!=0)
System.out.print(arr[x]+" ");
System.out.println();
}
}
class testpro
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
set s1,s2,s3,s4;
s1=new set(ob.nextInt());
s2=new set(ob.nextInt());
s1.in();
s2.in();
s4=s1.intersection(s2);
s3=s1.union(s2);
s1.cartesion(s2);
System.out.println();
s3.out();
s4.out();
}
}