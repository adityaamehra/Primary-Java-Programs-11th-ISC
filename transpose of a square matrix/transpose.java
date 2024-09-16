import java.util.*;
class transpose
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the number of rows and columns");
int r=ob.nextInt(),c=ob.nextInt(),m,k,n=0,l=0;int a[][]=new int[r][c];
for(m=0;m<r;m++)
for(k=0;k<c;k++)
a[m][k]=ob.nextInt();
for(m=0;m<r;m++)
{
for(k=0;k<c;k++)
System.out.print(a[m][k]+"  ");
System.out.println();
}
System.out.println();
for(m=0;m<r;m++)
{
for(k=l;k<c;k++)
{
n=a[m][k];
a[m][k]=a[k][m];
a[k][m]=n;
}
l++;
}
for(m=0;m<r;m++)
{
for(k=0;k<c;k++)
System.out.print(a[m][k]+"  ");
System.out.println();
}
}
}




