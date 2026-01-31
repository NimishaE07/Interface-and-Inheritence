class Animal {
    void sound(){
        System.out.println("tigerr");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal{
    void bark()
    {
        System.out.println("Cat meow meow ");
    }
}
class P3
 {
    public static void main(String[] args) 
    {
        Dog dg = new Dog();
        Cat ct = new Cat();
        
        dg.sound();
        dg.bark();
        ct.bark();
    }
}