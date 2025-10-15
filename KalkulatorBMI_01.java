import java.util.Scanner;
public class KalkulatorBMI_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Deklarasi variabel Berat Badan, Tinggi Badan, dan BMI
        double beratBadan, tinggiBadan, bmi;

        //Input nilai Berat Badan dalam kilogram dan Tinggi Badan dalam meter
        System.out.print ("Masukkan berat badan (kilogram): ");
        beratBadan = sc.nextDouble();
        System.out.print ("Masukkan tinggi badan (meter): ");
        tinggiBadan = sc.nextDouble();
        
        //Rumus menghitung nilai BMI
        bmi = beratBadan / (tinggiBadan * tinggiBadan);

        /*Jika BMI < 18.5 maka program akan mengoutput termasuk kategori Underweight dan risiko penyakitnya, jika 18.5 <= BMI < 25 
        maka program akan mengoutput termasuk kategori Normal weight dan risiko penyakitnya, jika 25 <= BMI < 30 maka program akan mengoutput 
        termasuk kategori Overweight dan risiko penyakitnya, dan jika BMI > 30 maka program akan mengoutput termasuk kategori Obese dan risiko penyakitnya*/
        if (bmi < 18.5){
            System.out.println("Nilai BMI : " + bmi);
            System.out.println("Kategori Kurang berat badan (Underweight)");
            System.out.println("Risiko kesehatan : Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.");
        }
        else if (bmi == 18.5 || bmi < 25) {
            System.out.println("Nilai BMI : " + bmi);
            System.out.println("Kategori Berat badan normal (Normal weight)");
            System.out.println("Risiko kesehatan : Relatif rendah.");
        }
        else if (bmi == 25 || bmi < 30){
            System.out.println("Nilai BMI : " + bmi);
            System.out.println("Kategori Kelebihan berat badan (Overweight)");
            System.out.println("Risiko kesehatan : Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi.");
        }
        else {
            System.out.println("Nilai BMI : " + bmi);
            System.out.println("Kategori Obesitas (Obese)");
            System.out.println("Risiko kesehatan : Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker.");
        }
    }
}