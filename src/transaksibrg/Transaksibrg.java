/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksibrg;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author USER
 */
public class Transaksibrg {

    /**
     * @param args the command line arguments
     */
    static private int jml;
    static private String kasir;
    String nama[] = new String[jml];
    int harga[] = new int[jml];
    int qty[] = new int[jml];
    int total[] = new int[jml];
    int ke;
    //setter konstruktor untuk menyamakan nama variabel dan parameter yang ada 
    public Transaksibrg(int x, String nama, int harga, int qty) {
        this.ke = x;
        this.harga[x] = harga;
        this.qty[x] = qty;
        this.nama[x] = nama;
        this.total[x] = harga * qty;
    }
//and make a getter to return the setter on top
    public int getTotal() {
        return total[ke];
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        boolean run = true; //add type data boolean to make 2 condition
        while (run) { //condition if program 
            System.out.print("Masukkan Jumlah Barang : "); //menampung hasil dari sebuah inputan jumlah barang
            jml = scn.nextInt(); //variable jml menyimpan nilai dengan type data integer

            String nama[] = new String[jml]; //instance of class dengan jumlah array yang akan diulang sesuai dengan jumlah barang yang dimasukkan 
            int qty[] = new int[jml];
            int harga[] = new int[jml];
            int total[] = new int[jml];
            if (jml > 0) { //kejadian yang akan terjadi apabila jumlah dari inputan bernilai diatas 0
                System.out.println("+===================================+"); //output
                System.out.println("|                        Toko-In SerbaAda                          |"); 
                System.out.println("|              Jl.Danau Tambingan G6,Malang               |");
                System.out.println("|                           05-25618392831                         |");
                System.out.println("+===================================+");
                for (int x = 0; x < jml; x++) { //jika x bernilai 0 dan jumlah inputan lebih besar dari nilai 0 maka akan terjadi perulangan 
                    System.out.println("                         - Barang " + (x + 1) + " -");
                    System.out.print("Masukkan Nama Barang    : "); //menyimpan hasil dari sebuah inputan nama barang 
                    nama[x] = scn.next(); //variable nama yang berisikan nilai menyimpan sebuah nilai bertype data String 
                    System.out.print("Masukkan Harga                : "); // menyimpan hasil dari sebuah inputan harga barang 
                    harga[x] = scn.nextInt(); //variable harga yang berisikan nilai menyimpan sebuah nilai bertype data integer 
                    System.out.print("Masukkan Qty                    : "); //menyimpan nilai dari jumlah barang
                    qty[x] = scn.nextInt(); //variable harga yang berisikan nilai menyimpan sebuah nilai bertype data integer 
                    Transaksibrg tb = new Transaksibrg(x, nama[x], qty[x], harga[x]); //instance class dan pendeklarasian yang memiliki parameter
                    System.out.println("Subtotal Harga                   : " + tb.getTotal()); //mengeluarkan hasil output dari nilai total
                    total[x] = qty[x] * harga[x]; //rumus dari nilai total (aritmetika) yaitu qty dikali dengan jumlah harga yang ada
                    System.out.println("----------------------------------------------------------");
                }
                run = false; //apabila telah selesai perintah inputan diatas maka terjadi 
                int y = 0; //yaituu y bernilai 0
                System.out.println("+===========+=========+=====+========+");
                System.out.println("|  Nama Kasir  :  Erina Ayu Safira                            |");
                System.out.println("|  Kode Kasir  :  TKN-405                                        |");
                System.out.println("+===========+=========+=====+========+");
                System.out.println("|  Nama Barang   |" + "      Harga     " + " |   Qty   " + " |   Subtotal   |");
                System.out.println("+===========+=========+=====+========+");
                do { //melakukan perintah dibawah ini
                    System.out.println("|          " + nama[y] + "       |        " + (harga[y]) + "     |    " + qty[y] + "       |   " + (harga[y] * qty[y]) + "      |");
                    System.out.println("+===========+=========+=====+========+");
                    y++;

                } while (y + 1 <= jml); //untuk menghitung hasil dari deklarasi sebuah total inputan yang ada 
                int t = IntStream.of(total).sum(); 
                System.out.println("|                                   Grandtotal     =   " + t + "          |");
                System.out.println("+===========+=========+=====+========+");
                System.out.println("|                               Terimakasih                               |");
                System.out.println("|                       Atas kunjungan Anda                          |");
                System.out.println("|           Selamat berbelanja kembali di Toko-In         |");
                 System.out.println("+===========+=========+=====+========+");
            } else { //apabila eksekusi diatas bernilai salah maka, akan dilakukan eksekusi dibawah ini
                try { //mencoba untuk melakukan perbandingan
                    throw new RuntimeException("Jumlah Barang tidak lebih dari 0"); //membuat sebuah keluaran atau aturan 
                } catch (RuntimeException jml0) { //melakukan pengecekan atas data 
                    System.out.println(jml0);
                }
            }
        }

    }
}
