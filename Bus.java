import java.util.ArrayList;
import java.util.Iterator;

public class Bus {
    // Implementasi Koleksi Data (ArrayList)
    private ArrayList<Penumpang> penumpangBiasa;     // Maksimal 16
    private ArrayList<Penumpang> penumpangPrioritas; // Maksimal 4
    private ArrayList<Penumpang> penumpangBerdiri;   // Maksimal 20

    // Atribut static dan final
    private static final int ONGKOS_BUS = 2000;
    
    // Atribut totalPendapatan
    private int totalPendapatan;
    
    private static final int MAX_KAPASITAS = 40;
    private static final int MAX_KURSI_BIASA = 16;
    private static final int MAX_KURSI_PRIORITAS = 4;
    private static final int MAX_BERDIRI = 20;


    // Constructor
    public Bus() {
        this.penumpangBiasa = new ArrayList<>();
        this.penumpangPrioritas = new ArrayList<>();
        this.penumpangBerdiri = new ArrayList<>();
        this.totalPendapatan = 0;
    }

        // Getters
    public ArrayList<Penumpang> getPenumpangBiasa() {
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas() {
        return penumpangPrioritas;
    }

    public ArrayList<Penumpang> getPenumpangBerdiri() {
        return penumpangBerdiri;
    }

    public int getJumlahPenumpangBiasa() {
        return penumpangBiasa.size();
    }

    public int getJumlahPenumpangPrioritas() {
        return penumpangPrioritas.size();
    }

    public int getJumlahPenumpangBerdiri() {
        return penumpangBerdiri.size();
    }
    
    public int getTotalPenumpang() {
        return getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas() + getJumlahPenumpangBerdiri();
    }

        // Method inti: Naikkan Penumpang
    public boolean naikkanPenumpang(Penumpang penumpang) {
        if (getTotalPenumpang() >= MAX_KAPASITAS) {
            System.out.println("❌ GAGAL: Bus sudah penuh (Kapasitas Maksimal: " + MAX_KAPASITAS + ").");
            return false;
        }

        if (!penumpang.cekSaldoCukup()) {
            System.out.println("❌ GAGAL: Saldo " + penumpang.getNama() + " tidak mencukupi (Saldo: " + penumpang.getSaldo() + ").");
            return false;
        }
        
        boolean berhasilDuduk = false;

        if (penumpang.isPrioritas()) {
            // Aturan 2 & 4: Prioritas boleh di kursi prioritas atau biasa
            if (getJumlahPenumpangPrioritas() < MAX_KURSI_PRIORITAS) {
                penumpangPrioritas.add(penumpang);
                berhasilDuduk = true;
                System.out.println("✅ " + penumpang.getNama() + " (Prioritas) berhasil duduk di kursi PRIORITAS.");
            } else if (getJumlahPenumpangBiasa() < MAX_KURSI_BIASA) {
                penumpangBiasa.add(penumpang);
                berhasilDuduk = true;
                System.out.println("✅ " + penumpang.getNama() + " (Prioritas) berhasil duduk di kursi BIASA.");
            }
        } else {
            // Aturan 3: Penumpang Biasa dilarang di kursi prioritas
            if (getJumlahPenumpangBiasa() < MAX_KURSI_BIASA) {
                penumpangBiasa.add(penumpang);
                berhasilDuduk = true;
                System.out.println("✅ " + penumpang.getNama() + " (Biasa) berhasil duduk di kursi BIASA.");
            }
        }
        
        // Aturan 7: Jika kursi penuh, berdiri
        if (!berhasilDuduk) {
             if (getJumlahPenumpangBerdiri() < MAX_BERDIRI) {
                 penumpangBerdiri.add(penumpang);
                 System.out.println("✅ " + penumpang.getNama() + " berhasil naik dan BERDIRI.");
             } else {
                 return false;
             }
        }
        
        // Update Saldo dan Pendapatan
        penumpang.kurangiSaldo(ONGKOS_BUS);
        this.totalPendapatan += ONGKOS_BUS;
        
        return true;
    }
}
