package Pertemuan_2;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menerima input panjang dan lebar dari pengguna
        System.out.print("Panjang : ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar : ");
        double lebar = scanner.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan hasil perhitungan
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);

        // Menutup objek scanner
        scanner.close();
    }
}
