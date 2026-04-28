package Tugas;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahProses;
    int maxProses = 30;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        sudahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian.");
    }

    public void panggilKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");

        for (int i = 1; i <= 2; i++) {
            if (!isEmpty() && sudahProses < maxProses) {
                Mahasiswa mhs = data[front];
                mhs.tampilkanData();

                front = (front + 1) % max;
                size--;
                sudahProses++;
            }
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampil2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("2 Antrian Terdepan:");

        for (int i = 0; i < 2 && i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahSudahProses() {
        return sudahProses;
    }

    public int sisaBelumProses() {
        return maxProses - sudahProses;
    }
}