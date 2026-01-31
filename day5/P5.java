class Animal {
    Animal(){
        System.out.println("tigerr");
    }
}
class Dog extends Animal {
    Dog(){
        super();
    }
    void sound(){
        System.out.println("Dog");
    }
}
class P5 {
    public static void main(String[] args){
        Dog dg = new Dog();
        dg.sound();
    }
}
    
    