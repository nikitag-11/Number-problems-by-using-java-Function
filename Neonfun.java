import java.util.Scanner;

public class Neonfun{

    public static int square(int no) 
    {
        return no * no;
    }

    public static boolean isNeon(int no) 
    {
        int sq = square(no);
        int sum = 0;
        while (sq > 0) {
            sum = sum + (sq % 10);
            sq = sq / 10;
        }
        return no == sum;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Neon or not: ");
        int no = sc.nextInt();

        System.out.println(isNeon(no));
        System.out.println("Neon numbers between 1 to 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isNeon(i))
                System.out.println(i);
        }
    }
}
