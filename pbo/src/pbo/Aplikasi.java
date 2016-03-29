/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package pbo;

import java.util.Scanner;

public class Aplikasi {
    /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    Console:
    - Menampung array/list objek yang dibutuhkan
    - Buat method add/create untuk setiap array/list
    - Buat method search untuk setiap array/list
    - Buat method delete untuk setiap array/list
    - Buat method untuk setiap menu (1 menu = 1 method)
    
    Main Menu:
    - buatlah sebuah method "main menu"
    --  method ini akan menampilkan daftar menu yang ada,
    --  method menerima input pilihan menu dari user dan memanggil method menu yang sesuai
    --  usahakan menaruh semua proses i/o di dalam method ini 
    */
    
    /*------------------------- sprint 2 ------------------------- */
    /*--- Menampung array/list objek yang dibutuhkan ---*/
    private Dosen[] daftarDosen = new Dosen[10];
    private int nDosen;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
    private int nMahasiswa;
    /*--- end of Menampung array/list objek yang dibutuhkan ---*/
    /*--- toString ---*/
    public String toString(){
        String x = "Nama Dosen\t="+daftarDosen.toString()+
                "Nama Mahasiswa\t="+daftarMahasiswa.toString();
        return x;
    }
    /*--- end of toString ---*/
    /*---  Buat method add/create untuk setiap array/list ---*/
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
    /*---  end of Buat method add/create untuk setiap array/list ---*/
    /*---  Buat method search untuk setiap array/list ---*/
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
    /*---  end of Buat method search untuk setiap array/list ---*/
    /*---  Buat method delete untuk setiap array/list ---*/
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
    /*---  end of Buat method search untuk setiap array/list ---*/
    /*---  Buat method untuk setiap menu (1 menu = 1 method) ---*/
    /*-- menu login --*/
    public Orang Menu01(String username,String password){
        for(int i=0;i<nDosen;i++){
            if(daftarDosen[i].getUsername().equals(username)&daftarDosen[i].getPassword().equals(password)){
                return daftarDosen[i];
            }
        }
        for(int i=0;i<nMahasiswa;i++){
            if(daftarMahasiswa[i].getUsername().equals(username)&daftarMahasiswa[i].getPassword().equals(password)){
                return daftarMahasiswa[i];
            }
        }
        return null;
    }
    /*-- end of menu login --*/
    /*-- menu lecturer only --*/
    /*-- menu Create KelompokTA --*/
    public void Menu11(Dosen d, String topik){
        d.CreateKelompokTA(topik);
    }
    /*-- end of menu Create KelompokTA --*/
    /*-- menu delete KelompokTA --*/
    public void Menu12(Dosen d, int n){
        d.deleteKelompok(n);
    }
    /*-- end of menu delete KelompokTA --*/
    /*-- menu find KelompokTA --*/
    public void Menu13(Dosen d, int n){
        d.GetKelompok(n);
    }
    /*-- end of menu find KelompokTA --*/
    /*-- menu add member KelompokTA --*/
    public void Menu14(Dosen d, int n,Mahasiswa m){
        d.GetKelompok(n).addAnggota(m);
    }
    /*-- end of menu add member KelompokTA --*/
    /*-- menu find member KelompokTA --*/
    public void Menu15(Dosen d, int n,String NIM){
        d.GetKelompok(n).getAnggota(NIM);
    }
    /*-- end of menu find member KelompokTA --*/
    /*-- menu delete member KelompokTA --*/
    public void Menu16(Dosen d, int n,String NIM){
        d.GetKelompok(n).removeAnggota(NIM);
    }
    /*-- end of menu delete member KelompokTA --*/
    /*-- end of menu lecturer only --*/
    
    /*-- menu student only --*/
    /*-- menu create Tugas Akhir --*/
    public void Menu21(Mahasiswa m, String judul){
        m.createTA(judul);
    }
    /*-- end of menu create Tugas Akhir --*/
    /*-- menu set Pembimbing --*/
    public void Menu22(Mahasiswa m, Dosen d, int i){
        m.getTugasAkhir().setPembimbing(d, i);
    }
    /*-- end of menu set Pembimbing --*/
    /*-- menu get Pembimbing --*/
    public void Menu23(Mahasiswa m, int i){
        m.getTugasAkhir().getPembimbing(i);
    }
    /*-- end of menu get Pembimbing --*/
    /*-- end of menu student only --*/
    /*---  end of Buat method untuk setiap menu (1 menu = 1 method) ---*/
    
    /*---  buatlah sebuah method "main menu" ---*/
    public void MainMenu(){
        boolean ulang = true;
        do { 
            Scanner sc = new Scanner (System.in);
            System.out.println("Main Menu");
            System.out.println("1.Login");
            System.out.println("0.exit");
            System.out.print("pilihan     : ");
            int a1 = sc.nextInt();
            if (a1 == 1){
                System.out.println("Main Menu");
                System.out.print("Masukan Username    ");
                String user = sc.next();
                System.out.println("Username kamu adalah "+user);
                System.out.print("Masukan Password    = ");
                String pass = sc.next();
                System.out.println("Password kamu adalah "+pass);
                Orang b1 = Menu01(user,pass);
                Dosen c1;
                Mahasiswa c2;
                if (b1 instanceof Dosen){
                    System.out.println(" Menu Dosen");
                    System.out.println(" 1. Create KelompokTA");
                    System.out.println(" 2. Delete KelompokTA");
                    System.out.println(" 3. Find KelompokTA");
                    System.out.println(" 4. add member KelompokTA");
                    System.out.println(" 5. find member KelompokTA");
                    System.out.println(" 6. delete member KelompokTA");
                    System.out.print(" input      : ");
                    int a2 = sc.nextInt();
                    switch(a2){
                        case 1: //System.out.print("Topik : ");
                            //String topik = sc.nextLine();
                            //Menu11(this.getDosen(c1),topik);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;    
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("masukan hanya dari 1 - 6");
                            break;
                    }
                } else {
                    System.out.println(" Menu Mahasiswa");
                    System.out.println(" 1. Create KelompokTA");
                    System.out.println(" 2. Delete KelompokTA");
                    System.out.println(" 3. Find KelompokTA");
                    System.out.print(" input      : ");
                    int a2 = sc.nextInt();
                    switch(a2){
                        case 1: 
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("masukan hanya dari 1 - 3");
                            break;
                    }
                    System.out.println("");
                }
            } else if (a1==0) {
                System.out.println("exit");
                ulang = false;
            } else {
                System.out.println("masukan angka 1 atau 0");
                System.out.println();
            }
        }while(ulang == true);
    }
    /*---  end of buatlah sebuah method "main menu" ---*/
    /*------------------------- end of sprint 2 ------------------------- */
}
