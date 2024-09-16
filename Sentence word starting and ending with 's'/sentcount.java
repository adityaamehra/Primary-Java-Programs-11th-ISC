import java.util.*;
class sentence
{
private String sent;
private int s_count;
public sentence()
{
sent="";
s_count=0;
}
public void read()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the sentence in upper case");
sent=(ob.nextLine()).toUpperCase();
}
public void sort()
{
String ar[]=sent.split(" "),temp="";
int x,y;
for(x=0;x<ar.length;x++)
for(y=x+1;y<ar.length;y++)
if(compareTo(ar[y],ar[x])<0)
{
temp=ar[y];
ar[y]=ar[x];
ar[x]=temp;
}
for(x=0;x<ar.length;x++)
System.out.print(ar[x]+" ");
System.out.println();
}
public int compareTo(String P,String K)
{
int x,y,max=0;
if(P.length()>K.length())
max=K.length();
else
max=P.length();
for(x=0;x<max;x++)
if(P.charAt(x)!=K.charAt(x))
return((int)(P.charAt(x)-K.charAt(x)));
if(x==max)
return(P.length()-K.length());
return(-1);
}
public boolean S_string(String P)
{
if(("sS".indexOf(P.charAt(0))>=0)&&("sS".indexOf(P.charAt(P.length()-1))>=0))
return(true);
else
return(false);
}
public void display()
{
System.out.println(sent);
sort();
StringTokenizer st=new StringTokenizer(sent);
int n=st.countTokens(),x;
for(x=0;x<n;x++)
if(S_string(st.nextToken()))
s_count++;
System.out.println(s_count);
}
}
class sentcount
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
sentence x=new sentence();
x.read();
x.display();
}
}