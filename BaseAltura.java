import java.util.Scanner;

public class BaseAltura {
    public static void main(String[] args){
        //Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro.
        double base, altura, calArea, CalPerimetro;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a base!");
        base = in.nextDouble();
        System.out.println("Insira a altura!");
        altura = in.nextDouble();

        calArea = base * altura;
        System.out.println("Area = " + calArea);

        CalPerimetro = base + base + altura + altura;
        System.out.println("Perimetro = " + CalPerimetro);
        in.close();
    }
}
