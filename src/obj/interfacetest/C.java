package obj.interfacetest;

// Class 'C' must either be declared abstract or implement abstract method 'eat()' in 'interfaceA' interfaceB
public class C implements interfaceA,interfaceB {
    public void show(){
        System.out.println("show");
    }

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }
}
