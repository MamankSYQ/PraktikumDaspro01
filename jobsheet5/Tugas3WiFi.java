import java.util.Scanner;
public class Tugas3WiFi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
        int jmlSKS;
      
        System.out.print("Masukkan kategori pengguna (dosen atau mahasiswa) : ");
        pengguna = sc.nextLine();
        
        if (pengguna.equalsIgnoreCase("dosen")){
            System.out.println("Akses WiFi diberikan (dosen)");
        } 
        else if (pengguna.equalsIgnoreCase("mahasiswa")){
            System.out.print("Masukkan jumlah SKS : ");
            jmlSKS = sc.nextInt();
            if (jmlSKS >= 12){
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            }
            else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } 
        else {
            System.out.println("Akses ditolak");
        }
    } 
}
