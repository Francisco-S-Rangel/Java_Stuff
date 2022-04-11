package treinando;

public class Quadrado {
    private double lado;
    private double area;
    private double perimetro;

    Quadrado(double lado){
        this.setLado(lado);
        this.calcularArea();
        this.calcularPerimetro();
    }

    void calcularArea(){
        this.setArea(this.getLado() * this.getLado());
    }
    void calcularPerimetro(){
        this.setPerimetro(this.getLado() * 4);
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
