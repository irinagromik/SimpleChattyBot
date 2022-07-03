import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();
        int six = scanner.nextInt();

        System.out.println((four * 60 + five)* 60 + six-(one * 60 + two) * 60 - three);
    }
}