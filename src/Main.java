import Echec.ArbreBinaire;

public class Main {
    public static void main(String[] args) {
        ArbreBinaire<Integer> ab = new ArbreBinaire<>();
        Integer[] integers = creerTableInt(10);
        for (int i=0; i<integers.length; i++){
            ab.inserer(integers[i]);
        }

        System.out.println( integers[0] );
        int index = 5;
        System.out.println( integers[index] );
        System.out.println( ab.chercherHauteur(integers[index]) );
        System.out.println(ab);

        System.out.println(ab.trier());
    }

    private static Integer[] creerTableInt(int length){
        Integer[] integers = new Integer[length];
        for (int i=0; i<length;i++){
            integers[i] = (int)(Math.random() *100.0);
        }
        return integers;
    }
}