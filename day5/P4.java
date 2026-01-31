class Animal {
    void sound(){
        System.out.println("tigerr");
    }
}
class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog");
    }
}
class P4 {
    public static void main(String[] args){
        Dog dg = new Dog();
        dg.sound();
    }
}
    