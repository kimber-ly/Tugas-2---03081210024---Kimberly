package balokk;

public class balok {
    public static int P = 0, L = 0, t = 0;
    public static int HitungVolume(){
        return P*L*t;
    }
    public static void DisplayVolume(){
        System.out.println("Volume balok adalah " + balok.HitungVolume());
    }
}
