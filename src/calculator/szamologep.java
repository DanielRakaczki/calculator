package calculator;

import java.util.Scanner;

public class szamologep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char valasz = ' ';

        do {
            int a = readInt();
            System.out.println("Kérem a műveleti jelet: ");
            char op = input.next().charAt(0);
            int b = readInt();
            double c = 0.0;
            boolean ok = true;

            switch(op){
                case '+': c = a + b; break;
                case '-': c = a - b; break;
                case '/':
                    if (b!=0){
                        c = (double) a / b;
                        break;
                    } else {
                        System.out.println("0 val nem elhet osztani");
                        ok = false;
                        break;
                    }
                case '*': c = a * b; break;
                default:
                    System.out.println("Nem definiált mávelet");
                    break;
            }
            if (ok){
                System.out.println("Eredmeny: "+a+" "+op+" "+b+" = "+c);
            }
        }
        while(valasz == 'y' || valasz == 'Y' || valasz == 'i' || valasz == 'I');
    }

    public static int readInt(){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Enter a number:");
        while(input.hasNextInt()){
        }
        return n;
    }
}
