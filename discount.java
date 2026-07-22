import java.util.*;
 public class discount{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double count = 0;
       if (c >=1000) {
    count = 5;
} else if (c >=2000) {
    count = 7;
} else if (c >=3000) {
    count = 8;
} else if(c>=6000) {
    count = 10;
}
else{
    count = 0;
}
//double a=c/count;
System.out.println("you have discount");
System.out.println("your discount amount" + c/count);
System.out.println("payble amunt " + (c - (c/count)));
    }
}

