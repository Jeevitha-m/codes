import java.io.*
import java.util.*
class cuboid
{
Public static void main(String args[]);
{
int l=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int h=Integer.parseInt(args[2]);
int t,v;
t=2*((l+b)+(l*h)+(b*h));
v=l*b*h;
System.out.println(t+" "+v);
}}
