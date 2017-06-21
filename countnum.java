import java.io.*;
import java.util.*;
class countnum
{
    public static void main(String srgs[])
    {int count=0;
    
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {
        n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
