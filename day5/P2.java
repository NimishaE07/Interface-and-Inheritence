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
class Human extends Dog{
    void eat(){
        System.out.println("eating");
    }
}
class P2 {
    public static void main(String[] args) {
        Human hu = new Human();
        hu.sound();
        hu.bark();
        hu.eat();
    }

}