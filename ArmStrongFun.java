import java.util.Scanner;
public class ArmStrongFun{

    public static int cubeSum(int no) 
    {
        int sum = 0;
        while (no > 0) {
            int rem = no % 10;
            sum = sum + (rem * rem * rem);
            no = no / 10;
        }
        return sum;
    }

    public static boolean isArmstrong(int no) {
        return no == cubeSum(no);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Armstrong or not: ");
        int no = sc.nextInt();

        System.out.println(isArmstrong(no));
        System.out.println("Armstrong numbers between 1 to 1000:");

        for (int i = 1; i <= 1000; i++)
         {
            if (isArmstrong(i))
                System.out.println(i);
        }
    }
}
