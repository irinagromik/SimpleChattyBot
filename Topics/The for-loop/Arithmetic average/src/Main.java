import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        int count = 0;
        double sum = 0.0;
        for (int i = low; i <= high; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        double average = sum / count;
        System.out.println(average);
    }
}