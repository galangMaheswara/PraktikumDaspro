package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String pesan;
            System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
            String bebasKompen = sc.nextLine();
            
            System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
            int BimbinganP1 = sc.nextInt();
            System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
            int BimbinganP2 = sc.nextInt();

                if (bebasKompen.equalsIgnoreCase("Ya")) {
                        if (BimbinganP1 >= 8 && BimbinganP2 >= 4) {
                            pesan = "Semua syarat terpenuhi. Mahasiswa dapat mendaftar ujian skripsi.";
                        } else if (BimbinganP1 < 8 && BimbinganP2 < 4) {
                            pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan bimbingan P2 kurang dari 4 kali.";
                        } else if (BimbinganP1 < 8) {
                            pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali.";
                        } else {
                            pesan = "Gagal! Log bimbingan P2 kurang dari 4 kali.";
                        }
                    } else {
                    pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen."; 
                }
            System.out.println(pesan);
        sc.close();
    }
}