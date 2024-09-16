import java.util.*;
class sub1com
{public static void main(String ag[])
{Scanner sc=new Scanner(System.in);
String s1,s2,s3="",s4="";
int x,l2;

System.out.println("enter the binary number- 0 and 1 with spaces");
s1=sc.nextLine();
System.out.println("enter the binary number- 0 and 1 with spaces");
s2=sc.nextLine();
l2=s2.length();
if(s1.length()>s2.length())
{for( x=0;x<(s1.length()-l2);x++)
{s2="0"+s2;}}

if(s2.length()>s1.length())
{for(x=0;x<(s2.length()-l2);x++)
{s1="0"+s1;}}

for( x=0;x<s2.length();x++)
{
if(s2.charAt(x)=='0')
s3=s3+"1";
if(s2.charAt(x)=='1')
s3=s3+"0";
}

for(x=s1.length()-1;x>=0;x--)
{}
}}
