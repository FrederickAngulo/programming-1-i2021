/**
 * @author David Meléndez, Gerardo Azofeifa, Franz Pfeiffer, Anthony Salas
 */

public class Control {
    public boolean onAndOff;


    public Control (){
        onAndOff = false;
    }

    public boolean getValue (){
        return onAndOff;
    }

    public void encenderTelevisor (){
        onAndOff = true;
    }
}