import java.util.Scanner;

public class ModifPercobaan2no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        
        
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
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();  

                   
                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    } else {
                        System.out.println("Input baris atau kolom tidak valid.");
                    }
                    break;

                case 2:
                    
                    System.out.println("\nDaftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                            }
                        }
                    }
                    break;

                case 3:
             
                    System.out.println("Terima kasih, program selesai.");
                    sc.close();
                    return; 

                default:
                   
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}