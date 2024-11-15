import java.util.Scanner;

public class Ucapan_17 {
    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = input.nextLine();
        input.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you.");
    }
    
}
