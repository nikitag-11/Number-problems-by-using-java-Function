import java.util.Scanner;

public class PalindromeFun{

    public static boolean isPalindrome(int no)
     {
        int rev = 0, temp = no;
        while (no > 0) {
            rev = rev * 10 + no % 10;
            no = no / 10;
        }
        return temp == rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Palindrome or not: ");
        int no = sc.nextInt();

        System.out.println(isPalindrome(no));
        System.out.println("Palindrome numbers between 1 to 1000:");

        for (int i = 1; i <= 1000; i++)
         {
            if (isPalindrome(i))
                System.out.println(i);
        }
    }
}
