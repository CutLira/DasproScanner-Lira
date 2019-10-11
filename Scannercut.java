
package scannercut;

import java.util.Scanner;

public class Scannercut {

    public static void main(String[] args) {
        // Buat objek scanner     
        Scanner nilaiuts = new Scanner (System.in);
        // Ambil input
        System.out.println("Input nilaiuts = ");
        String Nilaiuts = nilaiuts.nextLine();
        // Tampilkan salam
        System.out.println("Nilai uts : " + Nilaiuts);
        
        // Buat objek scanner
        Scanner nilaiuas = new Scanner (System.in);
        // Ambil input
        System.out.println("Input nilaiuas = ");
        String Nilaiuas = nilaiuas.nextLine();
        //tampilkan salam
        System.out.println("Nilai uas : " + Nilaiuas);
        
        // Buat objek scanner
        Scanner nilaikuis = new Scanner (System.in);
        // Ambil input
        System.out.println("Input nilaikuis");
        String Nilaikuis = nilaikuis.nextLine();
        //tampilkan salam
        System.out.println("Nilai kuis : " + Nilaikuis);
    }
    
}
