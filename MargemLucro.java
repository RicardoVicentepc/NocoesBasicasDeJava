import java.util.Scanner;

public class MargemLucro {
    public static void main(String[] args) {
        double produto, margemLucro, valorVenda, lucro;
        int x;
        Scanner in = new Scanner(System.in);
        do{

            System.out.println("Insira o Preço do Produto!");
            produto = in.nextDouble();
            System.out.println("Insira a Porcentagem da Margem de lucro ");
            margemLucro = in.nextDouble();
            //calculo 
            lucro = produto - margemLucro;
            valorVenda = (produto * margemLucro) / 100;
            System.out.println("Sua Preço de venda é "+valorVenda);

            System.out.println("Deseja terminar o programa? Não-2 Sim-1");
            x = in.nextInt();
         }while(x <= 1 || x == 1);
         System.out.println("Fim do programa!!");

       in.close();

    }
}
