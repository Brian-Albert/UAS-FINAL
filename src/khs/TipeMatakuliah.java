// Nama: Brian Albert
// NIM: 03081210027
// Kelas: 21SI2
// Soal 1
// Keterangan: Membuat sebuah sub class bernama TipeMatakuliah untuk soal no 1
package khs;

import java.util.ArrayList;

public class TipeMatakuliah extends Matakuliah {

    public TipeMatakuliah(String tipe, String kodeMataKuliah, String namaMataKuliah, int sks){
        super(tipe, kodeMataKuliah, namaMataKuliah, sks);
    }

    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 1
    // Keterangan: menambahkan 2 fungsi utk menampilkan data yang tipenya adalah FLA atau SYS

    public void tampilkanDataMataKuliahFLA(){
        if(getTipe().equals("FLA")){
            super.tampilkanDataMataKuliah();
        } else {
            
        }
    } 
    
    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 1
    // Keterangan: menambahkan 2 fungsi utk menampilkan data yang tipenya adalah FLA atau SYS
    public void tampilkanDataMataKuliahSYS(){
        if(getTipe().equals("SYS")){
            super.tampilkanDataMataKuliah();
        }
    } 

    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 2
    // Keterangan: membuat fungsi overloading ke 1 dengan nama fungsi yang sama tetapi memiliki parameter berbeda
    
    public ArrayList<Integer> jumlahData(ArrayList<TipeMatakuliah> tipeMatkul){
        ArrayList<Integer> total = new ArrayList<Integer>();
        int jumlahFLA = 0;
        int jumlahSYS = 0;
        for(TipeMatakuliah matkul : tipeMatkul){
            if(matkul.getTipe().equals("FLA")){
                jumlahFLA += 1;
            } else if (matkul.getTipe().equals("SYS")) {
                jumlahSYS += 1;
            }
        }
        total.add(jumlahFLA);
        total.add(jumlahSYS);
        return total;
    }
    

    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 2
    // Keterangan: membuat fungsi overloading ke 2 dengan nama fungsi yang sama tetapi memiliki parameter berbeda
    public static String jumlahData(int x){
        String kata;
        ArrayList<String> satuan = new ArrayList<String>();
        satuan.add("Nol");
        satuan.add("Satu");
        satuan.add("Dua");
        satuan.add("Tiga");
        satuan.add("Empat");
        satuan.add("Lima");
        satuan.add("Enam");
        satuan.add("Tujuh");
        satuan.add("Delapan");
        satuan.add("Sembilan");
        satuan.add("Sepuluh");
        satuan.add("Sebelas");
        
        if(x >= 0 && x <= 11){
            for (int i = 0; i <= satuan.size(); i++) {
                if(i == x){
                   kata = satuan.get(i);
                   return kata;
                }

            }
            
        } else if (x == 100){
            kata = "Seratus";
            return kata;
        } else if (x >= 20){  
            String blkg;
            if(x % 10 != 0){
                blkg = jumlahData(x % 10);
            }  else {
                blkg = "";
            }
            
            kata = jumlahData((int)(Math.floor(x / 10))) + " puluh " + blkg;
            return kata;
        } else if (x < 20 && x >= 12){
            kata = jumlahData(x % 10) + " Belas ";
            return kata;
        }
         else if(x == 10 || x == 11){
            if(x == 10){
                kata = satuan.get(11);
                return kata;
            } else if (x == 11){
               kata = satuan.get(12);
               return kata;
            } 
            
        } else if (x >= 0){
            kata = "Tolong input diantara 1 - 100";
            return kata;
        }
        return "";
    }
   
    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 2
    // Keterangan: untuk mencoba fungsi jumlahData(int x)
    public static void main(String[] args){
        
        String kt;
        for (int i = 0; i <= 100; i++) {
            kt = jumlahData(i);
            System.out.println(kt);
        }
    }

} 