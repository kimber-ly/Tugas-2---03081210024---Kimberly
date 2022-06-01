import java.util.Scanner;
import balokk.balok;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hitunglah volume sebuah balok!\n");
        Scanner keyboard = new Scanner(System.in);

        balok balok1 = new balok();

        System.out.println("Masukkan nilai P: ");
        balok1.P = keyboard.nextInt();
        
        System.out.println("Masukkan nilai L: ");
        balok1.L = keyboard.nextInt();

        System.out.println("Masukkan nilai t: ");
        balok1.t = keyboard.nextInt();

        balok1.HitungVolume();
        keyboard.close();
    }
}
