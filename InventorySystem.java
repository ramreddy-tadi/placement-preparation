import java.util.*;
class Product{
    String pname;
    int pprice;
    int pcode;
    Product(String pname,int pprice,int pcode)
    {
        this.pname=pname;
        this.pprice=pprice;
        this.pcode=pcode;
    }
    @Override
    public String toString()
    {
       return pname+" "+pprice+" "+pcode;
    }
}
public class InventorySystem
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,ArrayList<Product>> hm = new HashMap<>();
        System.out.println("enter no.of categories");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter categories name");
            String cate = sc.next();
            ArrayList<Product>ar = new ArrayList<>();
            System.out.println("enter no.of products in this category");
            int s = sc.nextInt();
            for(int j=0;j<s;j++)
            {
                String na = sc.next();
                int pri = sc.nextInt();
                int pco = sc.nextInt();
                ar.add(new Product(na,pri,pco));
            }
            hm.put(cate,ar);


        }
        System.out.println(hm);
        System.out.println("1st query");
        System.out.println("Enter category");
        String ca1 = sc.next();
        System.out.println(hm.get(ca1).toString());
        System.out.println(hm.get(ca1).size());
        ArrayList<Product> ar1 = hm.get(ca1);
        Product highest = ar1.get(0);
        for(Product p : ar1)
        {
            if(p.pprice>highest.pprice)
            {
                highest=p;        
            }
        }                       
        System.out.println(highest.pname);
        System.out.println("2nd query");
        for(Map.Entry<String,ArrayList<Product>>et:hm.entrySet())
        {
            String cate = et.getKey();
            ArrayList<Product> pr = et.getValue();
            pr.sort((p1,p2)->p2.pprice-p1.pprice);
            System.out.println(cate+" "+pr);
        }
        System.out.println("3rd query");
        String highcate="";
        Product highestpri =null;
        for(Map.Entry<String,ArrayList<Product>>et:hm.entrySet())
        {
            ArrayList<Product> at = et.getValue();
            for(Product p :at)
            {
               if(highestpri==null||p.pprice>highestpri.pprice)
               {
                 highestpri=p;
                 highcate=et.getKey();
               }
            }
        }
        System.out.println(highcate+" "+highestpri);

    }
}