/**
* empleados de una empresa y sus puestos
* @author Breyner,Gabriel y Sebastian
* @version 19-04-2021
*/
public class Empleados {
    //Atributos 
    // El nombre del empleado y el puesto en la empresa 
    private String name;

    // Constructor 
    /**
     * Crea del nombre del empleado
     * @param nombre 
     */
    public Empleado(String name){
        this.name = name;
    }
    //Metodos
    /**
     * Imprime el nombre del empleado 
     * 
     */
    public void printname(){
        System.out.println("Mi nombre es " + this.name)
    }
    public String getname(){
        return this.name;
    }
}

