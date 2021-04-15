public class School {
    public static void main ( String [] args ){
        // Create Student Pedro
        Student student1 = new Student ();
        student1.name = " Pedro ";
        student1.id = " D10010 ";

        // Create Student Ana
        Student student2 = new Student ();
        student2.name = " Ana ";
        student2.id = " M10010 ";

        // Print students
        student1.print ();
        student2.print ();
    }
}