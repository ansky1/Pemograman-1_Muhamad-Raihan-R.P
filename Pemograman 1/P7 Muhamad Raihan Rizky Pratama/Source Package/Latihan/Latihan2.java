import java.util.Scanner;

public class Hewan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // S1
        System.out.print("Input Pilihan : ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        String hewan;
        switch (pilihan) {
            case 1:
                // P1
                hewan = "Ayam";
                break;
            case 2:
                // P2
                hewan = "Beruang";
                break;
            default:
                // S2
                System.out.println("Silahkan pilih di antara a dan b");
                System.out.println("a. Ayam");
                System.out.println("b. Beruang");
                System.out.print("Pilih : ");
                String ulang = sc.nextLine();

                if (ulang.equals("a")) {
                    hewan = "Ayam";
                } else {
                    hewan = "Beruang";
                }
                break;
        }

        // S3
        System.out.println("Hewan : " + hewan);

        sc.close();
    }
}