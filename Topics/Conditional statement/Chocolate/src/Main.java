import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();
        int numberM = scanner.nextInt();
        int numberK = scanner.nextInt();
        String ifYes = "NO";
        for (int i = 1; i < numberM; i++) {
            if (numberN * i == numberK) {
                ifYes = "YES";
            }
            if (numberN * i > numberK) {
                break;
            }
        }

        for (int i = 1; i < numberN; i++) {
            if (numberM * i == numberK) {
                ifYes = "YES";
            }
            if (numberM * i > numberK) {
                break;
            }
        }

        System.out.println(ifYes);
    }
}
