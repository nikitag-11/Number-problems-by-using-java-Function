import java.util.Scanner;

public class HarshadFun{

    public static boolean isHarshad(int no) 
    {
        int temp = no, sum = 0;
        while (no > 0) 
        {
            sum = sum + (no % 10);
            no = no / 10;
        }
        return temp % sum == 0;
    }

    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Harshad or not: ");
        int no = sc.nextInt();

        System.out.println(isHarshad(no));
        System.out.println("Harshad number between 1 to 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isHarshad(i))
                System.out.println(i);
        }
    }
}
