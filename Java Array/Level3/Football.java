//package Day3_Programming_Elements.3level3;
import java.util.*;
public class Football {
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] team=new int[11];
        System.out.println("Enter the height of players");
        for(int i=0;i<11;i++)
            team[i]=sc.nextInt();

        System.out.println("Avg ="+avg(team));
        System.out.println("Shortes Height="+shortest(team));
        System.out.println("Largest Height = "+largest(team));

    }

    public static int avg(int[] arr)
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        
        return sum/n;
    }

    public static int shortest(int [] arr)
    {
        int s=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            s=Math.min(s,arr[i]);
        }
        return s;
    }

    public static int largest(int[] arr)
    {
        int large=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            large=Math.max(large,arr[i]);
        }
        return large;
    }
}
