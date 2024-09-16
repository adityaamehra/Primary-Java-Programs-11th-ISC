import java.util.*;
class dc
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the date\nIn the following format:-\nDD/MM/YYYY");
String s=ob.nextLine(),k[];
k=s.split("/");
int md=0,fd=0,k2=Integer.parseInt(k[2]),k1=Integer.parseInt(k[1]),k0=Integer.parseInt(k[0]);
boolean ly=false,ald=true;
//CHECKING LEAP YEAR
while(ald)
{
if(k2%100!=0)
{
if(k2%4==0)
ly=true;
else
ly=false;
}
else
{
if(k2%4==0)
ly=true;
else
ly=false;
}
if(k1>12)
{
fd=k1;
k1=0;
while(fd>12)
{
k1++;
if(k1>12)
{
k1=k1-12;
k2++;
}
fd--;
}
}
else if(k1<=12)
{
if(k1==2)
{
if(ly)
md=29;
else
md=28;
if(k0>md)
{
k0-=md;
k1++;
}
}
if(k1!=2)
{
switch(k1)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
md=31;
break;
}
switch(k1)
{
case 4:
case 6:
case 9:
case 11:
md=30;
break;
}
if(k1==12)
{
if(k0>md)
{
k1=0;
k0-=md;
k1++;
k2++;
}
else
ald=false;
}
else
{
if(k0>md)
{
k0-=md;
k1++;
}
}
if(k0<=md&&k1<13)
ald=false;

}
}
if(k0<=md&&k1<13)
ald=false;

}
if(k0<10)
k[0]="0"+k0;
else
k[0]=""+k0;
if(k1<10)
k[1]="0"+k1;
else
k[1]=""+k1;
if(k2<10)
k[2]="0"+k2;
else
k[2]=""+k2;
System.out.println(k[0]+"/"+k[1]+"/"+k[2]);
}
}