package practica8;

public class Gallina extends Animal{
    
    public Gallina(String nombre, int edad){
        super(nombre, edad);
    }
        @Override
    public void eat(){
        System.out.println(name + "está comiendo maiz");
    }
    
    public void cacarear(){
        System.out.println(name + "cacarea por las mañanas");
    }
    
}
