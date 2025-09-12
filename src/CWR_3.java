import java.util.Scanner;

public class CWR_3 {
    byte DSA;
    byte TOC;
    byte DM;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        for (int i = 0; i < t; i++) {
            CWR_3 DRAGON = new CWR_3();
            CWR_3 SLOTH = new CWR_3();

            DRAGON.DSA = sc.nextByte();
            DRAGON.TOC = sc.nextByte();
            DRAGON.DM = sc.nextByte();
            SLOTH.DSA = sc.nextByte();
            SLOTH.TOC = sc.nextByte();
            SLOTH.DM = sc.nextByte();

            if ((DRAGON.DSA + DRAGON.TOC + DRAGON.DM) > (SLOTH.DSA + SLOTH.TOC + SLOTH.DM)) {
                System.out.println("DRAGON");
            } else if ((DRAGON.DSA + DRAGON.TOC + DRAGON.DM) < (SLOTH.DSA + SLOTH.TOC + SLOTH.DM)) {
                System.out.println("SLOTH");
            } else {
                if (DRAGON.DSA > SLOTH.DSA) {
                    System.out.println("DRAGON");
                } else if (DRAGON.DSA < SLOTH.DSA) {
                    System.out.println("SLOTH");
                } else {
                    if (DRAGON.TOC > SLOTH.TOC) {
                        System.out.println("DRAGON");

                    } else if (DRAGON.TOC < SLOTH.TOC) {
                        System.out.println("SLOTH");
                    } else {
                        System.out.println("TIE");
                    }
                }
            }
        }
    }
}