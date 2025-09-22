public class Strings{
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
public static float findshortestpath(String path){
    int x=0,y=0;

for(int i=0;i<path.length();i++){
    char dir =path.charAt(i);
    //south
    if(dir == 'S'){
        y--;
    }
    //north
    else if(dir == 'N'){
        y++;
    }
    //west
    else if(dir =='W'){
        x--;
    }
    //east
    else{
        x++;
    }

}
int X2=x*x;
int Y2=y*y;
return (float)Math.sqrt(X2+Y2);
}
public static String substring(String str,int si, int ei){
    String substr ="";
    for(int i=si;i<ei;i++){
        substr+=str.charAt(i);
    }
    return substr;
}

//convert letters to uppercase
public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");

    char ch =Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length();i++){
        if (str.charAt(i)==' '&& i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

//string compression mean convert less the size of string
public static String compress(String str){
    String newStr ="";

    for(int i=0;i<str.length()-1;i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        count++;
        i++;
    }
    newStr += str.charAt(i);
    if(count>1){
        newStr+=count.toString();
    }
}

return newStr;}



public static void main(String args[]){

    // String firstName ="Goutam";
    // String lastName ="Choudhary";
    // String fullName =firstName +" "+lastName;

    // printLetters(fullName);
    // String str="noon";
    // System.out.println(isPalindrome(str));

    // String path="WNEENESENNN";
    // System.out.println(findshortestpath(path));

    // String str="Hello World";
    // System.out.println(str.substring(0,6));//find substring direct by sub.substing(0,5) 
    // System.out.println(substring(str, 2, 6));


    // String str="goutam choudhary"; 
    // System.out.println(toUpperCase(str));

    String str ="aaaaahhhhhuuuuuuuuuuooo";
    System.out.println(compress(str));
}}