package manusia;

public class PBO8 {

    public static void main(String[] args) {

        Anak1 nmanak1 = new Anak1();
        Anak2 nmanak2 = new Anak2();
        Anak3 nmanak3 = new Anak3();
        Cucu1 nmacu1 = new Cucu1();

        System.out.println("===Keluarga Tak Kasat Mata===\n");
        System.out.println("Ciri fisik anak ke-1");
        nmanak1.rambut();
        nmanak1.gelombang();

        nmanak1.kulit();
        nmanak1.sawo();

        nmanak1.tinggibdn();
        nmanak1.tinggi();
        System.out.println("======================\n");

        System.out.println("Ciri fisik anak ke-2");
        nmanak2.rambut();
        nmanak2.keriting();

        nmanak2.kulit();
        nmanak2.sawo();

        nmanak2.tinggibdn();
        nmanak2.pendek();
        System.out.println("======================\n");

        System.out.println("Ciri fisik anak ke-3");
        nmanak3.rambut();
        nmanak3.gelombang();

        nmanak3.kulit();
        nmanak3.langsat();

        nmanak3.tinggibdn();
        nmanak3.pendek();
        System.out.println("======================\n");

        System.out.println("Ciri fisik cucu ke-1");
        nmacu1.rambut();
        nmacu1.kulit();
        nmacu1.tinggibdn();
        System.out.println("======================\n");
    }

}
