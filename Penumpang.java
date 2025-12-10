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
}
