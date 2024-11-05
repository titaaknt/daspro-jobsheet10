import java.util.Scanner;

public class ModifikasiSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah siswa dan mata kuliah secara dinamis
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        // Membuat array dua dimensi berdasarkan input jumlah siswa dan mata kuliah
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];
        
        // Input nilai untuk setiap mahasiswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Menghitung rata-rata nilai setiap mahasiswa
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMataKuliah);
        }

        System.out.println("========================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        // Menghitung rata-rata nilai untuk setiap mata kuliah
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }

        sc.close(); // Menutup scanner setelah selesai digunakan
    }
}
