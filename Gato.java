
package practica8;

public class Gato extends Animal{
    
        public Gato(String name, int age){
        super(name,age);
        
        }
       
        @Override
        public void eat(){
            System.out.println("Gato " + name + " está comiendo whiskas");
        }
        
        public void maullar(){
            System.out.println("Gato " + name + " hace miau");
        }
}
