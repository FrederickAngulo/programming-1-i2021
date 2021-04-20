public class Jugador {
    /**
     *Atributos  
    */  
    private String nombre;
    private Videojuegos juego;
    private int edad;

    /**
     * Constructor
     */
    public Jugador(String nombre, int edad){
        this.nombre=nombre;
        this.juego=new Videojuegos("Fire Emblem", "Rol Tactico");
        this.edad=edad;
    }
     /**
     * Métodos
     */
    public void print(){
        System.out.println("Mi nombre es" + this.nombre);
        System.out.println("Estoy jugando" + this.juego);

}
