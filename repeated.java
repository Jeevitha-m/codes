import java.io.*;
import java.util.*;
class repeated
{
public static void main(String args[])
{
int i,j,count=0;
int x[]=new int[args.length];
for(i=0;i<args.length;i++)
{
x[i]=Integer.parseInt(args[i]);
}
for(i=0;i<x.length;i++)
{
for(j=0;j<x.length;j++)
{
if(x[i]==x[j]
{
System.out.println(x[i]);
count++;
}}}
if(count==0)
{
System.out.println("no repeated values");
}}}
