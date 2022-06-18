import java.util.Scanner;

public class somaC {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        final int TAM =3;
        int i, a[], b[], c[];
        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];


        //vetor A
        for(i=0; i<TAM; i++) {
            System.out.println("Digite os "+(i+1)+" vetores A");
            a[i] = in.nextInt();
        }
        //vetor B
        for(i=0; i<TAM; i++) {
            System.out.println("Digite os "+(i+1)+" vetores B");
            b[i] = in.nextInt();
            //soma dos vetores
             c[i] = a[i] + b[i];
        }
        
        //vetor C
        System.out.print("\n C = ");
        System.out.print("[ ");
        for(i=0; i<TAM; i++) {
            System.out.print(c[i] + "  ");
        }
        System.out.print("] ");
        
    }

}
