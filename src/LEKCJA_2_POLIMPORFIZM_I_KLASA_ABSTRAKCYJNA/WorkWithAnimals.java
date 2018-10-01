package LEKCJA_2_POLIMPORFIZM_I_KLASA_ABSTRAKCYJNA;
public class WorkWithAnimals{
    int justaNum = 10;
    public static void main(String[]args)
    {
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);
        int randNum = 10;
        
        fido.changeVar(randNum);
        System.out.println("randNum after method call: "+randNum);
        
        changeObjectName(fido);
        System.out.println("Nazwa psa po zmianie obiektu "+ fido.getName());
        
        Animal doggy = new Dog();
        Animal kitty = new Cat();
        System.out.println("Doggy says: "+doggy.getSound());
        System.out.println("Kitty says: "+kitty.getSound());
        
        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;
        System.out.println("Doggy says: "+animals[0].getSound());
        System.out.println("Kitty says: "+animals[1].getSound());
        
   //     Dog dog = new Dog();
   //     dog.digHole();// dziala
        speakAnimal(doggy);
        ((Dog) doggy).digHole();        // mozna uzyc rzytowania , bo inaczej nie da sie dotrzec do obiektu.
 //       System.out.println(justaNum); metoda musi byc statyczna
 // sayHello();         metoda musi byc statyczna
 
        fido.accessPrivate(); // tu mozemy poprzez metode publiczna dotrzec do prywatnej
        
        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());
        
        
    }
    
    public static void changeObjectName(Dog fido)
    {
        fido.setName("Marcus");// referencja
    }
    public void sayHello()
    {
        System.out.println("costam");
    }
    public static void speakAnimal(Animal randAnimal)
    {
        System.out.println("Animal says "+randAnimal.getSound());
    }

   
}
