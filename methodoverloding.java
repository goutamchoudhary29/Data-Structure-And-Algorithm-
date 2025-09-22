public class methodoverloding {
    
public static void main(String[] args) {
    Calculater calcu =new Calculater();
    System.out.println(calcu.sum(5, 15));
    System.out.println(calcu.sum((float)1.5, (float)2.5));
    System.out.println(calcu.sum(2, 5, 41));
    
}

}
class Calculater{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }

int sum(int a ,int b,int c){
    return a+b+c;
}
}