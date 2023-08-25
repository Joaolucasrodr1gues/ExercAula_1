public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (vida > quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        } else {
            System.out.println("Não é possivel transferir: "
                    + quantia + " pois a vida é de: " + vida);
            return false;
        }
    }
}