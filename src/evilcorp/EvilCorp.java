
package evilcorp;

import empleado.Empleado;
import java.util.Scanner;


public class EvilCorp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        int contador =0;
        Empleado[] empleados = new Empleado[10];
        
        do{
            
        System.out.println("---------------------------------MENU EMPLEADO---------------------------------------");
        
        System.out.println("");
        System.out.println("---1.AGREGAR EMPLEADO.");
        System.out.println("---2.BUSCAR EMPLEADO.");
        System.out.println("---3.MOSTRAR EMPLEADO.");
        System.out.println("---4.CALCULAR SALARIO.");
        System.out.println("---5.SALIR.");
        System.out.println("");
         System.out.print("----------------------------------DIGITE UNA OPCION:   ");
       
         opcion = entrada.nextInt();
         
        
         switch(opcion){
             case 1:
                 System.out.println("Registro de empleado: ");
                 System.out.println("");
                 
                 empleados[contador]=new Empleado();
                 empleados[contador].setId(contador);
                 
                 System.out.println("Digite el nombre: ");
                 empleados[contador].setNombre(entrada.next());
                 
                  System.out.println("Digite el cargo: ");
                 empleados[contador].setCargo(entrada.next());
                 
                 System.out.println("Digite las horas semanales:  ");
                 empleados[contador].setHoraSemanales(entrada.nextDouble());
                 
                 empleados[contador].setSalario(0);
                 
                 contador++;
                 
                 break;
             case 2:
                 System.out.println("entro a la opcion 2");
                 break;
             case 3:
                 System.out.println("Base de datos empleados");
                 System.out.println("");
                 
                 for (int i=0; i < contador ; i++){
                       System.out.print("Id: " + empleados[i].getId()); 
                       System.out.print("  nombre: " + empleados[i].getNombre());
                       System.out.print("  cargo: " + empleados[i].getCargo());
                        System.out.print("  horas: " + empleados[i].getHoraSemanales());
                        System.out.println("");
                 }
                 
                 break;
             case 4:
                 System.out.println("entro a la opcion 4");
                 break;
             case 5:
                 System.exit(0);
                 break;
             
             
             default:
                 break;
         }
        
        } while(opcion != 5);
        
      
        
    }
}
