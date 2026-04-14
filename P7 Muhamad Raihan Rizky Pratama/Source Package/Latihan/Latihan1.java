import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // S1
        System.out.print("Input Pilihan : ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        if (pilihan == 1) {

            // S2
            System.out.print("Nama : ");
            String nama = sc.nextLine();

            // P1
            System.out.print("Jurusan : ");
            String jurusan = sc.nextLine();

            if (jurusan.equals("Teknik Informatika")) {

                System.out.println("1. Reg A");
                System.out.println("2. Reg B");
                System.out.println("3. Reg CK");
                System.out.println("4. Reg CS");
                System.out.print("Pilih Kelas : ");
                int pKelas = sc.nextInt();

                String kelas;
                switch (pKelas) {
                    case 1: kelas = "Reg A"; break;
                    case 2: kelas = "Reg B"; break;
                    case 3: kelas = "Reg CK"; break;
                    case 4: kelas = "Reg CS"; break;
                    default: kelas = "Reg A"; break;
                }

                // S4
                System.out.println("Nama    : " + nama);
                System.out.println("Jurusan : " + jurusan);
                System.out.println("Kelas   : " + kelas);

            } else {
                // S3
                System.out.println("Jurusan tidak ditemukan.");
            }

        } else {
            // S3
            System.out.println("Jurusan tidak ditemukan.");
        }

        sc.close();
    }
}