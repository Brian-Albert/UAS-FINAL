package khs;

import java.util.ArrayList;

public class Matakuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private int sks;
    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 1
    // Keterangan: 
    // - Membuat Tambahan variabel tipe bertipe String untuk subclass TipeMahasiswa
    // - Membuat sebuah arraylist untuk menampung data2 tipe
    private String tipe;
    public ArrayList<TipeMatakuliah> tipeMatakuliah = new ArrayList<TipeMatakuliah>();

    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 1
    // Keterangan: Menambahkan parameter tipe bertipe string 
    public Matakuliah(String tipe, String kodeMataKuliah, String namaMataKuliah, int sks) {
        this.tipe = tipe;
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    public String getKodeMataKuliah() {
        return this.kodeMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return this.namaMataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.namaMataKuliah = mataKuliah;
    }

    public int getSks() {
        return this.sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 1
    // Keterangan: Menambahkan getter dan setter tipe 
    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    public void tampilkanDataMataKuliah() {
        System.out.printf("%-5s %-12s %-25s %-4d\n", tipe, kodeMataKuliah, namaMataKuliah, sks);
    }
    

    // Nama: Brian Albert
    // NIM: 03081210027
    // Kelas: 21SI2
    // Soal 5
    // Keterangan: Membuat sebuah fungsi untuk melakukan sorting secara shell short

    public void shellSort(ArrayList<Matakuliah> mataKuliah) {
        int interfal;
        int index;
        int n = mataKuliah.size(); //n adalah size dari Arraylist mataKuliah
       
        Matakuliah temp;
        int j;
            //for interval adalah size dari Arraylist bagi 2; akan berulang sampai interfal lbh bsr dari 0; interval akan dibagi + 2
            for (interfal = n / 2; interfal > 0; interfal /= 2) { // for untuk mencari index ketika mulai membandingkan data kedua  
                //for index mulai dari hasil bagi interfal; index lebih kecil dari size Arraylist; index ditambah 1
                for (index = interfal; index < n; index += 1) { //for untuk index yang akan dimasukkan ke dalam temp 
                   temp = mataKuliah.get(index); //temp berisi data yang akan 
                  for (j = index; j >= interfal && mataKuliah.get(j - interfal).getSks() >= temp.getSks(); j -= interfal) { //for untuk menentukan apakah data di awal dengan data yang ditunjuk oleh temp lebih besar atau lebih kecil 
                      mataKuliah.set(j, mataKuliah.get(j - interfal)); //mengeset data pada indeks ke j dengan data yang ada di j - interfal jika temp lebih besar
                  }
                  mataKuliah.set(j, temp); //mengeset data di indeks ke j dengan data di temp jika temp lebih kecil 
                }
              } 
    }
}

