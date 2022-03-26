import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        LinkedList<String> biodata = new LinkedList<String>();
        System.out.println("==========================");
        System.out.println("\tLINKED LIST 2");
        System.out.println("==========================");

        // 1.addFirst()
        System.out.print("Nama depan     : ");
        String namaDepan = input.next();
        biodata.addFirst(namaDepan);

        // 2.addLast()
        System.out.print("Nama belakang  : ");
        String namaBelakang = input.next();
        biodata.addLast(namaBelakang);

        // 3.add()
        System.out.print("No BP          : ");
        String no_bp = input.next();
        biodata.add(no_bp);
        System.out.print("Alamat         : ");
        String alamat = input.next();
        biodata.add(alamat);
        input.close();

        System.out.println("\n" + biodata);

        // isEmpty()
        System.out.println("Apakah elemen kosong : " + biodata.isEmpty() + "\n");
        
        // 4.clone()
        LinkedList biodata2 = new LinkedList();
        biodata2 = (LinkedList) biodata.clone();
        System.out.println("Hasil copy dari Linked List sebelumnya" + biodata2);

        //5.Contains()
        System.out.println("\n" + biodata);
        System.out.println("Apakah biodata terdapat elemen 20 : " + biodata.contains("20"));

        // 6.Size()
        System.out.println("\n" + biodata);
        System.out.println("Size elemen : " + biodata.size());

        // 7.get()
        System.out.println("\n" + biodata);
        System.out.println("Elemen pada indeks ke-1 : " + biodata.get(1));

        // 8.indexOf()
        System.out.println("\n" + biodata);
        System.out.println("elemen \"boby\" berada pada indeks ke- " + biodata.indexOf("Boby"));

        // 9.Remove()
        System.out.println("\nelemen pada indeks ke-2 " + biodata.remove(2) + " dihapus");
        System.out.println(biodata);

        // 10.POP()
        System.out.println("\n" +  biodata);
        System.out.println("Elemen yang di pop " + biodata.pop());
        System.out.println(biodata);

        // 11. clear()
        System.out.println("\n" +  biodata);
        biodata.clear();
        System.out.println("Semua elemen dihapus");
        System.out.println(biodata);

    

    }
}
