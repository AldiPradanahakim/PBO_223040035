package Pertemuan_2;
import java.util.Scanner;

public class PersegiPanjang2 {
    // Atribut kelas
    private double panjang;
    private double lebar;

    // Fungsi kelas untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Fungsi kelas untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Fungsi kelas untuk menampilkan nilai atribut dan hasil perhitungan
    public void tampil() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }

    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat objek PersegiPanjang2
        PersegiPanjang2 persegiPanjang = new PersegiPanjang2();

        // Menerima input panjang dan lebar dari pengguna
        System.out.print("Panjang : ");
        persegiPanjang.panjang = scanner.nextDouble();

        System.out.print("Lebar : ");
        persegiPanjang.lebar = scanner.nextDouble();

        // Menampilkan nilai atribut dan hasil perhitungan
        persegiPanjang.tampil();

        // Menutup objek scanner
        scanner.close();
    }
}
