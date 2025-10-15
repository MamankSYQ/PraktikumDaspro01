import java.util.Scanner;
public class BonusKaryawan_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Deklarasi variabel untuk menghitung bonus
        int gajiPokok;
        double nilaiKinerja, lamaKerja;
        String sertifikasi;
        double bonus = 0; 

        //Input nilai kinerja, lama bekerja, gaji pokok, dan mendeteksi apakah punya sertifikasi atau tidak
        System.out.print ("Masukkan nilai kinerja (1-100): ");
        nilaiKinerja = sc.nextDouble();
        System.out.print ("Masukkan lama bekerja (tahun): ");
        lamaKerja = sc.nextDouble();
        System.out.print ("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.print ("Sertifikasi (ya/tidak): ");
        sertifikasi = sc.next();

        //Jika nilai kinerja >= 90, maka menggunakan pemilihan di sini untuk menghitung bonus
        if (nilaiKinerja >= 90){
            if (lamaKerja < 2){
                bonus = 0.02 * gajiPokok;
                System.out.println("Karena nilai kinerja >= 90 dan lama bekerja kurang dari 2 tahun, bonus awal adalah 3% dari gaji pokok: 0.02 * " + gajiPokok + " = " + "Rp. " + bonus);
            }
            else if (lamaKerja == 2 || lamaKerja < 5){
                bonus = 0.04 * gajiPokok;
                System.out.println("Karena nilai kinerja >= 90 dan lama bekerja antara 2 dan 5 tahun, bonus awal adalah 4% dari gaji pokok: 0.04 * " + gajiPokok + " = " + "Rp. " + bonus);
            }
            else {
                bonus = 0.07 * gajiPokok;
                System.out.println("Karena nilai kinerja >= 90 dan lama bekerja lebih dari 5 tahun, bonus awal adalah 7% dari gaji pokok: 0.07 * " + gajiPokok + " = " + "Rp. " + bonus);
            }
            //Jika nilai kinerja >= 70, maka menggunakan pemilihan di sini untuk menghitung bonus
        }
        else if (nilaiKinerja >= 70){
            if (lamaKerja < 2){
                bonus = 0.01 * gajiPokok;
                System.out.println("Karena nilai kinerja >= 70 dan lama bekerja kurang dari 2 tahun, bonus awal adalah 1% dari gaji pokok: 0.01 * " + gajiPokok + " = " + "Rp. " + bonus);
            }
            else if (lamaKerja == 2 || lamaKerja < 5){
                bonus = 0.03 * gajiPokok;
                System.out.println("Karena nilai kinerja >= 70 dan lama bekerja antara 2 dan 5 tahun, bonus awal adalah 3% dari gaji pokok: 0.03 * " + gajiPokok + " = " + "Rp. " + bonus);
            }
            else {
                bonus = 0.05 * gajiPokok;
                System.out.println("Karena nilai kinerja >= 70 dan lama bekerja lebih dari 5 tahun, bonus awal adalah 5% dari gaji pokok: 0.05 * " + gajiPokok + " = " + "Rp. " + bonus);
            }
        }
        //Jika nilai kinerja < 70, maka tidak menghitung dan tidak mendapat bonus
        else {
            System.out.println("Karyawan tidak mendapat bonus");
        }
    
        //Jika ada sertifikasi dan nilai kinerja > 70 maka bonus ditambah 500.000, jika tidak ada maka tidak mendapat bonus lagi
        if (sertifikasi.equalsIgnoreCase("ya") && nilaiKinerja > 70){
            bonus = bonus + 500000;
            System.out.println("Ada sertifikasi, ada tambahan bonus Rp. 500.000");
        }
        else {
            System.out.println("Tidak ada sertifikasi, jadi tidak ada bonus tambahan");
        }
        
        System.out.println ("Total bonus : Rp." + bonus);
       
    }
}