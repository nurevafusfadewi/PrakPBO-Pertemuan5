
package ruang;

public class Balok implements MenghitungRuang{

    private double panjang, lebar, tinggi;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }
    
}

