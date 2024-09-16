import java.util.*;
class paspyr
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number of rows");
int r=ob.nextInt(),x,a[][]=new int[r][],y;
for(x=0;x<r;x++)
{
a[x]=new int[x+1];
a[x][0]=1;
a[x][x]=1;
}
for(x=2;x<r;x++)
for(y=1;y<a[x].length-1;y++)
a[x][y]=a[x-1][y-1]+a[x-1][y];
for(x=0;x<r;x++)
{
for(int z=x;z<r;z++)
System.out.print(" ");
for(y=0;y<a[x].length;y++)
System.out.print(a[x][y]+" ");
System.out.println();
}
}
}