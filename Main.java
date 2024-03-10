import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Validasi panjang NIM
        if (Mahasiswa.isValidNim(nim)) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Universitas: ");
            String universitas = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, universitas);

            System.out.println("\nData Mahasiswa:");
            mahasiswa.tampilDataMahasiswa();

            System.out.println("\nInformasi Universitas:");
            Mahasiswa.tampilUniversitas();
        } else {
            System.out.println("Panjang NIM harus 15 angka.");
        }

        scanner.close();
    }
}
