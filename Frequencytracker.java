import java.util.*;
class Frequencytracker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        String[] arr = ss.split(" ");
        HashMap<String,Integer>hm = new HashMap<>();
        for(String st:arr)
        {
            hm.put(st,hm.getOrDefault(st, 0)+1);
        }
        for(Map.Entry<String,Integer>et:hm.entrySet())
        {
             System.out.println(et.getKey()+""+et.getValue());
        }
    }
}