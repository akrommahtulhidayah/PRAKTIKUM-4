package Multilevel;

public class Student extends Person {
    protected String nim;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void tampilDataMahasiswa() {
        tampilData();
        System.out.println("NIM  : " + nim);
    }
}
