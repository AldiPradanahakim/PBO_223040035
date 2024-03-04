package Pertemuan_2;

import java.util.Scanner;

public class HitungTotalBilangan {
    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen (N)
        System.out.print("Input N (jumlah elemen): ");
        int N = scanner.nextInt();

        // Pemeriksaan apakah N tidak boleh nol atau minus
        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
            // Menetapkan total ke 0
            System.out.println("Total = 0");
        } else {
            // Inisialisasi total
            int total = 0;

            // Input bilangan sebanyak N elemen
            System.out.println("Input bilangan sebanyak " + N + " elemen:");
            for (int i = 0; i < N; i++) {
                System.out.print("Bilangan ke-" + (i + 1) + ": ");
                int bilangan = scanner.nextInt();

                // Menambahkan bilangan ke total
                total += bilangan;
            }

            // Menampilkan total
            System.out.println("Total = " + total);
        }

        // Menutup objek scanner
        scanner.close();
    }
}
