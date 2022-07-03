import java.io.PrintStream;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int four = scanner.nextInt();
        int a = four / 1000;
        int b = four / 100 % 10;
        int c = four / 10 % 10;
        int d = four % 10;

        if (a == d && b == c && four > 1000 && four < 10000) {
            System.out.println("1");
        } else {
            System.out.println(four);
        }
    }
}