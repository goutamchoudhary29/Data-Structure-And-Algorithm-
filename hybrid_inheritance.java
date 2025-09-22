public class hybrid_inheritance {
    public static void main(String[] args) {
        Human jay = new Human();
        jay.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}

class fish extends Animal {

}

class bird extends Animal {

}

class Mammal extends Animal {

}

class tuna extends fish {

}

class shark extends fish {

}

class peacock extends bird {

}

class dog extends Mammal {

}

class cat extends Mammal {

}

class Human extends Mammal {

}