import java.util.*;
import java.io.*;
class df
{
public static void main(String ar[])throws IOException
{
Scanner ob=new Scanner(System.in);
DataInputStream obb=new DataInputStream(System.in);
int d=0,m=0,y=0,dif=0,md=0,td=0,tm=0,ans=0;
String jd="",sp[],ci="",ci2="";
boolean lp=false;
System.out.print("Date:");
dc x=new dc();
ci=obb.readLine();
ci2=x.k(ci);
d=Integer.parseInt(sp[0]);
m=Integer.parseInt(sp[1]);
y=Integer.parseInt(sp[2]);
System.out.print("Day on 1st January:");
jd=obb.readLine();
td=d;
//STARTED CHECKING THE DAY
while(true)
{
if(jd.equalsIgnoreCase("monday"))
{
ans=1;
break;
}
else if(jd.equalsIgnoreCase("tuesday"))
{
ans=2;
break;
}
else if(jd.equalsIgnoreCase("wednesday"))
{
ans=3;
break;
}
else if(jd.equalsIgnoreCase("thursday"))
{
ans=4;
break;
}
else if(jd.equalsIgnoreCase("friday"))
{
ans=5;
break;
}
else if(jd.equalsIgnoreCase("saturday"))
{
ans=6;
break;
}
else if(jd.equalsIgnoreCase("sunday"))
{
ans=7;
break;
}
else
{
System.out.println("Enter the correct day");
System.out.print("Day on 1st January:");
jd=obb.readLine();
}
}
//STOPPED CHECKING THE DAY
tm=m;
d=1;
m=1;
//LEAP YEAR START CHECKING
if(y%100==0)
{
if(y%400==0)
lp=true;
}
else
if(y%4==0)
lp=true;
//LEAP YEAR CHECKED
//START WORKING
while(true)
{
switch(m)
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
case 2:
{
if(lp)
md=29;
else
md=28;
}
break;
case 4:
case 6:
case 9:
case 11:
md=30;
break;
}
if(d==md)
{
m++;
d=0;
}
d++;
ans++;
if(ans>7)
ans=1;
if(td==d&&tm==m)
break;
}//WHILE BRACKET
//WORKING STOP
if(ans==1)
System.out.print("Monday");
else if(ans==2)
System.out.print("Tuesday");
else if(ans==3)
System.out.print("Wednesday");
else if(ans==4)
System.out.print("Thursday");
else if(ans==5)
System.out.print("Friday");
else if(ans==6)
System.out.print("Saturday");
else
System.out.print("Sunday");
}
}