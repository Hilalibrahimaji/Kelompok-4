import java.util.ArrayList;
import java.util.Scanner;

public class HapusTugas {
    public static void hapus(ArrayList<String> daftarTugas, Scanner scanner) {
        if (daftarTugas.isEmpty()) {
            System.out.println("Tidak ada tugas untuk dihapus.\n");
            return;
        }

        System.out.print("Masukkan nomor tugas yang ingin dihapus (1): ");
        int nomor = scanner.nextInt();
        scanner.nextLine();

        if (nomor > 0 && nomor <= daftarTugas.size()) {
            String dihapus = daftarTugas.remove(nomor - 1);
            System.out.println("Tugas \"" + dihapus + "\" berhasil dihapus!\n");
        } else {
            System.out.println("Nomor tugas tidak valid.\n");
        }
    }
}
