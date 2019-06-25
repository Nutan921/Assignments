import java.util.Scanner;
class reverse {
    public static void main(String args[]){

        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        number=sc.nextInt();
        int r=0;
        int result=0;
        while(number!=0){
            r=number%10;
            result=result*10+r;
            number=number/10;
        }
        System.out.println("the reverse of the given number is "+ result);

    }
}


