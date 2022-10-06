package Chapter03;

import java.util.InputMismatchException;
import java.util.Scanner;



public class chapter02 {

    public static void main(String ags[]) {

        Scanner scan = new Scanner(System.in);

        // 2번 문제
//
//        int n [][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
//
//        for(int[] x : n){
//            for(int m : x){
//                System.out.print(m+" ");
//            }
//            System.out.println();
//        }

        // 4번 문제


//        char k = scan.next().charAt(0);
//        for(int i =97; i<=(int)(k); i++){
//            System.out.println((char)i);
//        }
//

        // 5번 문제

//        int[] k = new int[10];
//
//        for(int i =0; i<10;i++){
//            k[i]=scan.nextInt();
//        }
//
//        for(int a : k){
//            if(a%3==0){
//                System.out.print(a+" ");
//            }
//        }

        // 8번 문제
//
//        int count = scan.nextInt();
//
//        ArrayList<Integer> k= new ArrayList<>();
//
//        while(true){
//           if(k.size()==count){
//               break;
//           }
//           int input = (int)(Math.random()*100+1);
//
//           if(k.contains(input)!=true){
//               k.add(input);
//           }
//           else{
//               continue;
//           }
//
//
//        }
//
//        for(int i :k){
//            System.out.println(i);
//        }


//        // 9번 문제
//
//        int[][] k = new int[4][4];
//
//        for(int i =0; i<4; i++){
//            for(int j=0; j<4; j++){
//                k[i][j]= (int) (Math.random()*10+1);
//            }
//        }
//
//        for(int[] i : k){
//            for(int j:i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // 10번 문제


//        int[][] k = new int[4][4];
//
//        int count = 0;
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//
//               k[i][j] = (int)(Math.random()*10+1);
//
//            }
//        }
//
//
//
//        while(check(k)<6){
//
//                int i = (int)(Math.random()*4);
//                int j = (int)(Math.random()*4);
//
//                k[i][j]=0;
//
//            }
//
//
//        for(int[] i : k){
//            for(int j : i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//    }

        // 10번 메서드
//    static int check(int[][] m) {
//        int zero = 0;
//
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m.length; j++) {
//                   if( m[i][j]==0){
//                       zero+=1;
//                   }
//            }
//        }
//        return zero;
//    }


        // 15번 문제

        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.print(x*y);
        }catch(InputMismatchException e){
            System.out.print("error input again");
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.print(x*y);
        }


    }




    }

