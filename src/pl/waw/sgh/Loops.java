package pl.waw.sgh;

public class Loops {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("I=" + i);
        }

        for (int i = 6; i > 1; i--) {
            if (i == 5) continue;
            //continue : skip the number. so it will skip the number '5'
            System.out.println("I=" + i);
            if (i == 4) break;
        }

        int j = 0;
        while (j < 6) {
            System.out.println("J=" + j);
            j++;
        }
        System.out.println();
        int k = 0;
        do {
            System.out.println("K=" + k);
            k--;
        } while (k > 2);
    }
}
