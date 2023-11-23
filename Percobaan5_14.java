public class Percobaan5_14 {

    static void tampil (String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        tampil ("Daspro 2023", 100, 200);
        tampil ("Teknologi Informasi", 1, 2, 3, 4);
        tampil ("Polinema");
    }
    
}