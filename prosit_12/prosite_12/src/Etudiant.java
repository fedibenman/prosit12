import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Etudiant {
    private int id;
    private String nom;
    private int age;

    // Constructeur sans paramètre
    public Etudiant() {}

    // Constructeur avec paramètres
    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Etudiant{id=" + id + ", nom='" + nom + "', age=" + age + "}";
    }
}
