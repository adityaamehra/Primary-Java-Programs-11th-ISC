import java.util.*;
class aas
{
public static void main(String ag[])
{Scanner sc=new Scanner(System.in);
int l,n=0,k,c=0,p=0,x,i,j;
System.out.println("Enter the length of array");
l=sc.nextInt();
int A[]=new int[l];
for(x=0;x<l;x++)
{A[x]=sc.nextInt();
}
for(i=1;i<l;i++)
{
x=A[n];
A[n]=0;
k=x%(l-i);
if(k==0)
k=l-i;
if(k>(l-i))
p--;
if(k>(l-n-1-p)&&(l-n-1)>p)
{k=k-(l-n-1-p);
p++;}
for(j=0;j<l;j++)
{if(A[j]!=0)
c++;
if(c==k)
break;
if(i==l-1 && c==1)
break;}
c=0;
n=j;}

System.out.println(A[n]);
}}