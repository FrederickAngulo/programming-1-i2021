/**
 * Dueño del perro
 */
public class Owner{
    //Atributos
    //El nombre del dueño
    private String name;
    //Perro firulais
    private Dog firulais; 

    //Constructor
    /**
     * Crea el dueño con su nombre y perro
     * 
     * @param name
     */
    public Owner(String name){
        this.name = name;
        this.firulais = new Dog("Firulais");
    }

    //Metodos
    /**
     * Imprime la introduccion del dueño y su perro.
     */
    public void print(){
        System.out.println("Hola! Soy " + this.name);
        // System.out.println("Mi perro se llama " );
        System.out.println("Saludelos " + this.firulais.getName());
        this.firulais.printName();
        this.firulais.bark();
    }
}