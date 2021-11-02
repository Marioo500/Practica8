package practica8;

public class Animal {
     String name;
     int age;
     boolean vacunado;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void eat(){
        System.out.println(name +" está comiendo");
    }
    
    public void sleep(){
        System.out.println(name + " está durmiendo");
    }
    
    public void setVacunacion(boolean vacunado){
        this.vacunado = vacunado;
    }
}
