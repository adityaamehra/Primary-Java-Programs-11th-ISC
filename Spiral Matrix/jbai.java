import java.util.*;
class jb
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the rows and columns");
int r=ob.nextInt(),c=ob.nextInt(),in=1,tr=0,tc=-1,x,y,em=0;
int a[][]=new int[r][c];
//WORKING(x=rows,y=columns)
while(true)
{
for(x=0;x<a.length;x++)
for(y=0;y<a[0].length;y++)
if(a[x][y]==0)
em++;
if(em==0)
break;
em=0;
try{
while(true)
{
tc++;
if(a[tr][tc]==0)
{
a[tr][tc]=in;
in+=1;
}
else
break;
}
}catch(ArrayIndexOutOfBoundsException p)
{}
tc--;
try{
while(true)
{
tr++;
if(a[tr][tc]==0)
{
a[tr][tc]=in;
in+=1;
}
else
break;
}
}catch(ArrayIndexOutOfBoundsException p)
{}
tr--;
try{
while(true)
{
tc--;
if(a[tr][tc]==0)
{
a[tr][tc]=in;
in+=1;
}
else
break;
}
}catch(ArrayIndexOutOfBoundsException p)
{}
tc++;
try{
while(true)
{
tr--;
if(a[tr][tc]==0)
{
a[tr][tc]=in;
in+=1;
}
else
break;
}
}catch(ArrayIndexOutOfBoundsException p)
{}
tr++;
}
//PRINTING
for(x=0;x<a.length;x++)
{
for(y=0;y<a[0].length;y++)
System.out.print(a[x][y]+" ");
System.out.println();
}
}
}