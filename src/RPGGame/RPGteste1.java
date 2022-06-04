package RPGGame;
import java.util.Random;
import java.util.Scanner;

public class RPGteste1 {

    static int ataqueUsuario() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha seu ataque :");
        System.out.println("(1) - Soco :");
        System.out.println("(2) - Especial:");
        return leitor.nextInt();
    }

    static int ataqueAdversario() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void imprimeHp(int hpUsuario, int hpAdversario) {
        int contagemEspecial = 5;
        System.out.println("================");
        System.out.println("HP Usuario :" + hpUsuario);
        System.out.println("(HP Adversario :" + hpAdversario);
        System.out.println("(Especiais Restantes :" + contagemEspecial);
        System.out.println("================");
    }
        static void batalha() {
            int hpUsuario = 150;
            int hpAdversario = 15;
            int escolhaAtaque;

            while (hpUsuario > 0 && hpAdversario > 0) {
                imprimeHp(hpUsuario, hpAdversario);
                escolhaAtaque = ataqueUsuario();
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("(Usuario usou soco :");
                        hpAdversario -= 7;
                        break;
                    case 2:
                        System.out.println("(Usuario usou Especial :");
                        hpAdversario -= 10;
                        break;
                    default:
                        System.out.println("(Opcao invalida :");
                        break;
                }
                if (hpAdversario > 0) {
                    escolhaAtaque = ataqueAdversario();
                    switch (escolhaAtaque) {
                        case 1:
                            System.out.println("(Adversario usou Soco :");
                            hpUsuario -= 2;
                            break;
                        case 2:
                            System.out.println("(Adversario usou Chute :");
                            hpUsuario -= 5;
                            break;
                        case 3:
                            System.out.println("(Adversario usou Especial :");
                            hpUsuario -= 8;
                            break;
                    }
                } else {
                    System.out.println("(Adversario Derrotado");
                }
            }
        }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int continua = 1;
        while (continua == 1) {

            batalha();
            System.out.println(" Fim de jogo, Deseja continuar ? (1) Sim (2) Nao :");
            continua = leitor.nextInt();
        }
    }
}

