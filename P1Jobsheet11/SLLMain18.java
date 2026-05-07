public class SLLMain18 {
    public static void main(String[] args) {
        SingleLinkedList18 sll = new SingleLinkedList18();
        Mahasiswa18 mhs1 = new Mahasiswa18("22001", "Andi", "TI-1A", 3.75);
        Mahasiswa18 mhs2 = new Mahasiswa18("22002", "Budi", "TI-1B", 3.60);
        Mahasiswa18 mhs3 = new Mahasiswa18("22003", "Citra", "TI-1C", 3.90);
        Mahasiswa18 mhs4 = new Mahasiswa18("22004", "Dina", "TI-1D", 3.80);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
