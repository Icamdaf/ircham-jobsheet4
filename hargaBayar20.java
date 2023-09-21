import java.util.Scanner;

public class hargaBayar20 {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);

    int harga, jumlah, jumlahHal ;
    double dis, total, bayar, jmlDis;
    String merkbuku;

    System.out.println("masukkan merek buku: ");
    merkbuku=input.nextLine();
    System.out.println("masukkan jumlah halaman: ");
    jumlahHal=input.nextInt();
    System.out.println("masukkan harga yang dibeli: ");
    harga=input.nextInt();
    System.out.println("masukkan jumlah barang yang dibeli: ");
    jumlah=input.nextInt();
    System.out.println("Masukkan diskon");
    dis=input.nextInt();
    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;
    
    System.out.println("merek" +merkbuku);
     System.out.println("jumlah halaman" +jumlahHal);
    System.out.println("Diskon yang anda dapatkan adalah" +jmlDis);
    System.out.println("Jumlah yang harus dibayar" +bayar);
    System.out.println("merek" +merkbuku);
  

    }
}