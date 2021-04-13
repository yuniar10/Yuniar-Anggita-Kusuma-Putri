
package modul2;

import java.util.Scanner;
    
public class Main {


    public static void main(String[] args) {
        int pilih,repeat;

        do{        
            anggi dvd = new anggi ();

            Scanner inputUser = new Scanner(System.in);

            System.out.println("");
            System.out.print("Masukkan Judul        : ");
            dvd.judul=inputUser.nextLine();
            System.out.print("Masukkan Publisher    : ");
            dvd.publisher=inputUser.nextLine();
            System.out.print("Masukkan Aktor        : ");
            dvd.aktor=inputUser.nextLine();
            System.out.print("Masukkan Sutradara    : ");
            dvd.sutradara=inputUser.nextLine();
            
            System.out.println("           Kategori");
            System.out.println("1. Semua Umur\n2. Dewasa\n3. Remaja\n4. Anak-Anak");
            System.out.print("Pilih nomer berapa?   : ");
            pilih=inputUser.nextInt();

            switch(pilih){
                case 1:
                    dvd.kategori="Semua Umur";
                    break;
                case 2:
                    dvd.kategori="Dewasa";
                    break;
                case 3:
                    dvd.kategori="Remaja";
                    break;
                case 4:
                    dvd.kategori="Anak-Anak";
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada");
                    return;
            }
            System.out.print("Stok                   : ");
            dvd.stok=inputUser.nextInt();
            System.out.println("         DATA VCD FILM");
            System.out.println("==============================");
            
            System.out.println("Judul Film          : "+dvd.judul);
            System.out.println("Sutradara           : "+dvd.sutradara);
            System.out.println("Aktor Film          : "+dvd.aktor);
            System.out.println("Publishe            : "+dvd.publisher);
            System.out.println("Kategori            : "+dvd.kategori);
            System.out.println("Jumlah Stok         : "+dvd.stok);
            
            System.out.println("\n");
            System.out.println("Mau Coba Lagi?\nYa[1] atau Tidak [2]");
            System.out.print("Pilih nomer berapa? : ");
            repeat=inputUser.nextInt();
            }while(repeat<2);
        
    }  
    
    
}
