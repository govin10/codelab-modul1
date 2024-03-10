import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private String universitas;

    public Mahasiswa(String nim, String nama, String universitas) {
        this.nim = nim;
        this.nama = nama;
        this.universitas = universitas;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Universitas: " + universitas);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas UMM");
    }

    public String getNim() {
        return nim;
    }

    // Validasi panjang NIM
    public static boolean isValidNim(String nim) {
        return nim.length() == 15;
    }
}