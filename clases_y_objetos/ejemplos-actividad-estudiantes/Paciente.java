/**
 * Clase paciente la cual imprime los datos del paciente 
 * y el estado en que este se encuentra
 * @author Harold, Erick, Jimmy
 * @version 19-4-2021
 */

public class Paciente {
    private String name; //Nombre del paciente
    private int edad; //Edad del paciente

    /**
     * Constructor para la clase paciente
     * @param name el nombre del paciente
     * @param edad la edad del paciente
     */
    public Paciente(String name, int edad){
        this.name= name;
        this.edad= edad;
    }

    /**
     * Metodo get que permite conseguir el nombre del paciente
     * @return devuelve el nombre del paciente
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
     * Imprime el estado en que se encuentra el paciente
     */
    public void estadoDelPaciente(){
        int numero = (int) (Math.random() * 3) + 1; //numero aleatorio entre 1 y 3
    
        switch(numero){ //Segun el numero aleatorio se ejecutara algun caso, mostrando el estado del paciente
            case 1:
                System.out.println("Se encuentra feliz");
                break;
            case 2:
                System.out.println("Se encuentra nervioso");
                break;
            case 3: 
                System.out.println("Se encuentra triste");
            break;                        
        }
    }

      /**
     * 
     * Metodo que permite al paciente introducirse, imprimiendo sus datos
     */
    public void introduceOnSelf(){
        System.out.println("Mi nombre es " + this.name + ", y mi edad es " + this.edad);

    }

}
