/**
 * @author Frederick Angulo, Rachell Casanova, Freddy Godínez
 * @version 19-04-2021
 */
public class Student {
    //Atributos
    /** 
     * Nombre del estudiante y del curso
    */
    private String name;
    private String curso;

    //Constructor 
    /**
    * Crea el nombre y asigna el curso
    */
    public Student(String name){
        this.name="Maria";
        this.curso= "Programacion1";
    }
    //Metodo
    /**
    * Imprime el nombre y curso
    */
    public void print(){
        System.out.println("Hola soy"+this.name);
        System.out.println("Estoy matriculado en el curso"+this.curso)
    }
} 
