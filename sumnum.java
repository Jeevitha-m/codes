import java.io.*;
import java.util.*;
class sumnum
{
    public static void main(String srgs[])
    {int count=0;
    
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {
        int c=n%10;
            count=count+c;
            n=n/10;
        }
        System.out.println(count);
    }
}
