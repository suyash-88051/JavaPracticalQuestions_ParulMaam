import java.util.Scanner;
class Complex {
    int x,y;

    public Complex() {
    }
    public Complex(int a,int b) {
        this.x = a;
        this.y = b;
    }

    public String toString()
    {
        if(y>=0)
        return x+" + "+y+"i";
        else
            return x+" - "+(-1*y)+"i";
    }
    public static Complex ADD(Complex a,Complex b)
    {
        Complex C= new Complex();
        C.x = a.x + b.x;
        C.y = a.y + b.y;
        return C;
    }
    public static Complex MUL(Complex a,Complex b)
    {
        Complex C= new Complex();
        C.x =((a.x * b.x)-(a.y * b.y));
        C.y =((a.y * b.x)+(a.x * b.y));
        return C;
    }
}
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("\n\n\n");
        System.out.println("\t\t\tENTER COMPLEX NUMBER");
        System.out.println();
        System.out.print("Real and imaginary part of Complex number 1 : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print("Real and imaginary part of Complex number 2 : ");
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println();

        Complex C1= new Complex(a,b);
        Complex C2= new Complex(c,d);

        System.out.println("\t\t\tORIGINAL NUMBERS\n");
        System.out.println("\t\t\t     "+C1.toString());
        System.out.println("\t\t\t     "+C2.toString());
        System.out.println();

        Complex ad=Complex.ADD(C1,C2);
        Complex mu=Complex.MUL(C1,C2);

        System.out.println("Addition of entered numbers       : "+ad.toString());
        System.out.println("Multiplication of entered numbers : "+mu.toString());
        System.out.println();
        System.out.println("\t\t\tProgram ENDED\n\n");

    }
}