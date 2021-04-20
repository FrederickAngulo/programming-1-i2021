/**
 * Puestos de una empresa 
 *@author Breyner,Gabriel y Sebastian
* @version 19-04-2021
*/
public class Puestos {
    //Atributos
    //Nombre del puesto y quien trabaja
    private String puesto;
    private Empleado Juan;

    // Constructor 
    /**
     * Crea el puesto y el nombre del empleado que trabaja
     * @param puesto
     */
    public puesto (String puesto){
        this.puesto = puesto;
        this.Juan = new Empleado("Juan");
    }

    //Metodos
    /*
    *Imprime la introduccion del puesto y del empleado 
    */
    public void print(){
        System.out.println("Este puesto es" + this.puesto);
        System.out.println("Se va a presentar el empleado" + this.juan.getname();
        this.juan.printname();
    }


}
