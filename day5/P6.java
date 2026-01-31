class Animal {
    void run(){
        System.out.println("tigerr");
    }
}
class Dog extends Animal {
    Dog(){
        super.run();
    }
    void sound(){
        System.out.println("Dog");
    }
}
class P6{
    public static void main(String[] args){
        Dog dg = new Dog();
        dg.sound();
    }
}
    
    