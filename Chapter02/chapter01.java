package Chapter02;

import java.util.Scanner;

public class chapter01 {

    public static void main(String args[]){

        // 1 번

        Scanner scan = new Scanner(System.in);

//        System.out.print("입력:");
//        int a = scan.nextInt();
//        System.out.println("$"+a/1100);


        // 2 번

//        int a = scan.nextInt();
//        if(a/10 == a%10){
//            System.out.print("같다");
//        }

        // 3 번
//
//        int a = scan.nextInt();
//
//        System.out.println(a/50000);
//        a = a%50000;
//
//        System.out.println(a/10000);
//        a = a%10000;
//
//        System.out.println(a/1000);
//        a = a%1000;
//
//        System.out.println(a%500);
//        a = a%500;
//
//        System.out.println(a/100);
//        a = a%100;
//
//        System.out.println(a/50);
//        a = a%50;
//
//        System.out.println(a/10);

          // 9번

        int a = scan.nextInt();
        int b = scan.nextInt();
        Double r = scan.nextDouble();

        int x = scan.nextInt();
        int y = scan.nextInt();

        if(Math.pow(a-x,2) + Math.pow(b-y,2) < Math.pow(r,2)){
            System.out.println("내부에 존재.");
        }





    }
}
