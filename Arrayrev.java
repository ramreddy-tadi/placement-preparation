import java.util.*;
class Arrayrev
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println(Arrays.toString(arr));
      for(int i=0;i<(n/2);i++)
      {
         arr[i]+=arr[(n-1)-i];
         arr[(n-1)-i]=arr[i]-arr[(n-1)-i];
         arr[i]-=arr[(n-1)-i];
      }
      System.out.println(Arrays.toString(arr));
   }
}