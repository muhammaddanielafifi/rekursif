import java.util.Scanner;

public class TUGAS {

    static int totalRekursif(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + totalRekursif(arr, n - 1);
    }

    static int totalIteratif(int[] arr, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] data = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            data[i - 1] = sc.nextInt();
        }

        int hasilRekursif = totalRekursif(data, N);
        int hasilIteratif = totalIteratif(data, N);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + hasilRekursif);


        sc.close();
    }
}
