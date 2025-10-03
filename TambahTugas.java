import java.util.ArrayList;
import java.util.Scanner;

public class TambahTugas {
    public static void tambah(ArrayList<String> daftarTugas, Scanner scanner) {
        System.out.print("Masukkan nama tugas baru: ");
        String tugas = scanner.nextLine();
        daftarTugas.add(tugas);
        System.out.println("Tugas berhasil ditambahkan!\n");
    }
}
