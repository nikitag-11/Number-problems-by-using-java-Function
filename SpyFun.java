import java.util.Scanner;

public class SpyFun{

    public static boolean isSpy(int no) 
    {
        int sum = 0, mul= 1;
        while (no > 0) {
            int rem = no % 10;
            sum = sum + rem;
            mul = mul * rem;
            no = no / 10;
        }
        return sum == mul;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Spy or not:");
        int no = sc.nextInt();

        System.out.println(isSpy(no));
        System.out.println("Spy numbers between 1 to 1000:");

        for (int i = 1; i <= 1000; i++) 
        {
            if (isSpy(i))
                System.out.println(i);
        }
    }
}
