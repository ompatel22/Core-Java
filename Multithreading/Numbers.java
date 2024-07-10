import java.util.*;
class Numbers extends Thread
{
    static Object lock= new Object();
    static int arr[];
    String name;
    Numbers(String name)
    {
        this.name=name;
    }
    public void run()
    {
        synchronized(lock)
        {
            switch(this.name)
            {
                case "negative":
                System.out.print(this.name+" : ");
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]<0)
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                break;

                case "positive_odd":
                System.out.print(this.name+" : ");
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]>0 && arr[i]%2!=0)
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                break;

                case "positive_even":
                System.out.print(this.name+" : ");
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]>0 && arr[i]%2==0)
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no. of ele");
        int n=sc.nextInt();
        System.out.println("Enter ele");
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Numbers t1=new Numbers("positive_odd");
        Numbers t2=new Numbers("positive_even");
        Numbers t3=new Numbers("negative");
        t1.start();
        t2.start();
        t3.start();
    }
}