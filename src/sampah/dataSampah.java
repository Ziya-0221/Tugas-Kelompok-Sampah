
package sampah;

import java.util.Scanner;

public class dataSampah {
    
    //object input
    Scanner input = new Scanner (System.in);
    int totalPrice = 0;
    
    //void method -> user menentukan pilihan
    void pilihan(){
        System.out.println("|            JENIS SAMPAH           |");
        System.out.println("1. Plastik   => Rp. 3000/kg");
        System.out.println("2. Kertas    => Rp. 1600/kg");
        System.out.println("3. Logam     => Rp. 10000/kg");
        System.out.println("4. Kaca      => Rp. 1300/kg");
        
        
        boolean repeat = true;
        
        //perulangan apakah user ingin menambahkannya atau tidak
        while (repeat){
        System.out.print("Masukkan Jenis Sampah yang Akan Anda Jual : ");
        int pilihan = input.nextInt();
        System.out.println("");
        
        //perulangan user input pilihan
          switch(pilihan){
            case 1 : 
                System.out.println("Anda memilih jenis sampah Plastik");
                System.out.print("Masukkan berat sampah anda (Satuan KG) : ");
                int berat1 = input.nextInt();
                int harga1 = berat1*3000;
                System.out.println(totalPrice += harga1);
            break;
            case 2 : 
                System.out.println("Anda memilih jenis Kertas");
                System.out.print("Masukkan berat sampah anda (Satuan KG) : ");
                int berat2 = input.nextInt();
                int harga2 = berat2*1600;
                System.out.println(totalPrice += harga2);
            break;
            case 3 : 
                System.out.println("Anda memilih jenis sampah Logam");
                System.out.println("Masukkan berat sampah anda (Satuan KG) : ");
                int berat3 = input.nextInt();
                int harga3 = berat3*10000;
                System.out.println(totalPrice += harga3);
            break;
            case 4 :
                System.out.println("Anda memilih jenis sampah Kaca");
                System.out.println("Masukkan berat sampah anda (Satuan KG) : ");
                int berat4 = input.nextInt();
                int harga4 = berat4*1300;
                System.out.println(totalPrice += harga4);
            }
        System.out.println(" ");
        System.out.println("Apakah Anda Ingin Menambahnya? (y/n)");
        System.out.print("=> ");
        String keepRepeating = input.next();
        
        repeat = keepRepeating.equalsIgnoreCase("y");
        System.out.println("=========================");
        }
        System.out.println("Total uang yang anda dapatkan: "+totalPrice);
        }
    
    //void method ->user input alamat dan tanggal 
    void jemput(){
        System.out.print("Masukkan Alamat penjemputan: ");
        String alamat = input.next();
        System.out.print("Masukkan waktu dan tanggal penjemputan: ");
        String waktu = input.next();
        System.out.println("Terimakasih");
        System.out.println("Transaksi telah berhasil");
    }
    
        
    }

