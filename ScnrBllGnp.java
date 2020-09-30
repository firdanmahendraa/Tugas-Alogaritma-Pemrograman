
import java.util.Scanner;

public class ScnrBllGnp {
    public static void main(String[] args){
        int input;
            boolean isTrue = false;
            Scanner user = new Scanner(System.in);
    System.out.println("Masukkan angka: ");
        input = user.nextInt();
        if (input % 2 == 0){
            System.out.println(input + " Adalah Bilangan Genap");
        }else {
            System.out.println(input + " Adalah Bilangan Ganjil" );
        }
    }
}
