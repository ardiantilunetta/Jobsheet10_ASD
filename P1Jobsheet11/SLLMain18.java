import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SingleLinkedList18 sll = new SingleLinkedList18();

        Mahasiswa18 mhs1 = new Mahasiswa18("21212203", "Dirga", "4D", 3.6);
        Mahasiswa18 mhs2 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
        Mahasiswa18 mhs3 = new Mahasiswa18("23212202", "Bimon", "2B", 3.8);
        Mahasiswa18 mhs4 = new Mahasiswa18("24212200", "Alvaro", "1A", 4.0);

        // Tambahkan data ke linked list
        sll.addFirst(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        // Tampilkan isi linked list
        sll.print();

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println(
            "Data mahasiswa an Bimon berada pada index : "
            + sll.indexOf("Bimon")
        );

        System.out.println("\nHapus data pertama");
        sll.removeFirst();
        sll.print();

        System.out.println("Hapus data terakhir");
        sll.removeLast();
        sll.print();

        System.out.println("Hapus data index 0");
        sll.removeAt(0);
        sll.print();
    }


        // for (int i = 1; i <= 4; i++) {

        //     System.out.println("Data Mahasiswa ke-" + i);

        //     System.out.print("NIM   : ");
        //     String nim = sc.nextLine();

        //     System.out.print("Nama  : ");
        //     String nama = sc.nextLine();

        //     System.out.print("Kelas : ");
        //     String kelas = sc.nextLine();

        //     System.out.print("IPK   : ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine();

        //     Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);

        //     sll.addLast(mhs);

        //     sll.print();
        //     System.out.println();
        // }
}
