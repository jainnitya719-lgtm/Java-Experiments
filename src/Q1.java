import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greater = a;

        if (b > greater)
            greater = b;

        if (c > greater)
            greater = c;

        System.out.println("Greater number = " + greater);
    }
}
