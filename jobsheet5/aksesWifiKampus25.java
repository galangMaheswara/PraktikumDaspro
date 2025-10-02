package jobsheet5;

import java.util.Scanner;

public class aksesWifiKampus25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sivitas anda? (Mahasiswa/Dosen): ");
        String sivitas = sc.nextLine().trim();

        if (sivitas.equalsIgnoreCase("dosen")) {
            System.out.print("Akses WiFi diberikan (dosen)");
        } else if (sivitas.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Jumlah SKS yang diambil: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa)");
            } else {
                System.out.println("Akses WiFi ditolak SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}