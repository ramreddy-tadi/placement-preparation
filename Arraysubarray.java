import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Arraysubarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int l = sc.nextInt();
            arr.add(l);
        }
        int k = sc.nextInt();
        int res = Arraysubarray.countsum(arr,n,k);
        if(res==0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(res);
        }


    } 
    public static int countsum(ArrayList<Integer> arr,int n,int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr.get(i);
            int bl = sum-k;
            if(hm.containsKey(bl))
            {
                count+=hm.get(bl);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}