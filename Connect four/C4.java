import java.util.*;
class C4
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the dimensions of the play area");
int r=ob.nextInt(),c=ob.nextInt(),fa[]=new int[c],x,pc=0,s,lic1=0,lic2=0,lir1=0,lir2=0,tr=0,tc=0,wc=0,temp=1;
char pa[][]=new char[r][c],fc='\u0000',sc='\u0000';
boolean b=true;
for(x=0;x<1;x++)
{
System.out.println("Who plays first\n1.Red\n2.Yellow");
s=ob.nextInt();
switch(s)
{
case 1:
fc='R';
sc='Y';
break;
case 2:
fc='Y';
sc='R';
break;
default:
System.out.println("Re-enter");
x--;
}
}
s=0;
while(true)
{
if(b)
{
while(true)
{
System.out.println("Player 1 enter the column");
pc=ob.nextInt()-1;
try{
pa[(r-1)-fa[pc]][pc]=fc;
lir1=(r-1)-fa[pc];
lic1=pc;
fa[pc]++;
b=false;
break;
}catch(Exception p)
{
System.out.println("Enter exceptable value");
}
}
}
else
{
while(true)
{
System.out.println("Player 2 enter the column");
pc=ob.nextInt()-1;
try{
pa[(r-1)-fa[pc]][pc]=sc;
lir2=(r-1)-fa[pc];
lic2=pc;
fa[pc]++;
b=true;
break;
}catch(Exception p)
{
System.out.println("Enter exceptable value");
}
}
}
for(s=0;s<r;s++)
{
for(x=0;x<c;x++)
if(pa[s][x]!='\u0000')
System.out.print("|"+pa[s][x]+"|");
else
System.out.print("|_|");
System.out.println();
}//all correct till here
//CHECKING
tr=lir1;tc=lic1;
try{
while(pa[tr][tc]==fc)
{
wc++;
tc++;
}}catch(Exception p){}
tr=lir1;tc=lic1;
try{
while(pa[tr][tc]==fc)
{
wc++;
tc--;
}}catch(Exception p){}
if(wc>=5)
{
System.out.println(fc+" won");
System.exit(0);
}
wc=0;
tr=lir1;tc=lic1;
try{
while(pa[tr][tc]==fc)
{
wc++;
tr--;
tc++;
}}catch(Exception p){}
tr=lir1;tc=lic1;
try{
while(pa[tr][tc]==fc)
{
wc++;
tr++;
tc--;
}}catch(Exception p){}
if(wc>=5)
{
System.out.println(fc+" won");
System.exit(0);
}
wc=0;
tr=lir1;tc=lic1;
try{
while(pa[tr][tc]==fc)
{
wc++;
tr++;
tc++;
}}catch(Exception p){}
tr=lir1;tc=lic1;
try{
while(pa[tr][tc]==fc)
{
wc++;
tr--;
tc--;
}}catch(Exception p){}
if(wc>=5)
{
System.out.println(fc+" won");
System.exit(0);
}
wc=0;
tr=lir1;tc=lic1;
try{
while(pa[tr][tc]==fc)
{
wc++;
tr++;
}}catch(Exception p){}
if(wc>=4)
{
System.out.println(fc+" won");
System.exit(0);
}
wc=0;


//CHECKING 2


tr=lir2;tc=lic2;
try{
while(pa[tr][tc]==sc)
{
wc++;
tc++;
}}catch(Exception p){}
tr=lir2;tc=lic2;
try{
while(pa[tr][tc]==sc)
{
wc++;
tc--;
}}catch(Exception p){}
if(wc>=5)
{
System.out.println(sc+" won");
System.exit(0);
}
wc=0;
tr=lir2;tc=lic2;
try{
while(pa[tr][tc]==sc)
{
wc++;
tr--;
tc++;
}}catch(Exception p){}
tr=lir2;tc=lic2;
try{
while(pa[tr][tc]==sc)
{
wc++;
tr++;
tc--;
}}catch(Exception p){}
if(wc>=5)
{
System.out.println(sc+" won");
System.exit(0);
}
wc=0;
tr=lir2;tc=lic2;
try{
while(pa[tr][tc]==sc)
{
wc++;
tr--;
tc--;
}}catch(Exception p){}
tr=lir2;tc=lic2;
try{
while(pa[tr][tc]==sc)
{
wc++;
tr++;
tc++;
}}catch(Exception p){}
if(wc>=5)
{
System.out.println(sc+" won");
System.exit(0);
}
wc=0;
tr=lir2;tc=lic2;
try{
while(pa[tr][tc]==sc)
{
wc++;
tr++;
}}catch(Exception p){}
if(wc>=4)
{
System.out.println(sc+" won");
System.exit(0);
}
wc=0;
for(x=0;x<r;x++)
for(s=0;s<c;s++)
if(pa[x][s]=='\u0000')
temp++;
if(temp==0)
{
System.out.println("No one wins");
System.exit(0);
}
temp=0;
}//main while loop
}//these two are neccessary
}
