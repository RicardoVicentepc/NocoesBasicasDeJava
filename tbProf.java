import java.util.Scanner;

public class tbProf{
public static void main(String[] args) {
    /*
         * Criar um programa que calcule o salário líquido de um professor. Para fazer
         * esse programa você deverá ler o
         * valor da hora aula e o número de aulas dadas no mês. O salário líquido será
         * obtido multiplicando-se o número
         * de aulas dadas pelo valor da hora aula e descontando o percentual do INSS
         * conforme tabela abaixo:
         * 
         */
        int horaAula, aulaDada;
         double salario, percentual; 
         Scanner in = new Scanner(System.in);
         
         //gerar hora dadas
         System.out.println("Insira sua hora de aulas dadas..");
         horaAula = in.nextInt();
        //gerar aulas dadas
         System.out.println("Insira a aulas dadas no mês..");
         aulaDada = in.nextInt();

         //Calcular Salário.
         salario = horaAula * aulaDada;

        //Comparar Aliquota
        if(salario <= 1212.00){
            percentual = (7.50 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }else if(salario >= 1212.01 && salario <= 2427.35){
            percentual = (9.0 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }else if(salario >= 2427.36 && salario <= 3641.03){
            percentual = (12.0 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }else if(salario >= 3641.04 && salario <= 7067.22){
            percentual = (14.0 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }else if(salario >= 7087.23 && salario <= 12136.79){
            percentual = (14.50 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }else if(salario >= 12136.80 && salario <= 24273.57){
            percentual = (16.5 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }else if(salario >= 24273.58 && salario <= 47333.46){
            percentual = (19.0 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }else if(salario > 47333.46){
            percentual = (22.0 * salario) / 100;
            System.out.println("Seu salário = " + salario );
            System.out.println("Desconto aliquota = " + percentual );
            salario = salario - percentual;
            System.out.println("Seu salário atualizado = " + salario);
         }
         in.close();
}
}