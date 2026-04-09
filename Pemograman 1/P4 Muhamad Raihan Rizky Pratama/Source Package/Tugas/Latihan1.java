import java.util.Scanner;

public class Latihan1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Input nama: ");
        String nama = input.nextLine();

        System.out.print("Input makan (Rp): ");
        double makan = input.nextDouble();

        System.out.print("Input transport (Rp): ");
        double transport = input.nextDouble();

        System.out.print("Input belanja (Rp): ");
        double belanja = input.nextDouble();

        // Hitung total
        double total = makan + transport + belanja;

        // Hitung persentase
        double persenMakan     = (makan / total) * 100;
        double persenTransport = (transport / total) * 100;
        double persenBelanja   = (belanja / total) * 100;

        // Output hasil
        System.out.println("\nLAPORAN PENGELUARAN ");
        System.out.println("Nama            : " + nama);
        System.out.println("Makan           : Rp " + makan);
        System.out.println("Transport       : Rp " + transport);
        System.out.println("Belanja         : Rp " + belanja);
        System.out.println("Total           : Rp " + total);
        System.out.println("\nPERSENTASE ");
        System.out.println("Makan           : " + persenMakan + "%");
        System.out.println("Transport       : " + persenTransport + "%");
        System.out.println("Belanja         : " + persenBelanja + "%");
    }
}