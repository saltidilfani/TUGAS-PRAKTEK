/*

Nama  : Salti Dilfani
NIM   : 2301093007
Kelas : MI.1C


SOAL NO 4 
*/
import java.util.Scanner;

public class latihan4pboC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();
        
        int hasil = 1;
        int i = 1;
        
        while (i <= pangkat) {
            hasil *= nilai;
            i++;
        }
        
        System.out.println("Hasil " + nilai + " pangkat " + pangkat + " adalah: " + hasil);
    }
}
