package miPrincipal;

public class EcuacionCuadratica {
    // Atributos
    private int a;
    private int b;
    private int c;

    // Constructor
    public EcuacionCuadratica( int a, int b, int c )
    {
        // Establecer los valores de los atributos
    }

    // Metodos get/set
    public void setA( int a )
    {
        // El atributo a puede tener cualquier valor
    }

    public void setB( int b )
    {
        // El atributo b puede tener cualquier valor
    }

    public void setC( int c )
    {
        // El atributo c puede tener cualquier valor
    }

    public int getA()
    {
        return 0;
    }

    public int getB()
    {
        return 0;
    }

    public int getC()
    {
        return 0;
    }

    // Metodos de instancia
    public int getDiscriminante()
    {
        return 0;
    }

    public double getRaiz1()
    {
        if ( getDiscriminante() < 0 )
            return 0.0;

        return (-b + Math.sqrt( getDiscriminante() )) / (2 * a);
    }

    public double getRaiz2()
    {
        if ( getDiscriminante() < 0 )
            return 0.0;

        return 0.0;
    }

    // Sobreescribir metodo toString()
    public String toString()
    {
        String resultado = String.format("Ecuacion Cuadratica: a=%d, b=%d, c=%d", a, b, c);
        return resultado;
    }
}