public class mutliples {

    public static void main(String[] args) {
        Bear b =new Bear();
        b.eatMeat();
        b.eatPlant();
    }
}
interface Herbivore {
void eatPlant();    
}
interface Carnivore{
void eatMeat();
}
class Bear implements Herbivore,Carnivore{
public void eatPlant(){
    System.out.println("Bear eats palnts");
}
public void eatMeat(){
    System.out.println("Bear eats meat");
}

}