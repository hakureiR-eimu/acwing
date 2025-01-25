//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(in);
//
//        int n = Integer.parseInt(br.readLine());
//        int[] A = new int[n];
//        String[] res = br.readLine().split(" ");
//        for (int i = 0; i < n; ++i) {
//            A[i] = Integer.parseInt(res[i]);
//        }
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////
////
////        for (int i = 0; i < n; ++i) {
////            A[i] = sc.nextInt();
////        }
////        sc.close();
//        quickSort(A, 0, A.length - 1);
//        for (int i = 0; i < A.length; ++i) {
//            System.out.printf("%d ", A[i]);
//        }
//
//    }
//
//    private static void quickSort(int[] arr, int l, int r) {
//        if (l >= r) return;
//        int num = arr[l + r >> 1];
//        int i = l - 1, j = r + 1;
//        while (i < j) {
//            while (arr[++i] < num) ;
//            while (arr[--j] > num) ;
//            if (i < j) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        quickSort(arr, l, j);
//        quickSort(arr, j + 1, r);
//        return;
//    }
//}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        //sc.nextLine();
        for (int i = 0; i < n; ++i) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(Integer.toString(input[i]) + " ");
        }
        String ans = sb.toString();
        ans = ans.trim();
        System.out.printf("%s", ans);

//        for (int i = 0; i < n; ++i) {
//            System.out.printf("%d ", input[i]);
//        }
    }
}
