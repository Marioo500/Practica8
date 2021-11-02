
package practica8;

public class Practica8 {

    public static void main(String[] args) {
        
     /*  Animal a = new Animal(pturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad")CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
        Perro p = new Perro(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
        Gato g = new Gato(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
        
        a.eat(); //clase principal
        a.sleep();//clase principal
        
        p.eat();//clase principal
        p.sleep(); //clase secundaria
        
        g.eat();//clase principal
        g.sleep();//clase secundaria 
        */

      /*Animal animal = new Perro(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
      animal.sleep();
      animal.eat();*/
      
      /*Animal[] animales = new Animal[3];
      animales[0] = new Animal(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
      animales[1] = new Perro(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
      animales[2] = new Gato(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
      
      for(Animal a: animales){
          a.eat();
          a.sleep();
          if(a instanceof Perro perros){
              perros.ladrar(); 
          }
      }*/
      
     int op;
      Zoologico zoo = new Zoologico();
      do{
        System.out.println("Que desea hacer: ");
        System.out.println("1) Añadir animal");
        System.out.println("2) Eliminar animal");
        System.out.println("3) Mostrar animales");
        System.out.println("4) Salir");
        op = CapturarEntrada.capturarEntero("Opcion");
        switch(op){
         case 1:{
             zoo.agregarAnimal(CapturarEntrada.capturarCadena("Animal a agregar"));
            break;
            }
         case 2:{
             zoo.quitarAnimal();
             break;
            }
         case 3:{
             zoo.imprimirAnimales();
             break;
            }
        }
        }while(op!=4);
    }
}
