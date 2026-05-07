import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SingleLinkedList18 sll = new SingleLinkedList18();

        for (int i = 1; i <= 4; i++) {

            System.out.println("Data Mahasiswa ke-" + i);

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);

            sll.addLast(mhs);

            sll.print();
            System.out.println();
        }
    }
}