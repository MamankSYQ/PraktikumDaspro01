import java.util.Scanner;
public class ifCetakKRS01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KSR SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KSR dan minta tanda tangan DPA");
        }
        else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        }
        String hasilCetak = uktLunas ? "UKT Lunas - Silahkan cetak KRS dan minta tanda tangan DPA" : "UKT Belum Lunas - Tidak dapat mencetak KRS";
        System.out.println(hasilCetak);
    }
}