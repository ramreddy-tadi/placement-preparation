import java.util.*;
class Firstnonrepeat
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
            HashMap<Character,Integer>hm=new HashMap<>();
            for(char ch:s1.toCharArray())
            {
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            char[] ch2 = s1.toCharArray();
            for(int i=0;i<ch2.length;i++)
            {
                if(hm.get(ch2[i])==1)
                {
                    System.out.println(ch2[i]);
                    break;
                }
            }
        }
    }
}