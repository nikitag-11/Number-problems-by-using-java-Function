import java.util.Scanner;
public class StrongFun {
    
    public static int factDigitSum(int no) {
        int sum = 0;
        while (no > 0) {
            int rem = no % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++)
                fact =fact*i;
            sum =sum+fact;
            no /= 10;
        }
        return sum;
    }

    public static boolean isStrong(int no) {
        return no == factDigitSum(no);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();
        System.out.println(isStrong(no));

        
        System.out.println("Strong numbers between 1 to 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isStrong(i))
                System.out.println(i);
        }
    }
}
