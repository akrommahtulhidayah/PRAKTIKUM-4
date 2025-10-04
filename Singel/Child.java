package Singel;

public class Child extends Parent {
    private String sekolah;

    public Child(String nama, int usia, String sekolah) {
        super(nama, usia);
        this.sekolah = sekolah;
    }

    public String getSekolah() {
        return sekolah;
    }

    @Override
    public void displayParentInfo() {
        super.displayParentInfo();
        System.out.println("Sekolah : " + sekolah);
    }

    public void studi() {
        System.out.println(getNama() + " sedang belajar di " + sekolah + ".");
    }
}
