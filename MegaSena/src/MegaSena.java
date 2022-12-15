import java.awt.*;
import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        Random generate = new Random();


        // Usando while a forma mais atual
//        int i = 0;
//        while (i < 6) {
//            int number = generate.nextInt(60);
//            System.out.println(number);
//            i++;

        // Usando for mais antigo
        for(int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}