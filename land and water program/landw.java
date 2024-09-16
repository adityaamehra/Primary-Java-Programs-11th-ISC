import java.util.*;
class landw
{
public static void main(String ag[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows and columns");
int r=sc.nextInt(),c=sc.nextInt(),k=r+1,m=c+1,t,i,y=0;
char a[][]=new char[r][c];
//FOREST RANDOMIZER
for( i=0;i<r;i++)
{
for(t=0;t<c;t++)
{
k=(int)(Math.pow(Math.pow(10,Math.random()),Math.pow(20,Math.random()))+Math.pow(Math.random(),20)*200);
if(k%2==0)
{
a[i][t]='l';
y++;
}
else
a[i][t]='w';
}
}
/*for( i=0;i<r;i++)
{
System.out.println("enter the l and w row values");
for(t=0;t<c;t++)
{
a[i][t]=Character.toLowerCase(sc.next().charAt(0));
if(a[i][t]=='l')
y++;
}
}*/
System.out.println();
for( i=0;i<r;i++)
{
for(t=0;t<c;t++)
System.out.print(a[i][t]+" ");
System.out.println();
}
while(true)
{
try{
//BOMB DROP RANDOMIZER
while(k>=r)
k=(int)(Math.pow(Math.random(),Math.random())*10);
while(m>=c)
m=(int)(Math.pow(Math.random(),Math.random())*10);
/*k=sc.nextInt()-1;
m=sc.nextInt()-1;*/
if(k<=r&&m<=c)
break;
}catch(ArrayIndexOutOfBoundsException M)
{
System.out.println("Re-enter the correct input");
continue;
}
catch(InputMismatchException M)
{
System.out.println("Re-enter the correct input");
continue;
}
}
System.out.println("The bomb is dropped on:-\n("+(k+1)+","+(m+1)+")\nThe region was:-"+a[k][m]);
if(a[k][m]!='w')
{
a[k][m]='x';
for(t=0;t<y;t++)
{
for(k=0;k<r;k++)
{
for(m=0;m<c;m++)
{
if(a[k][m]=='x')
{
try
{
if(a[k-1][m]=='l')
a[k-1][m]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k+1][m]=='l')
a[k+1][m]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m-1]=='l')
a[k][m-1]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m+1]=='l')
a[k][m+1]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k-1][m-1]=='l')
a[k-1][m-1]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k-1][m+1]=='l')
a[k-1][m+1]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k+1][m-1]=='l')
a[k+1][m-1]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k+1][m+1]=='l')
a[k+1][m+1]='x';
}
catch(ArrayIndexOutOfBoundsException M)
{} 
}
}
}
}
}
for(k=0;k<r;k++)
{
for(m=0;m<c;m++)
System.out.print(a[k][m]+" ");
System.out.println();
}
}
}