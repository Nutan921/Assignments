import java.util.Scanner;
public class Math {
        public static int Hcf(int a,int b)
        {
            if(a==0){
                return a;
            }
            if(b==0){
                return b;
            }
            if(a==b){
                return a;
            }
            if(a>b){
                return Hcf(a-b,b);
            }
            return Hcf(a,b-a);
        }
        public static int Lcm(int a,int b)
        {
            return (a*b)/Hcf(a,b);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a,b;
            System.out.println("Enter the numbers:");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("HCF of:"+a+"and"+b+"is:"+Hcf(a,b));
            System.out.println("LCM of:"+a+"and"+b+"is:"+Lcm(a,b));
        }
    }
