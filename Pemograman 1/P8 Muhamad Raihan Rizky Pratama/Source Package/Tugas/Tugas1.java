import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih;
        System.out.println("Menu:");
        System.out.println("1. Input Kehadiran");
        System.out.print("Pilih: ");
        pilih = sc.nextInt();

        switch(pilih) {
            case 1:
                int total = 0;

                for(int i = 1; i <= 21; i++) {
                    System.out.print("Pertemuan ke-" + i + " (1/0): ");
                    int hadir = sc.nextInt();
                    total = total + hadir;
                }

                double persen = total / 21.0 * 100;
                char grade;

                if(persen >= 85) {
                    grade = 'A';
                } else if(persen >= 75) {
                    grade = 'B';
                } else if(persen >= 60) {
                    grade = 'C';
                } else {
                    grade = 'D';
                }

                if(persen < 75) {
                    System.out.println("STATEMENT 3");
                } else {
                    System.out.println("STATEMENT 4");
                }

                System.out.println("Persen kehadiran: " + persen);
                System.out.println("Grade: " + grade);
                break;

            default:
                System.out.println("Pilihan salah");
        }

        sc.close();
    }
}