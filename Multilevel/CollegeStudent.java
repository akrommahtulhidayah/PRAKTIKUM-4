package Multilevel;

public class CollegeStudent extends Student {
    private String jurusan;

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void tampilDataLengkap() {
        tampilDataMahasiswa();
        System.out.println("Jurusan : " + jurusan);
    }
}
