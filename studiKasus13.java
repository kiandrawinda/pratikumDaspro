import java.util.Scanner;

public class studiKasus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon = 0;
        int totalBayar;
        int kembalian;
        int kurang;

System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();

        
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

       
        totalBayar = totalHarga - diskon;

       
        System.out.println("Total harga         : Rp " + totalHarga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Total bayar         : Rp " + totalBayar);

        // cek kembalian atau kekurangan uang
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian           : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        sc.close();
    }
}