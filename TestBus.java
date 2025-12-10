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
        transKoetaradja.naikkanPenumpang(new Penumpang(idCounter++, "
    }
}
