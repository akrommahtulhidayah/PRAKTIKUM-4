package Multilevel;

public class MainMultilevel {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.setData("Maya", 20);
        cs.setNim("230101001");
        cs.setJurusan("Informatika");

        System.out.println("=== DATA MAHASISWA ===");
        cs.tampilDataLengkap();
    }
}
