import java.util.Scanner;
public class Programme7 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Bonjour, veillez entrer un nombre ");
            int nombreSaisi = sc.nextInt();

            if (nombreSaisi >= 0) {
                System.out.println("L'entier Saisie est positif");
            }
            else if (nombreSaisi < 0) {
                System.out.println("L'entier Saisie est negatif");
            }
            else {
                System.out.println("Le nombre saisi est null");
            }
        }

    }
}
