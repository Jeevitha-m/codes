import java.io.*
import java.util.*;
class index
{
public static void main(String args[])
{
int i,j,count=0;
int x[]=new int[args.length];
for(i=0;i<args.length;i++)
{
x[i]=Integer.parseInt(args[i]);
}
Arrays.sort(x);
for(j=0;j<x.length;j++)
{
if(j==x[j])
{
System.out.println("the number"+" "+x[j]+" "+equals to its index"+" "+j);
count++;
}}
if(count==0)
{
System.out.println("no index matches");
}}}
