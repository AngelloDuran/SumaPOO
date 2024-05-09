import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingresa el primero numero");
        int a = ing.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = ing.nextInt();

        Suma p1 = new Suma();
        p1.setA(a);
        p1.setB(b);
        p1.sumar(a, b);
        p1.getA();
        p1.getB();
        p1.getR();
        System.out.println("El resultado es :" + p1.sumar(a, b));
        System.out.println(p1.toString());
        System.out.println(ing.toString());

    }

}
