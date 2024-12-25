import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int left = 0, right = m - 1, top = 0, button = n - 1;
        int k = 1;
        while (left <= right && top <= button) {
            for (int i = left; i <= right; ++i) {
                matrix[top][i] = k;
                //System.out.printf("%d,%d\n",top,i);
                k++;
            }
            for (int i = top + 1; i <= button; ++i) {
                matrix[i][right] = k;
                //System.out.printf("%d,%d\n",top,i);
                ++k;
            }

            for (int i = right - 1; i >= left && top < button; --i) {
                matrix[button][i] = k;
                ++k;
            }
            for (int i = button - 1; i > top && left < right; --i) {
                matrix[i][left] = k;
                ++k;
            }
            left++;
            right--;
            top++;
            button--;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
