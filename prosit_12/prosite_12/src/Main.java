import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        EtudiantManagement management = new EtudiantManagement();
        List<Etudiant> etudiants = new ArrayList<>(Arrays.asList(
            new Etudiant(1, "Alice", 22),
            new Etudiant(2, "Bob", 24),
            new Etudiant(3, "Charlie", 20)
        ));

        // Affichage des étudiants
        System.out.println("Liste des étudiants :");
        management.displayStudents(etudiants, System.out::println);

        // Affichage des étudiants par filtre (âge > 21)
        System.out.println("\nÉtudiants ayant plus de 21 ans :");
        management.displayStudentsByFilter(etudiants, e -> e.getAge() > 21, System.out::println);

        // Retour des noms des étudiants
        System.out.println("\nNoms des étudiants :");
        String noms = management.returnStudentsNames(etudiants, Etudiant::getNom);
        System.out.println(noms);

        // Création d'un nouvel étudiant
        Etudiant nouveau = management.createStudent(() -> new Etudiant(4, "David", 23));
        etudiants.add(nouveau);
        System.out.println("\nNouveau étudiant ajouté : " + nouveau);

        // Tri des étudiants par ID
        System.out.println("\nÉtudiants triés par ID :");
        management.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        management.displayStudents(etudiants, System.out::println);

        // Conversion en Stream
        System.out.println("\nUtilisation d'un Stream :");
        Stream<Etudiant> stream = management.convertToStream(etudiants);
        stream.forEach(System.out::println);
    }
}
