/**
 * @author Frederick Angulo, Rachell Casanova, Freddy Godínez
 * @version 19-04-2021
 */
public class Curso{
    //Atributo
    /**
     * Asigna nota
     */
    private int nota;

    //Constructor
    public Curso(int nota){
        this.nota= nota;
    }
    //Metodo
    public void print(){
        System.out.println("La nota del curso es"+this.nota);
    }

}
