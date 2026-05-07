package TugasP2;

public class QueueLinkedList18 {

    Node18 front;
    Node18 rear;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    void enqueue(Mahasiswa18 mhs) {
        Node18 newNode = new Node18(mhs, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Mahasiswa masuk ke antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            front.data.tampilData();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        }
    }

    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilData();
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node18 temp = front;

            System.out.println("Isi antrian:");
            while (temp != null) {
                temp.data.tampilData();
                temp = temp.next;
            }
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantre: " + size);
    }
}
