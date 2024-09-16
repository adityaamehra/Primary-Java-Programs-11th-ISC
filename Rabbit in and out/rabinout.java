import java.util.*;
class rabinout
{
public static void main(String ag[])
{
Scanner  ob=new Scanner(System.in);
System.out.println("enter the number of rows and columns");
int r= ob.nextInt(),c= ob.nextInt(),k=0,m=0,y=0;
char a[][]=new char[r][c],buff='\u0000';
boolean b=false;
System.out.println("Enter the direction values");
for( k=0;k<r;k++)
for(m=0;m<c;m++)
{
buff=Character.toLowerCase(ob.next().charAt(0));
if(buff=='u'||buff=='d'||buff=='l'||buff=='r')
a[k][m]=buff;
else
{
m--;
System.out.println("enter exceptable values");
}
}
System.out.println();
k=0;m=0;
while(true)
{
try
{
if(a[k][m]=='l')
{
a[k][m]='X';
m--;
}
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m]=='u')
{
a[k][m]='X';
k--;
}
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m]=='d')
{
a[k][m]='X';
k++;
}
}
catch(ArrayIndexOutOfBoundsException M)
{} 
try
{
if(a[k][m]=='r')
{
a[k][m]='X';
m++;
}
}
catch(ArrayIndexOutOfBoundsException M)
{}
if(k>=r-1&&m>=c-1)
{
b=true;
break;
}
y++;
if(y>((r*c)+1))
{
b=false;
break;
}
}
System.out.println();
for( k=0;k<r;k++)
{
for(m=0;m<c;m++)
System.out.print(a[k][m]+" ");
System.out.println();
}
if(b)
System.out.println("Yes the rabbit will come out");
else
System.out.println("No the rabbit will not come out");
}
}