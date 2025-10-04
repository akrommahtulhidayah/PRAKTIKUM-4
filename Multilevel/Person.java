package Multilevel;

public class Person {
    protected String nama;
    protected int umur;

    public void setData(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}
