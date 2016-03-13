/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package pbo;
public abstract class Orang {
    /*--- class orang full atribut, encapsulate ---*/
    private String nama;
    private String kk;
    /*--- end of class orang full atribut, encapsulate ---*/
    public Orang(String nama, String kk) {
        this.nama = nama;
        this.kk = kk;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }
}
