import java.util.Scanner;
class amstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check whether it is amstrong");
        int number;
        number=sc.nextInt();
        int result = 0,r=0;
        int k;
        k=number;
        while(number!=0){
            r=number%10;
            result=result+r*r*r;
            number=number/10;
        }
        if(result == k){
            System.out.println("the number is amstrong");
        }
        else{
            System.out.println("the number is not amstrong");
        }


    }
}
