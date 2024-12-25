import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year = 0, month = 0, day = 0;
        year = n / 365;
        n = n % 365;
        month = n / 30;
        n = n % 30;
        day = n;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", year, month, day);

    }
}
