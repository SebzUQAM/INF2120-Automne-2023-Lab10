package Echec;

public class Pair<T, T1> {
    public T1 deuxieme;
    public T1 premiere;

    public Pair(T1 premiere, T1 deuxieme) {
        this.deuxieme = deuxieme;
        this.premiere = premiere;
    }
}
