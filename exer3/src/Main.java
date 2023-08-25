// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Zumbi zum1 = new Zumbi();
        Zumbi zum2 = new Zumbi();

        zum1.vida = 30;
        zum2.vida = 100;

        System.out.println("Vida do zumbi zum1: " + zum1.vida);
        System.out.println("Vida do zumbi zum2: " + zum2.vida);

        zum1 = zum2;
        System.out.println("Vida do zumbi z1: " + zum1.vida);
        System.out.println("Vida do zumbi z2: " + zum2.vida);
        }
    }