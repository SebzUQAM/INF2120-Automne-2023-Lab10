import Echec.ArbreBinaire;

public class Main {
    public static void main(String[] args) {
        ArbreBinaire<Integer> ab = new ArbreBinaire<>();
        Integer[] integers = creerTableInt(10);
        for (int i=0; i<integers.length; i++){
            ab.inserer(integers[i]);
        }

        System.out.println( ab.chercherHauteur(integers[1]) );
        System.out.println(ab.contient(10000));
    }

    private static Integer[] creerTableInt(int length){
        Integer[] integers = new Integer[length];
        for (int i=0; i<length;i++){
            integers[i] = (int)(Math.random() *100.0);
        }
        return integers;
    }
}