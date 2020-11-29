package listasenlazadas;
import java.util.Scanner;
class ListaEnlazada {
     NodoLista cima,fin;
     
     public ListaEnlazada(){
     cima=null;
     fin=null;
     }
     public boolean ListaVacia(){
      if(cima==null){
          return true;
      }else{
          return false;
      }
     }
     public void agregarInicio(int elemento){
      cima= new NodoLista(elemento,cima);
      if (fin==null){
          fin=cima;
      }
     }  
     public void agregarFinal(int elemento){
      if(!ListaVacia()){
          fin.Siguiente=new NodoLista (elemento);
          fin=fin.Siguiente;
          }else{
          cima=fin=new NodoLista (elemento);
      }
     }
     public void  Eliminar(int elemento){
      if (!ListaVacia()){
          if(cima==fin && elemento==cima.Dato){
              cima=fin=null;
          }else{
              NodoLista anterior,aux;
              anterior=cima;
              aux=cima.Siguiente;
              while(aux!=null){
                  anterior=anterior.Siguiente;
                  aux=aux.Siguiente;
              }
              if(aux!=null){
                  anterior.Siguiente=aux.Siguiente;
                  if(aux==fin){
                      fin=anterior;
                  }
               }
             }
          }
     }
     public void Mostrar(){
         NodoLista recorrer=cima;
         System.out.println();
         while(recorrer!=null){
             System.out.print("["+recorrer.Dato+"]--");
             recorrer=recorrer.Siguiente;
         }
     }
     public int BorrarIn(){
         int elemento=cima.Dato;
         if(cima==fin){
             cima=null;
             fin=null;
         }else{
             cima=cima.Siguiente;
      }
      return elemento;
  }
  public int BorrarFin(){
      int elemento=fin.Dato;
      if(cima==fin){
          cima=fin=null;
      }else{
          NodoLista aux=cima;
          while(aux.Siguiente!=fin){
              aux=aux.Siguiente;
          }
          fin=aux;
          fin.Siguiente=null;
      }
      return elemento;
  }
  
}          
