import java.util.Scanner;
class sorting {
    public static void main(String args[]){
        int array[]=new int[8];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements into array");
        for(int i=0;i<8;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the elements after sorting are");
        for(int j=0;j<8;j++){
            for(int k=0;k<8;k++){
                if(array[j]<array[k]){
                    int temp;
                    temp=array[j];
                    array[j]=array[k];
                    array[k]=temp;

                }
            }
        }
        for(int l=0;l<8;l++){
            System.out.println(array[l]);
        }
    }
}
