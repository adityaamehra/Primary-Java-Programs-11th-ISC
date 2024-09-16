import java.util.*;
class dc2
{public static void main(String ag[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the date DD/MM/YYYY");
String s=sc.nextLine();
String st[]=s.split("/");
int a[]=new int[12];
int k=0,t=0;
boolean m=true;
if(Integer.parseInt(st[2])%100==0)
k=400;
else
k=4;
a[0]=a[2]=a[4]=a[6]=a[7]=a[9]=a[11]=31;
a[3]=a[5]=a[8]=a[10]=30;

if(Integer.parseInt(st[1])%12!=0)
t=1;

while(m)
{

if(Integer.parseInt(st[2])%k==0)
{a[1]=29;}
else
{a[1]=28;}

if((Integer.parseInt(st[0]))>a[(Integer.parseInt(st[1])%12)-t])
{st[0]=""+(Integer.parseInt(st[0])-a[(Integer.parseInt(st[1])%12)-t]);
st[1]=""+(Integer.parseInt(st[1])+1);}
else
m=false;

}
m=true;
while(m)
{
if(Integer.parseInt(st[1])>12)
{st[2]=""+((Integer.parseInt(st[2]))+1);
st[1]=""+(Integer.parseInt(st[1])-12);}
else
m=false;
}
System.out.println(st[0]+"/"+st[1]+"/"+st[2]);
}}