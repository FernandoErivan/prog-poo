package ClassAbstract;

public abstract class Circulo extends FormaGeometrica{
    private double raio;

    public double area() {
        return 3.14 * raio * raio ;
    }

    public double comprimento() {
        return 2 * 3.14 *raio;
    }

}
