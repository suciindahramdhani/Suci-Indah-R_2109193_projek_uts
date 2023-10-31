package jajarangenjang;

public class JajaranGenjang {
    private double sisiMiring;
    private double alas;
    private double tinggi;

    public JajaranGenjang() {
        this.sisiMiring = 1;
        this.alas = 1;
        this.tinggi = 1;
    }

    public JajaranGenjang(double sisiMiring, double alas, double tinggi) {
        this.sisiMiring = sisiMiring;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return alas * tinggi;
    }

    public double getKeliling() {
        return 2 * (alas + sisiMiring);
    }

    public static void main(String[] args) {
        JajaranGenjang jg = new JajaranGenjang(6, 8, 5);
        System.out.println("Alas: " + jg.alas);
        System.out.println("Tinggi: " + jg.tinggi);
        System.out.println("Luas: " + jg.getLuas());
        System.out.println("Keliling: " + jg.getKeliling());
    }
}