import java.util.Scanner;

public class ifCetakKRS25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Cetak KRS Siakad ---");
    System.out.print("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = sc.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverifiasi ");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        
    }


    }
}