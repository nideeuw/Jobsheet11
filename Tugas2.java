import java.util.Scanner;

public class Tugas2 {

    static String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int[][] nilai = {
        {20, 19, 25, 20, 10, 0, 10}, // Nilai Sari
        {30, 30, 40, 10, 15, 20, 25}, // Nilai Rina
        {5, 0, 20, 25, 10, 5, 45}, // Nilai Yani
        {50, 0, 7, 8, 0, 30, 60}, // Nilai Dwi
        {15, 10, 16, 15, 10, 10, 5}  // Nilai Lusi
    };

    // a. Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilkanNilai() {
        System.out.println("Nilai Mahasiswa (Minggu 1 - Minggu 7):");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    // b. Fungsi untuk mencari minggu di mana terdapat nilai tertinggi dibandingkan dengan minggu lainnya
    public static void cariNilaiTertinggi() {
        int mingguTertinggi = 0;
        int nilaiTertinggi = 0;
        for (int j = 0; j < nilai[0].length; j++) {
            int totalMinggu = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalMinggu += nilai[i][j];
            }
            if (totalMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalMinggu;
                mingguTertinggi = j + 1;
            }
        }
        System.out.println("Minggu dengan nilai tertinggi dibanding hari lain adalah Minggu ke-" + mingguTertinggi + " dengan total nilai " + nilaiTertinggi);
    }

    // c. Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
    public static void tampilkanMahasiswaTertinggi() {
        int nilaiTertinggi = 0;
        int mahasiswaIndex = 0;
        int mingguIndex = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mahasiswaIndex = i;
                    mingguIndex = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswa[mahasiswaIndex] +
                " dengan nilai " + nilaiTertinggi + " pada Minggu ke-" + mingguIndex);
    }

    public static void main(String[] args) {
        tampilkanNilai();            // Tampilkan seluruh nilai mahasiswa
        cariNilaiTertinggi();         // Cari minggu dengan nilai tertinggi
        tampilkanMahasiswaTertinggi(); // Tampilkan mahasiswa dengan nilai tertinggi
    }
}
