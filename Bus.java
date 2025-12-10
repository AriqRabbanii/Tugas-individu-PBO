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
}
