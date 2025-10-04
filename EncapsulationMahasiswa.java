public class EncapsulationMahasiswa {

    // === [1] Atribut (Access Modifier: private) ===
    // Data mahasiswa disembunyikan agar tidak bisa diakses langsung dari luar class
    private String nim;
    private String nama;
    private int umur;
    private double ipk;

    // === [2] Konstruktor ===
    // Digunakan untuk memberi nilai awal pada atribut ketika objek dibuat
    public EncapsulationMahasiswa(String nim, String nama, int umur, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;
    }

    // === [3] Method Setter (Mutator) ===
    // Untuk mengubah nilai atribut dengan validasi
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur < 17) {
            System.out.println("Umur minimal 17 tahun untuk menjadi mahasiswa!");
        } else {
            this.umur = umur;
        }
    }

    public void setIpk(double ipk) {
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK harus berada antara 0.0 - 4.0!");
        } else {
            this.ipk = ipk;
        }
    }

    // === [4] Method Getter (Accessor) ===
    // Untuk mengambil nilai atribut (membaca data)
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getIpk() {
        return ipk;
    }

    // === [5] Method 'final' ===
    // Tidak bisa dioverride oleh subclass
    public final void tampilkanData() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("IPK   : " + ipk);
    }

    // === [6] Method 'static' ===
    // Dapat dipanggil tanpa harus membuat objek
    public static void infoKampus() {
        System.out.println("Kampus: Universitas PBO Indonesia");
    }

    // === [7] Main Method (Program Utama) ===
    public static void main(String[] args) {

        // Memanggil method static tanpa membuat objek
        EncapsulationMahasiswa.infoKampus();

        // Membuat dua objek mahasiswa
        EncapsulationMahasiswa mhs1 = new EncapsulationMahasiswa("001", "Akrom'mahtul Hidayah", 19, 3.85);
        EncapsulationMahasiswa mhs2 = new EncapsulationMahasiswa("002", "Felisa Zahira Azahra", 20, 3.40);

        // Menampilkan data awal
        mhs1.tampilkanData();
        mhs2.tampilkanData();

        // Mengubah data pada objek pertama
        System.out.println("\n=== UPDATE DATA MAHASISWA 1 ===");
        mhs1.setNama("Akrom'mahtul H.");
        mhs1.setUmur(16);   // Akan ditolak karena < 17
        mhs1.setIpk(4.1);   // Akan ditolak karena > 4.0

        // Menampilkan data setelah perubahan
        mhs1.tampilkanData();
    }
}