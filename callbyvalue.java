public class callbyvalue {
    public static void value(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value of a"+  a);
        System.out.println("value of b"+ b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        value(a,b);
    }
    
}
