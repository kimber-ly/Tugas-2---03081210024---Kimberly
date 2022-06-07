import java.util.Scanner;
import balokk.balok;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hitunglah volume sebuah balok!\n");
        Scanner keyboard = new Scanner(System.in);

        balok balok1 = new balok();
        
        System.out.print("Masukkan nilai P: ");
        balok1.P = keyboard.nextInt();
        
        System.out.print("Masukkan nilai L: ");
        balok1.L = keyboard.nextInt();

        System.out.print("Masukkan nilai t: ");
        balok1.t = keyboard.nextInt();

        balok1.DisplayVolume(); 
        for(int j = 1; j <= balok1.HitungVolume(); j++){
            if(j%2 == 0){
                System.out.print(j + " ");
            }
        }
        keyboard.close();
    }
}
