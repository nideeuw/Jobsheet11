import java.util.Scanner;

public class Tugas3 {

    static String[] mahasiswa;
    static int[][] nilai;

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilkanNilai() {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari minggu di mana terdapat nilai tertinggi dibandingkan minggu lainnya
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
        System.out.println("Minggu dengan nilai tertinggi adalah Minggu ke-" + mingguTertinggi + " dengan total nilai " + nilaiTertinggi);
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
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

    // Fungsi untuk mengisi data nilai dari input pengguna
    public static void inputData(Scanner scanner, int jumlahMahasiswa, int jumlahTugas) {
        mahasiswa = new String[jumlahMahasiswa];
        nilai = new int[jumlahMahasiswa][jumlahTugas];

        // Input nama mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = scanner.next();
        }

        // Input nilai mahasiswa untuk setiap minggu/tugas
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk " + mahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai untuk Minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa dan jumlah tugas (minggu)
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas (minggu): ");
        int jumlahTugas = scanner.nextInt();

        // Memasukkan data mahasiswa dan nilai dari input pengguna
        inputData(scanner, jumlahMahasiswa, jumlahTugas);

        // Menampilkan data dan hasil analisis
        tampilkanNilai();              // Tampilkan seluruh nilai mahasiswa
        cariNilaiTertinggi();           // Cari minggu dengan nilai tertinggi
        tampilkanMahasiswaTertinggi();  // Tampilkan mahasiswa dengan nilai tertinggi

        scanner.close();
    }
}
