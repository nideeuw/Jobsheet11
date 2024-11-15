import java.util.Scanner;

public class UcapanTerimaKasih_17Modifikasi {
    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = input.nextLine();
        input.close();
        return namaOrang; 
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");

        UcapanTambahan(nama);
    }
    public static void UcapanTambahan(String nama) {
        System.out.println("And " + nama + " don't forget to always be happy.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
