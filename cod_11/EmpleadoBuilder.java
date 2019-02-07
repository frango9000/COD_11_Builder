package cod_11;
//@author fsancheztemprano
public class EmpleadoBuilder {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int dia;
    private int mes;
    private int anho;
    private float altura;
    private float pie;
    private float diametro;
    private float sueldo;
    private String dni;
    private String cargo;
    private String formacion;

    public EmpleadoBuilder(String nombre, String apellido1, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    public EmpleadoBuilder setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }
    

}
