import java.util.*;

public class One{
    public static void main(String[] args) {
        System.out.println("gautam in java");
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int[] b=new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        int[] c=doSum(a,b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }   
    public static int[] doSum(int[] a,int[] b){
        int[] c=new int[5];
       for (int i = 0; i < c.length; i++) {
           c[i]=a[i]+b[i];
       }
       return c;
    }
    
   }