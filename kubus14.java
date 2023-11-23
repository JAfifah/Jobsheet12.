import java.util.Scanner;

public class kubus14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s, Lp, vol;

        System.out.println("Masukkan Sisi: ");
        s = input.nextInt();

        Lp = hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan Kubus adalah " + Lp);

        vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah " + vol);

        input.close(); 
    }

    static int hitungLuasPermukaan(int s) {
        int LuasPermukaan = s * s * 6;
        return LuasPermukaan;
    }

    static int hitungVolume(int s) {
        int volume = s * s * s;
        return volume;
    }
}