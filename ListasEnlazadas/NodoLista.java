package listasenlazadas;

public class NodoLista {
     int Dato;
     NodoLista Siguiente;
     
     public NodoLista (int d){
       this.Dato=d;
       this.Siguiente=null;
}
   public NodoLista (int d,NodoLista n){
       Dato=d;
       Siguiente=n;
   }
    
}
