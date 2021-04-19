/**
 * Se encarga de guardar un punto con sus coordenadas
 */
public class Point {
    //Atributos
    //Eje en x
    private double x;
    //Eje en y
    private double y;

    //Constructor
    /**
     * Metodo que inicializa las coordenadas del punto
     * @param x La coordenada en x del punto
     * @param y La coordenada en y del punto
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Metodos
    /**
     * Imprimir las coordenadas del punto
     */
    public void imprimir(){
        System.out.println("El punto tiene como coordenada en X: " + this.x);
        System.out.println("El punto tiene como coordenada en Y: " + this.y);
    }

    /**
     * Retorna la x del punto
     * 
     * @return La coordenada en X
     */
    public double getX(){
        return this.x;
    }

    // public void setX(double x){
    //     this.x = x;
    // }

    
    /**
     * Retorna la y del punto
     * 
     * @return La coordenada en Y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Obtiene la distancia entre dos puntos
     * 
     * @param p2 El otro punto
     * @return La distancia entre este punto y el otro
     */
    public double getDistance(Point p2){
        double distance = Math.sqrt(pow((p2.getX() - this.x),2) + Math.pow((p2.getY() - this.y), 2));
        return distance;
    }
}