import java.io.*;
class sub1com
{
public static void main(String ar[])throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
String s1,s2;
int x,l=0,ar1[],sum[],ar2[],temp=0,c=0;
System.out.println("Enter the first number");
s1=ob.readLine();
System.out.println("Enter the second number");
s2=ob.readLine();
ar1=new int[s1.length()];
sum=new int[ar1.length+2];
ar2=new int[s2.length()];
//1'S COMPLIMENT
StringBuffer sb=new StringBuffer(s2);
for(x=0;x<s2.length();x++)
{
if(s2.charAt(x)=='0')
{
sb.delete(x,x+1);
sb.insert(x,'1');
}
else
{
sb.delete(x,x+1);
sb.insert(x,'0');
}
}
s2=sb.toString();
//DONE 1'S COMPLIMENT
//SAME SIZE
if(s2.length()>s1.length())
{
l=s1.length();
for(x=0;x<(s2.length()-l);x++)
s1="0"+s1;
}
else if(s1.length()>s2.length())
{
l=s2.length();
for(x=0;x<(s1.length()-l);x++)
s2="0"+s2;
}
//SAME SIZE DONE
//ARRAY START
for(x=0;x<ar1.length;x++)
ar1[x]=Integer.parseInt(s1.charAt(x)+"");
for(x=0;x<ar2.length;x++)
ar2[x]=Integer.parseInt(s2.charAt(x)+"");
//ARRAY COMPLETE
System.out.println(s1+" "+s2);
//SUMMING START
int temp2=0;
while(temp<sum.length)
{
if(temp<ar1.length)
{
c=ar1[ar1.length-1-temp]+ar2[ar2.length-1-temp]+c;
temp2++;
}
sum[sum.length-1-temp]=c%2;
c=c/2;
temp++;
}
//SUMMING COMPLETE
c=0;
temp=0;
for(x=(sum.length-temp2-1);x>=0;x--)
{
System.out.println(x);
if(sum[x]==1)
{
//RE-SUMMING START
while(sum.length>)
{
if(temp
c=c;
sum[sum.length-1-temp]=c%2;
c=c/2;
temp++;
}
//RE-SUMMING DONE
break;
}
}
if(x<0)
{
s2="";
for(x=(sum.length-temp2);x<sum.length;x++)
s2+=sum[x];
//RE 1'S COMPLIMENT START
StringBuffer sb1=new StringBuffer(s2);
for(x=0;x<s2.length();x++)
{
if(s2.charAt(x)=='0')
{
sb1.delete(x,x+1);
sb1.insert(x,'1');
}
else
{
sb1.delete(x,x+1);
sb1.insert(x,'0');
}
}
s2=sb1.toString();
//RE 1'S COMPLIMENT DONE
System.out.println("-"+s2);
}
}
}