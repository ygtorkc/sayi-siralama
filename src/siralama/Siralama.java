package siralama;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        b = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        c = input.nextInt();
       if ((a>b)&&(a>c)){
           if(b<c)
           System.out.println("b<c<a");
           else {
               System.out.println("c<b<a");
           }
       }
        if ((b>a)&&(b>c)){
            if(a<c)
                System.out.println("a<c<b");
            else {
                System.out.println("c<a<b");
            }
        }
        if ((c>b)&&(c>a)){
            if(b<a)
                System.out.println("b<a<c");
            else {
                System.out.println("a<b<c");
            }
        }
    }
}
