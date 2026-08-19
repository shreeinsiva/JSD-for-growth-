import java.util.*;
public class task3
{
    public static void  main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter two no ");
        long n = s.nextLong();
        long sum =0;
        long res = 0;
        int count = 0;
        int odd = 0;
        String even = "";
        //String odd ="";
        while(n!=0){
            sum=n%10; 
            n=n/10;
            res = sum;
            if(res%2==0){
            even = res + "";
            System.out.print(even);
            count++;
            }
        }

           // System.out.println(res + " even no is "+count); 
           
        
        //System.out.println("even no is "+count);
        //System.out.print("odd no is "+odd);
      
    
        
    }
}





