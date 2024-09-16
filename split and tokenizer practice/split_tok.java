import java.util.*;
class split_tok
{
public static void main(String ar[])
{
int x;
String s="It is@#!what@#!it is";
StringTokenizer st=new StringTokenizer(s,"@#!",false);
while(st.hasMoreTokens())
System.out.print(st.nextToken()+" ");
}
}