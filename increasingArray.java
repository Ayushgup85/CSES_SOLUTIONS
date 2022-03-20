import java.util.*;
class increasingArray{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] ar=new long[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        long count=0;
        for(int i=1;i<n;i++)
        {
            if(ar[i]<ar[i-1])
            {
                count+=ar[i-1]-ar[i];
                ar[i]=ar[i-1];
            }
        }
        System.out.println(count);
    }
}
