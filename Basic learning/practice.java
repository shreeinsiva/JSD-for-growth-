import java.util.*;
class practice{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c =0;
    for(int i=0;i<=n;i++){
       if(i%2==0){
        c=c+i;
        System.out.print(i+ "+");
       }
    }
    System.out.print("\b="+c);

   
}
}