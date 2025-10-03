import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarTugas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Panggil fitur tambah
        TambahTugas.tambah(daftarTugas, scanner);

        // Panggil fitur hapus
        HapusTugas.hapus(daftarTugas, scanner);

        // Tampilkan hasil akhir
        System.out.println("\nDaftar Tugas:");
        if (daftarTugas.isEmpty()) {
            System.out.println("Belum ada tugas.");
        } else {
            for (int i = 0; i < daftarTugas.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTugas.get(i));
            }
        }

        scanner.close();
    }
}
