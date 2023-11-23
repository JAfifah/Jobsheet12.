import java.util.Scanner;

public class Ucapan_14 {

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thankyou dear " +nama+ "\n May Allah always be with you" );
    }
}