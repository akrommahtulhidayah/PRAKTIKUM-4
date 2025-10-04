package Singel;

public class Main {
    public static void main(String[] args) {
        Parent orangTua = new Parent("Tini", 45);
        orangTua.displayParentInfo();
        System.out.println();

        Child anak = new Child("Maya", 17, "SMA Negeri 1 Krangkeng");
        anak.displayParentInfo();
        System.out.println();

        anak.studi();
    }
}