package practica8;
import java.util.ArrayList;

public class Zoologico {
    
    private ArrayList<Animal> animales = new ArrayList<>();
    private Veterinario v = new Veterinario(CapturarEntrada.capturarCadena("Nombre del veterinario"),CapturarEntrada.capturarDoble("Salario"));
    
    public void agregarAnimal(String animal){
        
        animal = animal.trim().toLowerCase();
        Animal a = null;
        switch(animal){
            case "perro" -> {
             a = new Perro(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
             break;
            }
            case "gato" -> {
             a = new Gato(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
             break;
            }
            case "caballo" -> {
              a = new Caballo(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad")); 
              break;
            }
            case "vaca" -> {
                a = new Vaca(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
                break;
            }
            case "pollo" -> {
                a = new Gallina(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
                break;
            }
            case "cerdo" -> {
                a = new Cerdo(CapturarEntrada.capturarCadena("Nombre"),CapturarEntrada.capturarEntero("Edad"));
                break;
            }
            default -> {
                System.out.println("No se encontro ningun animal");
            }
        }
        if(a != null){
            animales.add(a);
        }
    }
    
    public void imprimirAnimales(){
        for(Animal a: animales){
            a.eat();
            a.sleep();
            v.vacunar(a);
            v.revisarAnimal(a);
            if(a instanceof Perro){
                ((Perro)a).ladrar();
            }
            else if(a instanceof Gato){
                ((Gato)a).maullar();
            }
            else if(a instanceof Caballo){
                ((Caballo)a).relinchar();
            }
            else if(a instanceof Cerdo){
                ((Cerdo)a).chillido();
            }
            else if(a instanceof Gallina){
                ((Gallina)a).cacarear();
            }
            else if(a instanceof Vaca){
                ((Vaca)a).mugir();
            }
            System.out.println();
        }
    }
    
    public void quitarAnimal(){
        int i = 1, op;
        
        for(Animal a: animales){
            
            System.out.println("Numero del animal: " + i);
            System.out.print(a.name + "\n");
            i++;
        }
        op = CapturarEntrada.capturarEntero("Introduzca el numero del animal que desea eliminar");
        animales.remove((op-1));
        System.out.println("Animal borrado exitosamente");
    }
}
