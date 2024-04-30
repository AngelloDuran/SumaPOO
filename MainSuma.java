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
        // sm.sumar(a, b);
        System.out.println(p1.sumar());
        System.out.println(ing.toString());
    }

}
