import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingresa el primero numero");
        int a = ing.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = ing.nextInt();
        int r = a - b;
        System.out.println("El resultado es:" + r);
    }

}
