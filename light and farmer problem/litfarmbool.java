import java.util.*;
class litfarmbool
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row and column number");
int r=sc.nextInt(),c=sc.nextInt(),n,a[][],k,m;
boolean usef=true;
System.out.println("Enter the number of farm lights");
n=sc.nextInt();
a=new int[r][c];
System.out.println("Enter the coordinates of farm lights");
for(k=0;k<n;k++)
{
r=sc.nextInt();
c=sc.nextInt();
a[r-1][c-1]=10;
}
for(k=0;k<a.length;k++)
for(m=0;m<a[0].length;m++)
{
if(a[k][m]>=10)
{ 
try
{
a[k-1][m]++;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
a[k+1][m]++;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
a[k][m-1]++;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
a[k][m+1]++;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
a[k-1][m-1]++;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
a[k-1][m+1]++;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
a[k+1][m-1]++;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
a[k+1][m+1]++;
}
catch(ArrayIndexOutOfBoundsException M)
{}
}
}
for(k=0;k<a.length;k++)
{
for(m=0;m<a[0].length;m++)
System.out.print(a[k][m]+" ");
System.out.println();
}
System.out.println();
for(k=0;k<a.length;k++)
{
for(m=0;m<a[0].length;m++)
{
usef=false;
if(a[k][m]==10)
{
a[k][m]=2000;
}
else if(a[k][m]>10)
{
a[k][m]-=10;
try
{
if(a[k-1][m]<10)
{
a[k-1][m]--;
if(a[k-1][m]==0)
usef=true;
}
else
a[k-1][m]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k+1][m]<10)
{
a[k+1][m]--;
if(a[k+1][m]==0)
usef=true;
}
else
a[k+1][m]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m-1]<10)
{
a[k][m-1]--;
if(a[k][m-1]==0)
usef=true;
}
else
a[k][m-1]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m+1]<10)
{
a[k][m+1]--;
if(a[k][m+1]==0)
usef=true;
}
else
a[k][m+1]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k-1][m-1]<10)
{
a[k-1][m-1]--;
if(a[k-1][m-1]==0)
usef=true;
}
else
a[k-1][m-1]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k-1][m+1]<10)
{
a[k-1][m+1]--;
if(a[k-1][m+1]==0)
usef=true;
}
else
a[k-1][m+1]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k=1][m-1]<10)
{
a[k+1][m-1]--;
if(a[k+1][m-1]==0)
usef=true;
}
else
a[k+1][m-1]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k+1][m+1]<10)
{
a[k+1][m+1]--;
if(a[k+1][m+1]==0)
usef=true;
}
else
a[k+1][m+1]-=10;
}
catch(ArrayIndexOutOfBoundsException M)
{}
if(usef)
a[k][m]=2000;
}
}
}
for(k=0;k<a.length;k++)
{
}
for(k=0;k<a.length;k++)
{
for(m=0;m<a[0].length;m++)
{
if(a[k][m]==2000)
System.out.print("U"+" ");
else
System.out.print("X"+" ");
}
System.out.println();
}
}
}
