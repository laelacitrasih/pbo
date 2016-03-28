/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package pbo;
public abstract class Orang {
    /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    - Orang full attribute encapsulate
    /*
    
    */
    /*--- class orang full atribut, encapsulate ---*/
    private String nama;
    private String kk;
    /*--- end of class orang full atribut, encapsulate ---*/
    /*--- Constractor Orang ---*/
    
    /*------------------------- sprint 1 ------------------------- */
    public Orang(String nama, String kk) {
        this.nama = nama;
        this.kk = kk;
    }
    /*--- end of Constractor Orang ---*/
    /*--- getNama ---*/
    public String getNama() {
        return nama;
    }
    /*--- end of getNama ---*/
    /*--- setNama ---*/
    public void setNama(String nama) {
        this.nama = nama;
    }
    /*--- end of setNama ---*/
    /*--- getKK ---*/
    public String getKk() {
        return kk;
    }
    /*--- end of getKK ---*/
    /*--- SetKK ---*/
    public void setKk(String kk) {
        this.kk = kk;
    }
    /*--- end of setKK ---*/
    /*------------------------- end of sprint 1 ------------------------- */
    
    /*------------------------- sprint 2 ------------------------- */
    /*--- toString ---*/
    //public String toString(){
    //}
    /*--- end of toString ---*/
    /*------------------------- end of sprint 2 ------------------------- */
}
