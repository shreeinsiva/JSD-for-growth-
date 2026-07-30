import java.util.*;
class task1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char count = 0;
        int al =0;
        int num =0;
        int spl = 0;
        for(int i=0;i<name.length();i++){
            count = name.charAt(i);
            if(count>='a' && count<='z'){
                al++;
            }
            else if(count>='0' && count<='9'){
                num++;
            }
            else if(count=='@'){
                spl++;
            }
            }
        System.out.println(al);
        System.out.println(num);
        System.out.println(spl);
    }
}
    
