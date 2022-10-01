import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("birbirinden farklı üç sayı giriniz");
        System.out.print("a= ");
        a = input.nextDouble();
        System.out.print("b= ");
        b = input.nextDouble();
        System.out.print("c= ");
        c = input.nextDouble();

        if (a < b && a < c) {

            if (b < c) {
                System.out.println(a + "<" + b + "<" + c+"   (a<b<c)");
            } else {
                System.out.println(a + "<" + c + "<" + b+"   (a<c<b)");
            }

        } else if (b < a && b < c) {


            if (a < c) {
                System.out.println(b + "<" + a + "<" + c+"   (b<a<c)");
            } else {
                System.out.println(b + "<" + c + "<" + a+"   (b<c<a)");
            }


        } else {


            if (b < a) {
                System.out.println(c + "<" + b + "<" + a+"   (c<b<a)");
            } else {
                System.out.println(c + "<" + a + "<" + b+"   (c<a<b)");
            }


        }


    }
}