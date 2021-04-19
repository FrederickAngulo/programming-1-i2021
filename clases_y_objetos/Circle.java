/**
 * Guardar y calcular informacion acerca de un circulo
 * 
 * @author Sivana Hamer
 * @version 19-04-2021
 */
public class Circle {
    //Atributos
    //El radio del circulo
    private double ratio;

    //Contructores
    /**
     * Circle constructor with the ratio
     * 
     * @param ratio The ratio of the circle
     */
    public Circle(double ratio){
        this.ratio = ratio;
    }

    //Metodos
    /**
     * Obtains the area of the circle
     * 
     * @return The circle's area
     */
    public double getArea(){
        //area = PI * r^2
        double area = Math.PI * this.ratio * this.ratio;
        return area;
    }

    /**
     * Obtains the perimeter of the circle
     * 
     * @return The circle's perimeter
     */
    public double getPerimenter(){
        // Circunferencia = 2 * PI * r
        return 2 * Math.PI * this.ratio; 
    }

    /**
     * Prints the circle's information (ratio, area and perimeter)
     */
    public void print() {
        //Imprimir el radio
        System.out.println("The circle's ratio is: " + this.ratio);
        //Imprimir el area
        System.out.println("The circle's area is: " + this.getArea());
        //Imprimir el perimetro
        System.out.println("The circle's perimeter is: " + this.getPerimenter());
    }
}