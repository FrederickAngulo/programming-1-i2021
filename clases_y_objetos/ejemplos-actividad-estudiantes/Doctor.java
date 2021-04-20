
/**
 * 
 * Clase Doctor, que mostrara los datos de este y de los pacientes
 * @author Harold, Erick, Jimmy
 * @version 19-4-2021
 */

public class Doctor {
   
    private String name; //Nombre del doctor
    private Paciente paciente1; //Primer paciente
    private Paciente paciente2; //Segundo paciente

    /**
     * 
     *Constructor para la clase Doctor 
     *
     * @param name El nombre del doctor
     */
    public Doctor(String name){
        this.name = name;
        paciente1= new Paciente("Jorge", 27); 
        paciente2= new Paciente("Eduard", 19);
    }
    
    /**
     * Metodo para imprimir el nombre del doctor y los datos de los paciente
     * 
     */
    public void IntroducePatient(){
        
        System.out.println("Soy el doctor " + this.name + ", mi paciente es " + paciente1.getName());
        System.out.println(this.paciente1.getName() + " Te podes presentar");
        paciente1.introduceOnSelf();
        System.out.println("Mi paciente 2 es " + this.paciente2.getName() + ", te podes presentar.");
        paciente2.introduceOnSelf();

        System.out.print("El estado del paciente 1 es: ");
        paciente1.estadoDelPaciente();
        System.out.print("El estado del paciente 2 es: ");
        paciente2.estadoDelPaciente();
    }

}
