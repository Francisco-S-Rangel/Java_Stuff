package treinando;

public class Triangulo {
    private double base;
    private double altura;
    private double lado2;
    private double lado3;
    private double area;
    private double perimetro;

    Triangulo(double base,double lado2,double lado3,double altura){
        this.setAltura(altura);
        this.setBase(base);
        this.setLado2(lado2);
        this.setLado3(lado3);
        this.calcularArea();
        this.calcularPerimetro();
    }

    void calcularArea(){
        this.setArea((this.base*this.altura)/2);

    }
    void calcularPerimetro(){
        this.setPerimetro(this.base+this.lado2+this.lado3);
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
}
