import java.util.*;
class bin
{public static void main(String ag[])
{Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s1=sc.next();
int l=s1.length();
for(int x=0;x<l;x++)
{for(int y=x;y<l;y++)
{ String s=s1.substring(x,y+1);
int l1=s.length();
 if((s.charAt(0)=='1') && (s.charAt(l1-1)=='1'))
{ System.out.println(s);}
}
}
}}
 