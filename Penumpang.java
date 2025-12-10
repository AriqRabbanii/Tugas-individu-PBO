public class Penumpang {
    private int id;
    private int umur;
    private boolean hamil;
    private int saldo;
    private String nama; 
    
    private static final int ONGKOS_BUS = 2000;

    public Penumpang(int id, String nama, int umur, boolean hamil) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
        this.saldo = 10000; 
    }

    public int getID() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public boolean isHamil() {
        return hamil;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void tambahSaldo(int saldobaru) {
        this.saldo += saldobaru;
        System.out.println("Saldo " + nama + " berhasil ditambahkan. Saldo baru: " + this.saldo);
    }
    
    public void kurangiSaldo(int ongkos) {
        this.saldo -= ongkos;
    }
    
    public boolean isPrioritas() {
        boolean isLansia = this.umur > 60;
        boolean isAnak = this.umur < 10;
        boolean isIbuHamil = this.hamil;
        
        return isLansia || isAnak || isIbuHamil;
    }

    public boolean cekSaldoCukup() {
        return this.saldo >= ONGKOS_BUS;
    }
    
    @Override
    public String toString() {
        return nama + " (Umur: " + umur + ", Prioritas: " + isPrioritas() + ", Saldo: " + saldo + ")";
    }
}
