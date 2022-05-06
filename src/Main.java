import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrie numarul de soldati :");
        int a = sc.nextInt();
        if (a < 1) {
            System.out.println("Pack");
        } else if (1 < a && a < 19) {
            System.out.println("Throng!");
        } else if (20 < a && a < 249) {
            System.out.println("Zounds");
        } else {
            System.out.println("Legion !!!!");
        }
    }
}