import java.util.*;
class arr
{
Scanner ob=new Scanner(System.in);
int r,c,a[][];
arr(int r,int c)
{
this.r=r;
this.c=c;
a=new int [r][c];
}
void read()
{
int x,y;
for(x=0;x<r;x++)
{
for(y=0;y<c;y++)
a[x][y]=ob.nextInt();
System.out.println();
}
}
void disp()
{
int x,y;
for(x=0;x<r;x++)
{
for(y=0;y<c;y++)
System.out.print(a[x][y]+" ");
System.out.println();
}
}
arr add(arr p)
{
arr n=new arr(r,c);
int x,y;
for(x=0;x<r;x++)
for(y=0;y<c;y++)
n.a[x][y]=a[x][y]+p.a[x][y];
return n;
}
}
class addition
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the row and coloums");
int r=ob.nextInt(),c=ob.nextInt();
arr x1=new arr(r,c);
arr x2=new arr(r,c);
System.out.println("Enter for 1");
x1.read();
System.out.println("Enter for 2");
x2.read();
arr x3;
x3=x1.add(x2);
System.out.println("Output:-");
x3.disp();
}
}