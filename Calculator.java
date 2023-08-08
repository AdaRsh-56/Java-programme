import java.util.Scanner;
 class Calculator {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number a : ");
         int a = sc.nextInt();
         System.out.println("enter the number b : ");
         int b = sc.nextInt();
         System.out.println("enter the operator : ");
         int operator = sc.nextInt();
         //logic

         switch (operator){
             case 1:

                 System.out.println(a+b);
                 break;
             case 2:

                 System.out.println(a-b);
                 break;
             case 3:

                 System.out.println(a/b);
                 break;
             case 4:

                 System.out.println(a%b);
                 break;

         }
     }
}
