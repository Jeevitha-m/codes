import java.io.*;
import java.util.*;
class target
{
public static void main(String args[])
{int i,j,sum=0;
Scanner s=new Scanner(System.in);
int ch[]=new int[args.length];

for(i=0;i<args.length;i++)
{
ch[i]=Integer.parseInt(args[i]);
}
 int t=s.nextInt();
for(j=0;j<ch.length;j++)
{
for(i=j+1;i<ch.length;i++)
{
sum=ch[j]+ch[i];
if(sum==t)
{
System.out.println(ch[j]+" "+ch[i]);
}else
{
sum=0;
}}}
if(sum==0)
System.out.println("no valuecmatches");
}}
