import java.util.*;
class Arr
{Scanner sc=new Scanner(System.in);  
 int R,C,A[][];
Arr(int R, int C)
{this.R=R;
this.C=C; 
A=new int[R][C];}

void read()
{System.out.println("Enter the values of matrices");
for(int i=0;i<R;i++)
for(int k=0;k<C;k++)
A[i][k]=sc.nextInt(); }

void disp()
{for(int i=0;i<R;i++)
{
for(int k=0;k<C;k++)
System.out.print(A[i][k]+"  ");
System.out.println();}}

Arr add(Arr P)
{Arr B=new Arr(R,C);
for(int i=0;i<R;i++)
for(int k=0;k<C;k++)
B.A[i][k]=P.A[i][k]+A[i][k]; 
return B;
}
}
class matadd2
{
public static void main(String ag[])
{ Scanner sc= new Scanner(System.in);
System.out.println("enter the row and colums number");
int r=sc.nextInt();
int c=sc.nextInt();
Arr A1=new Arr(r,c);
Arr A2=new Arr(r,c);
A1.read();
A2.read();
Arr A3;
A3=A1.add(A2);
A3.disp();
}}