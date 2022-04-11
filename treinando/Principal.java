package treinando;

public class Principal {
    static public void main(String[] args){
        Quadrado q= new Quadrado(4);

        System.out.println("\n\nQuadrado.");
        System.out.println("Lado:" + q.getLado() );
        System.out.println("Area:" + q.getArea());
        System.out.println("Perimetro:" + q.getPerimetro());

        Triangulo t= new Triangulo(12,10,10,12);

        System.out.println("\n\nTriangulo.");
        System.out.println("Base:" + t.getBase());
        System.out.println("Lado 2:" + t.getLado2());
        System.out.println("Lado 3:" + t.getLado3());
        System.out.println("Area:" + t.getArea());
        System.out.println("Perimetro:" + t.getPerimetro());

    }
}