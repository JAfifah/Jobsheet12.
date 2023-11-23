import java.util.Scanner;

public class soal2_14 {

    static int JUMLAH_MAHASISWA;
    static int JUMLAH_MINGGU;

    static double[][] nilaiMahasiswa;
    static String[] namaMahasiswa;

    static void inputJumlahMahasiswaDanMinggu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        JUMLAH_MAHASISWA = scanner.nextInt();

        System.out.print("Masukkan jumlah minggu: ");
        JUMLAH_MINGGU = scanner.nextInt();

        nilaiMahasiswa = new double[JUMLAH_MAHASISWA][JUMLAH_MINGGU];
        namaMahasiswa = new String[JUMLAH_MAHASISWA];

        scanner.nextLine(); 
    }

    static void inputNilaiMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            System.out.println("Masukkan nilai mahasiswa " + (i + 1) + " per minggu:");

            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); 
        }
    }
static void tampilkanNilaiMahasiswa() {
        System.out.println("\nNilai mahasiswa per minggu:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

  
    static void cariHariNilaiTertinggi() {
        double nilaiTertinggi = Double.MIN_VALUE;
        int hariTertinggi = -1;

        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            double nilaiMinggu = 0;
            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                nilaiMinggu += nilaiMahasiswa[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j + 1;
            }
        }

        System.out.println("\nNilai tertinggi terdapat pada hari ke-" + hariTertinggi);
    }

   
    static void tampilkanMahasiswaNilaiTertinggi() {
        double nilaiTertinggi = Double.MIN_VALUE;
        int mahasiswaTertinggi = -1;
        int mingguTertinggi = -1;

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaTertinggi = i;
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[mahasiswaTertinggi] +
                " pada minggu ke-" + mingguTertinggi + " dengan nilai " + nilaiTertinggi);
    }

public static void main(String[] args) {
        inputJumlahMahasiswaDanMinggu();
        inputNilaiMahasiswa();
        tampilkanNilaiMahasiswa();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }
}