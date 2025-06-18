import java.util.*;
public class NumberChecker {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=countdigites(n);
        int[] arr=new int[size];
        store(n,arr);
        System.err.println("Duck :"+duck(arr));
        System.err.println("Armstrong"+asrmstrong(arr,n));


    }

    public static int countdigites(int n)
    {
        int count=0;
        while(n!=0)
        {
            int a=n%10;
            count++;
            n/=10;
        }
        return count;
    }

    public static void store(int n,int[] arr)
    {
        int i=0;
        while(n!=0)
        {
            int a=n%10;
            arr[i++]=a;
            n/=10;
        }
    }

    public static boolean duck(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
                return false;
        }
        return true;
    }

    public static boolean asrmstrong(int[] arr,int n)
    {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+(Math.pow(arr[i],2));
        }
        if(sum==n){
            return true;
        }
            else { 
                return false;
        }
    }
}
