package jobsheet5;

import java.util.Scanner;

public class perpustakaan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Apakah Anda membawa KTM? (Ya/Tidak): "); 
        String bawaKTM = sc.nextLine();
        System.out.print("Sudah registrasi online ? (Ya/Tidak): ");
        String registrasiOnline = sc.nextLine();
        if (bawaKTM.equalsIgnoreCase("Ya") || registrasiOnline.equalsIgnoreCase("Ya") ) {
            System.out.println("Boleh masuk");

        } else {
            System.out.println("Tidak boleh masuk");
        }
        sc.close();
    }

}