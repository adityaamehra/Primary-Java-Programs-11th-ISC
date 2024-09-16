import java.util.*;
class pastri
{public static void main(String ag[])
{Scanner sc=new Scanner(System.in);
int i,l,p;
System.out.println("enter the number of rows");
i=sc.nextInt();
int k[][]=new int[i][];
for(l=0;l<i;l++)
{k[l]=new int[l+1];
k[l][0]=1;
k[l][l]=1;}
for(l=2;l<i;l++)
{for(p=1;p<l;p++)
k[l][p]=(k[l-1][p])+(k[l-1][p-1]);}

for(l=0;l<i;l++)
{ for(p=0;p<=l;p++)
  System.out.print(k[l][p]+" ");
System.out.println();
}
}}