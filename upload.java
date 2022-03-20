import java.util.*;
class upload{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=4)
        System.out.println("NO SOLUTION");
        else
        {
           int i=n;
           while(i>0)
           {
               System.out.print(i+" ");
               i=i-2;
           }
             i=n-1;
           while(i>0)
           {
               System.out.print(i+" ");
               i=i-2;
           }
        }
        
    }
}