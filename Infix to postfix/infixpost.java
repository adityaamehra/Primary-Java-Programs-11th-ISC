import java.util.*;
class infixpost
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the expression");
String s="("+ob.nextLine()+")";
char a[];
int l=s.length(),x,y=0,z=0,bo=0,bc=0,j;
a=new char[l];
for(x=0;x<l;x++)
{
if((s.charAt(x)>='A'&&s.charAt(x)<='Z')||(s.charAt(x)>='a'&&s.charAt(x)<='z'))
System.out.print(s.charAt(x));
else
{
a[y]=s.charAt(x);
y++;
for(z=0;z<a.length;z++)
{
if(a[z]=='(')
bo=z;
if(a[z]==')')
{
bc=z;
break;
}
try{
for(int e=z;e>bo;e--)
{
if(a[z+1]=='+'||a[z+1]=='-')
if(a[e]=='-'||a[e]=='^'||a[e]=='/'||a[e]=='*'||a[e]=='+')
{
if(a[e]!='\u0000')
System.out.print(a[e]);
a[e]='\u0000';
}
}
}catch(ArrayIndexOutOfBoundsException m){}
try{
for(int e=z;e>bo;e--)
{
if(a[z+1]=='*'||a[z+1]=='/')
if(a[e]=='^'||a[e]=='/'||a[e]=='*')
{
if(a[e]!='\u0000')
System.out.print(a[e]);
a[e]='\u0000';
}
}
}catch(ArrayIndexOutOfBoundsException m){}
try{
if(a[z+1]=='^')
if(a[z]=='^')
{
System.out.print(a[z]);
a[z]='\u0000';
}
}catch(ArrayIndexOutOfBoundsException m){}
/*System.out.println();
for(int q=0;q<a.length;q++)
System.out.print(a[q]);
System.out.println();*/
}
for(z=bc-1;z>bo;z--)
{
a[bo]='\u0000';
a[bc]='\u0000';
if(a[z]!='\u0000')
{
System.out.print(a[z]);
a[z]='\u0000';
}
}
bc=0;
}
}
}
}