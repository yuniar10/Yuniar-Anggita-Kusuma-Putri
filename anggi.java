
package modul2;

public class anggi extends dvdrent { 
     String aktor,sutradara, kategori;
    
    anggi(String aktor, String sutradara, String kategori, String judul, String publisher, int stok){
        super(judul,publisher,stok);
        this.aktor=aktor;
        this.sutradara=sutradara;
        this.kategori=kategori;
    }
    anggi(){
        
    }
    
}
