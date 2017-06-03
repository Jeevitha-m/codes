import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a>3)
{
int b=a.reverse(a);
if(a==b)
{system.out.println("palindrome");
}}
else
{
System.out.println("not a palindrome");
}}}
