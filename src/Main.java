import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        ArrayList<Livre> livres = new ArrayList<>(List.of(
                new Livre("Maman Hamza et ses gâteaux"),
                new Livre("La cuisine grasse"),
                new Livre("Anthony les bonnes brioches"),
                new Livre("la cave de Cédric"),
                new Livre("Julien à L'EPHAD ")
        ));

        Trieur.trier(livres,(livre1,livre2)-> livre1.titre.compareToIgnoreCase(livre2.titre));
        System.out.println(livres);

    }
}

