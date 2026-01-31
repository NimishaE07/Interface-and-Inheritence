class Animal {
    void sound(){
        System.out.println("tigerr");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks");
    }
}
class P1 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound();
        dg.bark();
    }

}