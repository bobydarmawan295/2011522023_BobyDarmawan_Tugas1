import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> nama = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        String pilihanUser;

        nama.add("a");
        nama.add("w");
        nama.add("a");
        nama.add("n");
        
        while(isContinue){
            System.out.println("\n===================");
            System.out.println("\tARRAY");
            System.out.println("===================");
            System.out.println("1. Tampilkan array");
            System.out.println("2. isEmpty() => Cek apakah array kosong ");
            System.out.println("3. size()    => Cek size/ukuran elemen array");
            System.out.println("4. get()     => Mengambil nilai array");
            System.out.println("5. indexOf() => Menampilkan indeks elemen");
            System.out.println("6. remove()  => Menghapus elemen ke-");
            System.out.println("7. Add()     => Menambah elemen array");

            System.out.print("\nPilihan anda (1/2/3/4/5/6/7): ");
				pilihanUser = input.next();
				
				switch (pilihanUser) {
				case "1":
                    System.out.println(nama);
					break;
				case "2":
                    System.out.println(nama.isEmpty());
					break;
				case "3":
                    System.out.println(nama);
                    System.out.println("Size array : " + nama.size());
					break;
				case "4":
                    System.out.println("Elemen pada indeks ke-0 " + nama.get(0));
                    System.out.println("Elemen pada indeks ke-2 " + nama.get(2));
                    System.out.println("Elemen pada indeks ke-6 " +nama.get(6));
                    System.out.println(nama.get(-3)); 
					break;
				case "5":
                    System.out.println("elemen a berada pada indeks ke- " + nama.indexOf("a"));
                    System.out.println("elemen c berada pada indeks ke- " + nama.indexOf("c"));
                    System.out.println("elemen q berada pada indeks ke- " + nama.indexOf("q"));
					break;
                case "6":
                    System.out.println("elemen pada indeks ke-0 " + nama.remove(0) + " dihapus");
                    System.out.println("elemen pada indeks ke-3 " + nama.remove(3) + " dihapus");
                    System.out.println("elemen pada indeks ke-2 " + nama.remove(2) + " dihapus");
                    break;
                case "7":
                    nama.add(0,"e");
                    nama.add(2,"f");
                    nama.add(3,"g");
                    nama.add(4,"h");
                    nama.add(6,"h");
                    nama.add(-3,"j");
                    System.out.println(nama);
                    break;
				default:
					System.out.println("\nInput anda tidak ditemukan\nSilakan pilih [1-7]");
				}
                
				System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
				pilihanUser = input.next();
				isContinue = pilihanUser.equalsIgnoreCase("y");
			}
				
        }
      

}

