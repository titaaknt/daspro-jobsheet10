import java.util.Scanner;

public class Modif2no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;

        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            int pilihan = sc.nextInt();
            sc.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama penonton: ");
                    nama = sc.nextLine();
                    
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        if (baris >= 1 && baris <= 4) {
                            break; 
                        } else {
                            System.out.println("Baris tidak tersedia Harap masukkan angka antara 1 dan 4.");
                        }
                    }
                    while (true) {
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        if (kolom >= 1 && kolom <= 2) {
                            break; 
                        } else {
                            System.out.println("Kolom tidak tersedia Harap masukkan angka antara 1 dan 2.");
                        }
                    }
                    sc.nextLine();  

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi di baris " + baris + " kolom " + kolom + " sudah terisi!");
                    } else {
                        
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar penonton:");
                    boolean adaPenonton = false;
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                                adaPenonton = true;
                            }
                        }
                    }
                    if (!adaPenonton) {
                        System.out.println("Tidak ada penonton yang terdaftar.");
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    sc.close();
                    return;

                default:
                   
                    System.out.println("Pilihan tidak tersedia. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}