import java.util.Scanner;
public class NilaiAngkaTersbesar_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklrasi variabel
        int angka1, angka2, angka3;
        //Input variabel angka ke-1 sampai ke-3
        System.out.print ("Masukkan nilai angka ke-1 : ");
        angka1 = sc.nextInt();
        System.out.print ("Masukkan nilai angka ke-2 : ");
        angka2 = sc.nextInt();
        System.out.print ("Masukkan nilai angka ke-3 : ");
        angka3 = sc.nextInt();
        
        //Untuk menghitung manakah angka yang lebih besar dari angka yang lainnya
        if (angka1 > angka2 && angka1 > angka3){
            System.out.println("Angka yang terbesar adalah " + angka1);
        }
        else if (angka2 > angka1 && angka2 > angka3){
            System.out.println("Angka yang terbesar adalah " + angka2);
        }
        else if (angka3 > angka1 && angka3 > angka2){
            System.out.println("Angka yang terbesar adalah " + angka3);
        }
        else {
            System.out.println("Ada beberapa angka terbesar");
        }
    }
}