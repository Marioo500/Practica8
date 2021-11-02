package practica8;

public class Cerdo extends Animal{
    
    public Cerdo(String nombre, int edad){
        super(nombre, edad);
    }
        @Override
    public void eat(){
        System.out.println(name + "está comiendo zanahorias");
    }
    
    public void chillido(){
        System.out.println(name + "hace oink oink");
    }
}
