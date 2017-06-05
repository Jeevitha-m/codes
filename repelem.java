import java.io.*;
import java.util.*;
class repelem
{
public static void main(String args[])
[
int i,j,count=0;
int x[]=new int[args.length];
for(i=0;i<args.length;i++)
{
x[i]==Integer.parseInt(args[i]);
}
for(j=0;j<x.length;j++)
{
count=0;
for(i=j+1;i<x.length;i++)
{
if(count==0)
{
if(x[j]==x[i])
{
count=1;}}
}
if(count==0)
{
System.out.println(x[j]);
break;
}}}}
