public class Laskukone {
    static int tulos;

    public Laskukone() {
        nollaa();
    }

    public void lisaaLuku(int luku) {
        tulos += luku;
    }

    public void vahennaLuku(int luku) {
        tulos -= luku;
    }

    public void kerroLuvulla(int luku) {
    	tulos = tulos * luku;
        
    }

    public void korotaPotenssiin(int luku) {
        tulos = (int) Math.pow((double)tulos, luku);
    }

    public static int annaTulos() {
        return tulos;
    }

    public void nollaa() {
        tulos = 0;
    }
}