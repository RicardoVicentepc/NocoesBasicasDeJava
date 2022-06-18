import java.util.Scanner;

public class vetorInvertido {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int res=0, reverse=0,num;
       System.out.println("Insira o número...");
        num = in.nextInt();
        while(num!=0){
            res = num % 10;
            reverse = reverse*10+res;
            num=num/10;
        }
        System.out.println(reverse);
    
    }
}
