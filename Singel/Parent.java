package Singel;

public class Parent {
    private String nama;
    private int usia;

    public Parent(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public void displayParentInfo() {
        System.out.println("=== Informasi Parent ===");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia + " tahun");
    }
}