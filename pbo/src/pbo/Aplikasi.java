/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package pbo;
public class Aplikasi {
    /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    - Menampung array/list objek yang dibutuhkan
    - Buat method add/create untuk setiap array/list
    - Buat method search untuk setiap array/list
    - Buat method delete untuk setiap array/list
    - Buat method untuk setiap menu (1 menu = 1 method)
    */
    
    /*--- class Aplikasi full atribut, encapsulate ---*/
    private Dosen[] daftarDosen = new Dosen[10];
    private int nDosen;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
    private int nMahasiswa;
    /*--- end of class Aplikasi full atribut, encapsulate ---*/
    
    /*------------------------- sprint 2 ------------------------- */
    /*--- toString ---*/
    //public String toString(){
    //}
    /*--- end of toString ---*/
    /*------------------------- end of sprint 2 ------------------------- */
    
    public void addDosen(String nama, String kode, String kk, String username, String password){
        if(nDosen < daftarDosen.length){
            daftarDosen[nDosen]= new Dosen(nama,kode,kk,username,password);
            nDosen++;
        }
    }
    public void addMahasiswa(String nama,String nim, String kk, String username, String password){
        if(nMahasiswa < daftarMahasiswa.length){
            daftarMahasiswa[nMahasiswa]= new Mahasiswa(nama,nim,kk,username,password);
            nDosen++;
        }
    }
    public Dosen getDosen(String kode){
        for(int i=0;i<nMahasiswa;i++){
            if(daftarDosen[i].getKode().equals(kode)){
                return daftarDosen[i];
            }
        }
        return null;
    } 
    public Mahasiswa getMahasiswa(String nim){
        for(int i=0;i<nMahasiswa;i++){
            if(daftarMahasiswa[i].getNIM().equals(nim)){
                return daftarMahasiswa[i];
            }
        }
        return null;
    }
    public void deleteDosen(int kode){
        int j = -1;
        for(int i=0;i<nDosen;i++){
            if(daftarDosen[i].getKode().equals(kode)){
                j = i;
            }
        }
        if (j != -1){    
            for(int i=j;i<nDosen-1;i++){
                daftarDosen[i]=daftarDosen[i+1];
            }
            nDosen--;
        }
    }
    public void deleteMahasiswa(int nim){
        int j = -1;
        for(int i=0;i<nMahasiswa;i++){
            if(daftarMahasiswa[i].getNIM().equals(nim)){
                j = i;
            }
        }
        if (j != -1){    
            for(int i=j;i<nMahasiswa-1;i++){
                daftarMahasiswa[i]=daftarMahasiswa[i+1];
            }
            nMahasiswa--;
        }
    }
    public void Menu11(Dosen d, String topik){
        d.CreateKelompokTA(topik);
    }
}
