// Nama: Brian Albert
// NIM: 03081210027
// Kelas: 21SI2
// Soal 3
// Keterangan: Membuat sebuah class bernama Util.java untuk soal no 3
package khs;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Util {

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {}
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } 

    public static void bacaFile() throws IOException{
        //Step 1 : copas path dari sebuah file
        //Step 2 : read file dari baris pertama
        //C:\\Users\\brian\\OneDrive - Universitas Pelita Harapan\\Kuliah\\Semester Aklerasi 1\\2. PBO\\Code\\UAS (FINAL)\\UAS FINAL\\Output.txt
        File file = new File("C:\\Users\\brian\\OneDrive - Universitas Pelita Harapan\\Kuliah\\Semester Aklerasi 1\\2. PBO\\Code\\UAS (FINAL)\\UAS FINAL\\Output.txt");//Step 1 
        Scanner scan = new Scanner(file); //setp 2
        
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        } 
       
        
        
    }   
    
    public static void tulisFile() throws IOException{
        BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\brian\\OneDrive - Universitas Pelita Harapan\\Kuliah\\Semester Aklerasi 1\\2. PBO\\Code\\UAS (FINAL)\\UAS FINAL\\Output.txt")); 
        Scanner input = new Scanner(System.in);
        // Nama: Brian Albert
        // NIM: 03081210027
        // Kelas: 21SI2
        // Soal 4
        // Keterangan: Memvalidasi apabila tipe yang diinputkan tidak sesuai dengan yang diinginkan  
        boolean benar = true;
        while(benar = true){
            clearScreen();
            System.out.println("LOGIN");
            System.out.println("--------------------------------");
            System.out.println("Selamat Datang, Harap Login");
            System.out.print("Username (budi): ");
            String username = input.nextLine();
            if(username.length() == 4){
                if(username.equalsIgnoreCase("budi")){
                    br.write("Username : " + username + "\n");
                    // break;
                    while(benar = true){
                        clearScreen();
                        System.out.println("LOGIN");
                        System.out.println("--------------------------------");
                        System.out.println("Selamat Datang, Harap Login (No 3 & 4)");
                        System.out.println("Username (budi): " + username);
                        System.out.print("Password (123) : ");
                        String password = input.nextLine();
                        if(password.length() == 3){
                            if(password.equalsIgnoreCase("123")){
                                br.write("Password : " + password + "\n");
                                try {
                                    br.close();
                                   
                                    break;
                                    
                                } catch (Exception e) {
                                    //TODO: handle exception
                                    System.out.println(e.getMessage());
                                }
                                
                               
                            } else {
                                System.out.println("Password : " + password + " salah");
                                sleep(2000);
                                benar = true;
                            }
                        } else {
                            System.out.println("Password harus dalam 3 digit");
                            sleep(2000);
                            benar = true;
                        }

                    }
                    break;
                } else {
                    System.out.println( username + " tidak terdaftar");
                    sleep(2000);
                    benar = true;
                    
                }
            } else {
                
                System.out.println("Username hanya bisa 4 karakter");
                sleep(2000);
                benar = true;
                
            }
            
        }

        
       
 
            
       
    }
}
