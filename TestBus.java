import java.util.Scanner;

public class TestBus {
      
    private static Bus transKoetaradja = new Bus();
    private static Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;

    public static void main(String[] args) {
        // Data Awal Simulasi
        System.out.println("--- Inisialisasi Bus dan Penumpang ---");
        transKoetaradja.naikkanPenumpang(new Penumpang(idCounter++, "Otong", 18, false)); 
        transKoetaradja.naikkanPenumpang(new Penumpang(idCounter++, "Atok Dalang", 68, false)); 
        transKoetaradja.naikkanPenumpang(new Penumpang(idCounter++, "Ucup", 19, false)); 
        transKoetaradja.naikkanPenumpang(new Penumpang(idCounter++, "Memet", 25, true)); 
        System.out.println("--------------------------------------\n");
                int pilihan;
        do {
            tampilkanMenu();
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (pilihan) {
                    case 1:
                        naikkanPenumpangBaru();
                        break;
                    case 2:
                        turunkanPenumpang();
                        break;
                    case 3:
                        lihatPenumpang();
                        break;
                    case 0:
                        System.out.println("Terima kasih. Simulasi diakhiri.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input harus berupa angka menu.");
                scanner.nextLine();
                pilihan = -1;
            }
        } while (pilihan != 0);
        
        scanner.close();
    }

     private static void tampilkanMenu() {
        System.out.println("\n===== BUS TRANS KOETARADJA =====");
        System.out.println("MENU:");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang & Pendapatan");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }
}
