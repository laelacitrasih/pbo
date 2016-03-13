/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package pbo;
public class TugasAkhir {
    /*--- class TugasAkhir full atribut, encapsulate ---*/
    private Dosen[] pembimbing = new Dosen[2];
    private String judul;
    /*--- end of class TugasAkhir full atribut, encapsulate ---*/
    /*--- constractor TugasAkhir ---*/
    public TugasAkhir(String judul){
        //this.judul = judul;
        setJudul(judul);
    }
    /*--- end of constractor TugasAkhir ---*/
    /*--- setJudul ---*/
    public void setJudul(String judul){
        this.judul = judul;
    }
    /*--- end of setJudul ---*/
    /*--- getJudul ---*/
    public String getJudul(){
        return judul;
    } 
    /*--- end of getJudul ---*/
    /*--- set pembimbing by index ---*/
    public void setPembimbing(Dosen d,int i){
        this.pembimbing[i] = d;
    }
    /*--- end of set pembimbing by index ---*/
    /*--- get pembimbing by index ---*/
    public Dosen getPembimbing(int i){
        return pembimbing[i];
    }
    /*--- end of get pembimbing by index ---*/
    /*--- get pembimbing by kode dosen ---*/
    public Dosen getPembimbing(String kode){
        for(int i=0;i<2;i++){
            if (pembimbing[i].getKode().equals(kode)){
                return pembimbing[i];
            }
        }
        return null;
    }
    /*--- end of get pembimbing by kode dosen ---*/
}