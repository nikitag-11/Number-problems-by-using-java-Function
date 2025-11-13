import java.util.Scanner;
public class AutoMorphicFun {

    public static int square(int no) {
        return no * no;
    }

    public static boolean isAutomorphic(int no, int sq) {
        while (no > 0) {
            if (no % 10 != sq % 10)
                return false;
            no = no / 10;
            sq = sq / 10;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Automorphic or not: ");
        int no = sc.nextInt();

        System.out.println(isAutomorphic(no, square(no)));
        
        System.out.println("Automorphic num betwwwn 1 to 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isAutomorphic(i, square(i)))
                System.out.println(i);
        }
    }
}
