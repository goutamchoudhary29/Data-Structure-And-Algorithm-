import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
 Scanner sc =new Scanner(System.in);
float pencil=sc.nextFloat();
float pen =sc.nextFloat();
float eraser= sc.nextFloat();

float Total = pencil+pen+eraser;
float gst =(Total*18)/100;
float Bill = gst+Total;
System.out.println(gst);
System.out.println("Total Bill price");
System.err.println(Total+gst);

}}