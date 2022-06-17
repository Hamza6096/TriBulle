import java.util.List;

public class Trieur {
    public static <E> void trier(List<E> liste, Comparateur<E> comparateur) {
        int size = liste.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (comparateur.comparer(liste.get(j), liste.get(j + 1)) > 0) {
                    E temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
    }
}