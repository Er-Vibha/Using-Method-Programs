import java.util.Scanner;
public class EvenOdd {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        findEvenOdd(num);
    }

    public static void findEvenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}


