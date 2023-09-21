 import java.util.Scanner;
 /**
  * Gaji20
  */
 public class Gaji20 {
 
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);    
    
    int jmlMasuk, jumlTdkMasuk, TotGaji;
    int gajiHarian, potongGajiHarian; 
    

    System.out.println("masukkan jumlah gaji harian");
    gajiHarian=input.nextInt();
    System.out.println("masukkan jumlah potongan gaji harian");
    potongGajiHarian=input.nextInt();
     System.out.println("Masukkan jumlah masuk Hari kerja anda: ");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan jumlah tidak masuk hari kerja anda: ");
    jumlTdkMasuk=input.nextInt();

    TotGaji = (jmlMasuk*gajiHarian)-(jumlTdkMasuk*potongGajiHarian);
    System.out.println("Gaji yang anda terima adalah" +TotGaji);




    }
 }