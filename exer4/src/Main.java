public class Main{

    public static void main(String[] args){

        Zumbi zum1 = new Zumbi();
        Zumbi zum2 = new Zumbi();

        zum1.vida = 30;
        zum2.vida = 450;

        System.out.println("Vida do zumbi zum1: " + zum1.vida);
        System.out.println("Vida do zumbi zum2: " + zum2.vida);

        if(zum1.transfereVida(zum2, 70)){
            System.out.println("Fazendo zum1 transferir 70 para zum2");
            System.out.println("Vida do zumbi zum1: " + zum1.vida);
            System.out.println("Vida do zumbi zum2: " + zum2.vida);
        }


        if(zum1.transfereVida(zum2, 150)){
            System.out.println("Fazendo zum1 transferir 150 para z2");
            System.out.println("Vida do zumbi zum1: " + zum1.vida);
            System.out.println("Vida do zumbi zum2: " + zum2.vida);
        }else{
            System.out.println("A vida não foi alterada!!");
        }


    }


}