public class Calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt((args[1]));  // Valor 1
        int y = Integer.parseInt((args[2]));  // Valor 2

        if(args[0].equals("somar")) {   // (0 SOMA) DE 1x e 2y
            sum(x, y);
        }
        else if (args[0].equals("subtrair")) {  // 0 = SUBTRAÇÃO DE 1X e 2Y
            minus(x, y);
        }
        else if (args[0].equals("dividir")) {   // DIVISÃO DE 1 e 2
            division(x, y);
        }
        else if (args[0].equals("multiplicar")) {  // MULTIPLICAÇÃO DE 1 e 2
            multiply(x, y);
        }
    }

    static void sum (int x, int y) {
        System.out.println(x + y);
    }

    static void minus (int x, int y) {
        System.out.println(x - y);
    }

    static void division (int x, int y) {
        System.out.println(x / y);
    }

    static void multiply (int x, int y) {
        System.out.println(x * y);
    }
}
