import java.util.*;

public class Zahlen {

    private int[] zahlen = new int[30];

    public Zahlen() {
    }

    public static void main(String[] args) {

        Zahlen zahlen = new Zahlen();
        zahlen.fuellen();
        zahlen.print(zahlen.getZahlen());
        int[] even = zahlen.getEven(zahlen.getZahlen());
        zahlen.print(even);
    }

    private void fuellen() {

        Random random = new Random();

        for (int i = 0; i < zahlen.length; i++) {

            int r = (random.nextInt(100));
            zahlen[i] = r;
        }
    }

    private void print(int[] zahlen) {

        for (int j : zahlen) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }


    private int[] getEven(int[] zahlen) {

//        int[] even = new int[zahlen.length];
//
        List<Integer> evenNumbers = new ArrayList<>();

        for (int j : zahlen) {
            ;
            if (j % 2 == 0) {
                evenNumbers.add(j);
            }
        }

        int[] result = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {

            result[i] = evenNumbers.get(i);
        }
        return result;
    }

    public int[] getZahlen() {
        return zahlen;
    }
}
