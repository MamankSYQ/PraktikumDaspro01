import java.util.Scanner;
public class Tugas3Perpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String izin;
      
        System.out.println("(pilih antara kartu mahasiswa atau registrasi online)");
        System.out.print("Masukkan izin : ");
        izin = sc.nextLine();

        if (izin.equalsIgnoreCase("kartu mahasiswa") || izin.equalsIgnoreCase("registrasi online")){
            System.out.println("Silahkan masuk");
        }
        else {
            System.out.println("Dilarang masuk");
        }
    }
}