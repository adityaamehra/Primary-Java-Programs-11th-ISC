import java.util.*;
class paraandsent
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the paragraph");
String para=ob.nextLine(),par[],s2="";
int x,y,z,voc=0,n,k,z2;
boolean b=true;
StringTokenizer pst=new StringTokenizer(para,"?!.");
par=new String[pst.countTokens()];
System.out.println("No. of sentences :-"+par.length);
z2=pst.countTokens();
for(x=0;x<z2;x++)
par[x]=pst.nextToken();
System.out.println("Sentence no.\tFrequency of vowels\tUnique Words");
for(x=0;x<par.length;x++)
{
StringTokenizer st=new StringTokenizer(par[x]," _");
for(y=0;y<par[x].length();y++)
if("AEIOUaeiou".indexOf(par[x].charAt(y))!=-1)
voc++;
System.out.print(x+"\t\t"+voc+"\t\t");
voc=0;
n=st.countTokens();
for(z=0;z<n;z++)
{
s2=st.nextToken();
for(k=0;k<s2.length();k++)
{
if(s2.lastIndexOf(s2.charAt(k))!=s2.indexOf(s2.charAt(k)))
{
b=false;
break;
}
}
if(b)
System.out.print(s2+",");
b=true;
}
System.out.println();
}
}
}