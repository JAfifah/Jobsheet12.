import java.util.Scanner;

public class UcapanTerimakasih_14 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih(String nama) {
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You've inspired in me a love for learning and made me feel like I could ask you anything even in difficult things.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        UcapanTerimakasih(nama);

        String ucapanTambahan = "Terimakasih Pak, Semoga Sehat dan Bahagia Selalu";
        UcapanTambahan(ucapanTambahan);
    }
}
