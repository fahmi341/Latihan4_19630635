package Penilaian;

public class NilaiAkhir extends Mahasiswa {    
    private int uts;
    private int uas;
    private int tugas;

    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        super(nama,npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    
    public double hitungNilaiAkhir(){
        return (0.30 * uts) + (0.30 * uas) + (0.40 * tugas);
        
    } 
    
public class Main {
        public void main(String[] args) {        
        NilaiAkhir fahmi = new NilaiAkhir("Fahmi Rezki Mulyawan", "19630635", 90,90,90);
        
        System.out.println("Nama : " + fahmi.getNama());
        System.out.println("NPM : "+ fahmi.getNpm());
        System.out.println("Nilai Akhir : " + fahmi.hitungNilaiAkhir());
             
    }
}