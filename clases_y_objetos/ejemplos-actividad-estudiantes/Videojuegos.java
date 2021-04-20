public class Videojuegos {
    /** 
     * Atributos
    */
    private String nombre;
    private String genero;

    /**
     * Constructor
     */
    public Videojuegos(String nombre, String genero){
        this.nombre=nombre;
        this.genero=genero;
    }
    /**
     * Métodos
     */
    public void print(){
        System.out.println("Este videojuego es" + this.nombre);
        System.out.println("Es de" + this.genero);
    }
}