import java.io.*;
import java.util.*;
class target
{
public static void main(String args[]);
{int i,j;
Scanner s=new Scanner(System.in);
int ch[]=new int[args.length];
int t=s.nextInt();
for(i=0;i<args.length;i++)
{
ch[i]=Integer.parseInt(args[i]);
}
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
}}}}}
