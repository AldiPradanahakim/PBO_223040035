package Pertemuan_2;

import java.util.Scanner;

public class IndeksNilaiMatkul {
    // Fungsi untuk menentukan indeks nilai berdasarkan hasil akhir
    public static String hitungIndeksNilai(double hasilAkhir) {
        if (hasilAkhir >= 81 && hasilAkhir <= 100) {
            return "A";
        } else if (hasilAkhir >= 76 && hasilAkhir <= 80) {
            return "AB";
        } else if (hasilAkhir >= 56 && hasilAkhir <= 75) {
            return "B";
        } else if (hasilAkhir >= 51 && hasilAkhir <= 55) {
            return "BC";
        } else if (hasilAkhir >= 41 && hasilAkhir <= 50) {
            return "C";
        } else if (hasilAkhir >= 21 && hasilAkhir <= 40) {
            return "D";
        } else if (hasilAkhir >= 0 && hasilAkhir <= 20) {
            return "E";
        } else {
            return "Nilai di luar jangkauan";
        }
    }

    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input nilai matakuliah dari pengguna
        System.out.print("Input nilai matakuliah: ");
        String inputNilai = scanner.nextLine().trim();

        if (!inputNilai.isEmpty()) {
            // Menggunakan try-catch untuk menangani input yang bukan angka
            try {
                double hasilAkhir = Double.parseDouble(inputNilai);

                // Memanggil fungsi hitungIndeksNilai untuk menentukan indeks nilai
                String indeksNilai = hitungIndeksNilai(hasilAkhir);

                // Menampilkan hasil
                System.out.println("Output: " + indeksNilai);
            } catch (NumberFormatException e) {
                System.out.println("Output: nilai harus berupa angka");
            }
        } else {
            System.out.println("Output: nilai harus diisi");
        }

        // Menutup objek scanner
        scanner.close();
    }
}
