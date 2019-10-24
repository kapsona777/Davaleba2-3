package BTU;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface klas {
    Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    public static void print(){
        for (int i=a; i<=b; i++){ System.out.println(i);}
    }
    public static void print_2(){
        for (int i=1; i<=a; i++){
            if (a%i==0) {System.out.println(i);}
        }
    }
    public static void print_3(){
        List nums=new ArrayList();
        for (int i=1; i<=b; i++){
            if (b%i==0){
                for (int j=1; j<i; j++){
                    if (i%j==0){
                        nums.add(i);
                    }
                    if (nums.size()==2){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
