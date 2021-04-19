/**
 * Perro que guarda su nombre y ladra.
 * 
 * @author Sivana Hamer
 * @version 19-04-2021
 */
public class Dog {
    //Atributos
    //El nombre del perro
    private String name;

    //Constructor
    /**
     * Crea el perro con el nombre.
     * 
     * @param name El nombre del perro.
     */
    public Dog(String name){
        this.name = name;
    }

    //Metodos

    /**
     * Obtiene el nombre del perro
     * 
     * @return El nombre del perro
     */
    public String getName(){
        return this.name;
    }

    /**
     * Imprime el nombre del perro
     */
    public void printName(){
        System.out.println("BARK BARK! Soy " + this.name);
    }

    /**
     * Ladrar
     */
    public void bark(){
        System.out.println("BARK!");
    }

}
