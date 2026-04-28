package Tugas;

import java.util.Scanner;

public class KRSmain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN PERSETUJUAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian KRS");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Sisa Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilKRS();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampil2Terdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.jumlahAntrian());
                    break;

                case 7:
                    System.out.println("Sudah proses KRS: " + antrian.jumlahSudahProses());
                    break;

                case 8:
                    System.out.println("Belum proses KRS: " + antrian.sisaBelumProses());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan salah.");
            }

        } while (pilih != 0);

        sc.close();
    }
}
