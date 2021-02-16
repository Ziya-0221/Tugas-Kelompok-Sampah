
package sampah;
import java.util.Scanner;
public class Sampah {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //objek
        dataSampah oi = new dataSampah();
        
        //user memasukkan nama
        System.out.println("****Selamat datang di Trash Mall***");
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        //pemanggilan method 
        oi.pilihan();
        oi.jemput();
        
    }
    
}
