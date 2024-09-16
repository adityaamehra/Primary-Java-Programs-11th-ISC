import java.util.*;
class minesweeper
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the row and column number");
int r=ob.nextInt(),c=ob.nextInt(),n,x=0,y=0,a[][],k,m,ch=0,temp=0,tnull=0,nb=0;
double sc=0.0;
String ad[][]=new String[r][c];
System.out.println("Enter the number of mines");
n=ob.nextInt();
a=new int[r][c];
for(x=0;x<n;x++)
{
while(true)
{
r=(int)(Math.pow(Math.pow(10,Math.random()),Math.pow(2000,Math.random()))+Math.pow(Math.random(),20)*200)-1;
c=(int)(Math.pow(Math.pow(10,Math.random()),Math.pow(20,Math.random()))+Math.pow(Math.random(),20)*200)-1;
if(r<=a.length&&c<=a[0].length&&r>0&&c>0)
break;
}
a[r-1][c-1]=10;
for(k=0;k<a.length;k++)
for(m=0;m<a[0].length;m++)
if(a[k][m]>=10)
nb++;
if(x==(n-1)&&nb<n)
x-=2;
if(nb==n)
break;
nb=0;
}
temp=0;
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
System.out.print("|_| ");
System.out.println();
}
while(true)
{
System.out.println("Enter the position to select");
while(true)
{
try{
x=ob.nextInt()-1;
y=ob.nextInt()-1;
if(x<=a.length&&y<=a[0].length)
break;
else
System.out.println("Enter  an exceptable input");
}catch(Exception p)
{
System.out.println("Enter  an exceptable input");
}
}
System.out.println("Enter the choice:-\n1.)Play\n2.)Flag\n3.)Doubt");
ch=ob.nextInt();
switch(ch)
{
case 1:
{
if(ad[x][y]==null)
ad[x][y]=(a[x][y])+"";
if(a[x][y]>=10)
{
temp=1;
break;
}
}
break;
case 2:
if(ad[x][y]==null)
ad[x][y]="F";
if(a[x][y]>=10)
sc+=10;
else
sc-=0.5;
break;
case 3:
if(ad[x][y]==null)
ad[x][y]="?";
break;
}
if(temp==1)
{
System.out.println("Game over\nScore: "+sc);
break;
}
for(int h=0;h<ad.length;h++)
for(int l=0;l<ad[0].length;l++)
if(ad[h][l]==null)
tnull++;
if(tnull==0)
{
System.out.println("Game over\nScore: "+sc);
break;
}
else
tnull=0;
for(int h=0;h<ad.length;h++)
{
for(int l=0;l<ad[0].length;l++)
if(ad[h][l]!=null)
System.out.print("|"+ad[h][l]+"| ");
else
System.out.print("|_| ");
System.out.println();
}
}
for(k=0;k<a.length;k++)
{
for(m=0;m<a[0].length;m++)
{
if((ad[k][m]=="F"&&a[k][m]>=10))
System.out.print("|X | ");
else if((ad[k][m]=="?"&&a[k][m]>=10))
System.out.print("|DB| ");
else if(a[k][m]>=10)
System.out.print("|B | ");
else
System.out.print("|NB| ");
}
System.out.println();
}
}
}
