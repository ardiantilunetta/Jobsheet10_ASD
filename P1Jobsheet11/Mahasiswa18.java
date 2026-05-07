public class Mahasiswa18 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa18() {
    }

    Mahasiswa18(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nama+"\t"+nim+"\t"+"\t"+kelas+"\t"+ipk);
    }
}