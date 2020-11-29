package listasenlazadas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 public class ListasEnlazadas {

     public static void main(String[] args) {
         // TODO code application logic here
         Scanner leer=new Scanner (System.in);
         ListaEnlazada Lista=new ListaEnlazada();
         int opc=0;
         int elemento;
         do{
             System.out.println("~~~~~~~Menú listas enlazadas~~~~~~~");
             System.out.println("1.- Agregar al inicio");
             System.out.println("2.- Agregar al final");
             System.out.println("3.- Mostrar");
             System.out.println("4.- Eliminar en inicio");
             System.out.println("5.- Eliminar en final");
             System.out.println("6.- Eliminar un elemento especifico");
             System.out.println("7.- Salir");
             System.out.print("Ingrese una opcion: ");
             opc=leer.nextInt();
             switch(opc){
                     case 1:
                         System.out.print("Ingresa el Elemento al inicio: ");
                         elemento=leer.nextInt();
                         Lista.agregarInicio(elemento);
                         break;
                     case 2:
                         System.out.print("Ingresa el Elemento al final: ");
                         elemento=leer.nextInt();
                         Lista.agregarFinal(elemento);
                         break;                     
                     case 3:
                         Lista.Mostrar();
                         System.out.println();                        
                         break;
                     case 4:
                        elemento=Lista.BorrarIn();
                         break;
                     case 5:
                         elemento=Lista.BorrarFin();
                         break;
                     case 6:
                         System.out.print("Ingresa el elemento a eliminar: "); 
                         elemento=leer.nextInt();
                         Lista.Eliminar(elemento);
                         break;
                     case 7:
                         System.out.println("El programa ha finalizado");
                         break;
                     default:
                        System.out.println("La opción que elegiste es incorrecta");
                 
                 }
             }while(opc!=7);
         }
}
