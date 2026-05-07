package TugasP2;

public class Mahasiswa18 {
    String nim, nama, jurusan;

    Mahasiswa18(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void tampilData() {
        System.out.println(nim + " | " + nama + " | " + jurusan);
    }
}