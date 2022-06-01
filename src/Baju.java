// Deklarasi Class
public class Baju{

    // Deklarasi Variabel
    private String nama;
    private int harga, jumlah, total;

    // Konstruktor Dengan Parameter
    public Baju(String _nama, int _harga, int _jumlah){
        nama  = _nama;
        harga = _harga;
        jumlah= _jumlah;
    }

    // Method Untuk Hitung Harga Total
    public int total(){
        total = harga * jumlah;
        return total;
    }
    
    // Method Untuk Menampilkan Rincian
    public void tampil(){
        System.out.println("Nama Barang\t\t: "+ nama);
        System.out.println("Harga Barang\t\t: "+ harga);
        System.out.println("Jumlah yang Dibeli\t: "+ jumlah);
        System.out.println("__________________________________");
        System.out.println("\t\t\t: "+ total());
    }
    
    public static void main(String[]args){

        // Perintah untuk membuat objek
        Baju resi = new Baju("Baju Olahraga Muslimah", 325000, 27);
        resi.tampil();
    }
}