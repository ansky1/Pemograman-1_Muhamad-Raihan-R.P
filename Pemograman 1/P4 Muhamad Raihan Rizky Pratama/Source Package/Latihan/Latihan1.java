import java.util.Scanner;

public class Latihan1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Input nama: ");
        String nama = input.nextLine();

        System.out.print("Input NIM: ");
        String nim = input.nextLine();

        // Input komponen nilai
        System.out.print("Input jumlah hadir: ");
        int hadir = input.nextInt();

        System.out.print("Input realisasi pertemuan: ");
        int realisasi = input.nextInt();

        System.out.print("Input nilai tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Input nilai UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Input nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        // Perhitungan
        double kehadiran = (double) hadir / realisasi * 10;
        double tugas     = nilaiTugas * 20 / 100;
        double uts       = nilaiUTS   * 30 / 100;
        double uas       = nilaiUAS   * 40 / 100;
        double total     = kehadiran + tugas + uts + uas;

        // Hasil :
        System.out.println("\n HASIL NILAI ");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Kehadiran: " + kehadiran);
        System.out.println("Tugas    : " + tugas);
        System.out.println("UTS      : " + uts);
        System.out.println("UAS      : " + uas);
        System.out.println("Total    : " + total);
    }
}