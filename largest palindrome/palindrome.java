import java.util.*;
class palindrome
{
public static void main(String ag[])
{
Scanner sc=new Scanner(System.in);
int pl=0,l,l1,y,x;
char c1='\u0000';
String s,p="",s1="",s2="",s3="";
System.out.println("enter the String");
s=sc.nextLine();
l=s.length();
for(x=0;x<l;x++)
{ c1=s.charAt(x);
 for(y=x+1;y<l;y++)
{ if (s.charAt(y)==(c1))
 {  s2=s.substring(x,y+1);
   StringBuffer sb=new StringBuffer(s2);
  sb.reverse();
  s3=sb.toString();
l1=s2.length();
if(s2.equalsIgnoreCase(s3))
{
if(l1>pl)
   {p=s2;
    pl=l1;}
}}
}}
System.out.println(p);
}}