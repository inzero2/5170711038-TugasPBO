package manusia;

public class Cucu1 extends Anak1 {

    @Override
    void rambut() {
        System.out.print("Jenis rambut: ");
        lurus();
    }

    @Override
    void kulit() {
        System.out.print("Warna kulit: ");
        putih();
    }

    @Override
    void tinggibdn() {
        System.out.print("Tinggi badan: ");
        sedang();
    }

    protected void lurus() {
        System.out.println("Lurus");
    }

    protected void putih() {
        System.out.println("Putih");
    }

    protected void sedang() {
        System.out.println("165 cm");
    }
}
