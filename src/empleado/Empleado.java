
package empleado;


public class Empleado {
    //Atributos=variables = datos
    
   private int id;
   private String nombre;
   private String cargo;
   private double horaSemanales;
   private int salario;
   
   //Metodos=accion=funcion especial
   
       public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getHoraSemanales() {
        return horaSemanales;
    }

    public void setHoraSemanales(double horaSemanales) {
                
        if (horaSemanales <0){
            System.out.println("Formato invalido de hora");
        }else{
             this.horaSemanales = horaSemanales;
        }
        
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {   
        this.salario = salario;
    }

    //constructor
    public Empleado() {
    }
       
    //Metodos=Acciones=Funciones
public int calcularSalario(double horas, int valorHora){
    
    
    
    return 0;
    
}
 
}
